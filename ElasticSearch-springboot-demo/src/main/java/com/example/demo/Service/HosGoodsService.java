package com.example.demo.Service;

import java.util.List;

import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.HosGoodsRepository;
import com.example.demo.dto.HosGoods;


@Service
public class  HosGoodsService {

	@Autowired 
	private HosGoodsRepository hosGoodsRepository;
	
	/**
     * 根据地址值过滤
     * @return
     */
    public List<HosGoods> queryByAddress() {
        // 根据地址值过滤
        Pageable page = new PageRequest(0,10);
        BoolQueryBuilder queryBuilder = QueryBuilders.boolQuery();
        queryBuilder.must(QueryBuilders.matchQuery("FACTORY_ID","7673"));
        SearchQuery query =
                new NativeSearchQueryBuilder().withQuery(queryBuilder).withPageable(page).build();
        Page<HosGoods> pages = hosGoodsRepository.search(query);
        return pages.getContent();
    }
}
