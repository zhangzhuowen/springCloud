package com.navinfo.springcloud;

import myRule.ZzwRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author zhangZhuoWen
 * @ClassName DeptConsumer_80
 * @date 2021/2/4 11:22
 * @Description TODO
 */
@SpringBootApplication
//Ribbon和Eureka整合以后，客户端可以直接调用，不用关系ip地址和端口号
@EnableEurekaClient
//在微服务启动的时候就能去加载我们自定义的Ribbon类
@RibbonClient(name = "SPRINGCLOUD-PROVIDER-DEPT",configuration = ZzwRule.class)
public class DeptConsumer_80 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_80.class, args);
    }
}
