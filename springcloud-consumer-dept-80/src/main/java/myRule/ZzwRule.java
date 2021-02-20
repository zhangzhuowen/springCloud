package myRule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhangZhuoWen
 * @ClassName ZzwRule
 * @date 2021/2/20 9:50
 * @Description TODO
 */
//不能和主启动类同级，扫描到了就会把默认的覆盖掉，这个@RibbonClient是给某个应用（即Eurake的服务）指定一个策略
//放到类路径下就会变成全局，这里只是单针对一个服务
@Configuration
public class ZzwRule {

    @Bean
    public IRule myRule() {
        return new ZzwRandomRule();
    }

}
