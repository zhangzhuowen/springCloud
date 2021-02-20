package com.navinfo.springcloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhangZhuoWen
 * @ClassName ConfigBean
 * @date 2021/2/4 10:33
 * @Description TODO
 */
@Configuration
public class ConfigBean {

    //配置负载均衡实现RestTemplate
    @LoadBalanced//Ribbon
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
