package com.example.demo.Repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

import com.example.demo.dto.HosGoods;


public interface  HosGoodsRepository extends ElasticsearchRepository<HosGoods, String>{

}
