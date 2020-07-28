package com.wang.springboot.config;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;

/**
 * @author 王一宁
 * @date 2020/7/28 9:46
 */
public class ElasticSearchConfig{
    @Bean
    public RestHighLevelClient restHighLevelClient(){
        RestHighLevelClient	client = new RestHighLevelClient(
                RestClient.builder(
                        new HttpHost("localhost",9200,"http")));
        return client;
    }
}
