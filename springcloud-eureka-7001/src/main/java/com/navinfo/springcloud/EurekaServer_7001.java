package com.navinfo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author zhangZhuoWen
 * @ClassName EurekaServer_7001
 * @date 2021/2/4 14:11
 * @Description TODO
 */
//启动之后，访问 http://127.0.0.1:7001/
@SpringBootApplication
//服务端的启动类，可以接受别人注册进来~
@EnableEurekaServer
public class EurekaServer_7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_7001.class,args);
    }
}
