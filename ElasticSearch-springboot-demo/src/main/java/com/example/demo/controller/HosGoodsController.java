package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.search.SearchType;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.sort.SortOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.HosGoodsService;
import com.example.demo.dto.HosGoods;

@RestController
public class HosGoodsController {

	@Autowired
	private HosGoodsService hosGoodsService;
	
	@Autowired
	private TransportClient transportClient;
	
	@GetMapping("/getGoodsList")
	@ResponseBody
    public String getList(){
		
		List<Map<String, Object>> list = new ArrayList<>();
        Integer totalCount = 0;
 
        QueryBuilder query = QueryBuilders.boolQuery();
        
        int pageIndex = (1 - 1) * 10;
        
       // query = QueryBuilders.boolQuery()
           //     .must(QueryBuilders.matchPhraseQuery("factory_id", "6341"));
        SearchResponse rs = transportClient.prepareSearch("hosgoods").setTypes("doc")	
                .setSearchType(SearchType.DFS_QUERY_THEN_FETCH)		//这里非常重要,当初就是因为类型填写错误,导致查询出超出预计结果的数据
                .setQuery(query)				//查询条件
                .addSort("factory_id", SortOrder.DESC)	//排序,DESC为倒序
                .setFrom(pageIndex).setSize(10)		//数据的索引(从0开始)和查询条数
                .setExplain(true).execute().actionGet();
        
        
		return rs.toString();
    }
	
	@RequestMapping("/")
	public String query(){
		
		
		return "hello word";
	}

}
