package com.navinfo.springcloud.service;

import com.navinfo.springcloud.pojo.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @author zhangZhuoWen
 * @ClassName DeptClientService
 * @date 2021/2/20 10:23
 * @Description TODO
 */

/**
 *
 * 服务熔断和降级的区别
 * 服务熔断—>服务端：某个服务超时或异常，引起熔断~，类似于保险丝(自我熔断)
 * 服务降级—>客户端：从整体网站请求负载考虑，当某个服务熔断或者关闭之后，服务将不再被调用，此时在客户端，我们可以准备一个 FallBackFactory ，返回一个默认的值(缺省值)。会导致整体的服务下降，但是好歹能用，比直接挂掉强。
 * 触发原因不太一样，服务熔断一般是某个服务（下游服务）故障引起，而服务降级一般是从整体负荷考虑；管理目标的层次不太一样，熔断其实是一个框架级的处理，每个微服务都需要（无层级之分），而降级一般需要对业务有层级之分（比如降级一般是从最外围服务开始）
 * 实现方式不太一样，服务降级具有代码侵入性(由控制器完成/或自动降级)，熔断一般称为自我熔断。
 * 熔断，降级，限流：
 *
 * 限流：限制并发的请求访问量，超过阈值则拒绝；
 *
 * 降级：服务分优先级，牺牲非核心服务（不可用），保证核心服务稳定；从整体负荷考虑；
 *
 * 熔断：依赖的下游服务故障触发熔断，避免引发本系统崩溃；系统自动执行和恢复
 *
 *
 */
@FeignClient(value = "SPRINGCLOUD-PROVIDER-DEPT",fallbackFactory = DeptClientServiceFallBackFactory.class)
@Component
public interface DeptClientService {

    @PostMapping("/dept/add")
    public boolean addDept(Dept dept);

    @GetMapping("/dept/get/{id}")
    public Dept queryById(@PathVariable("id") Long id);

    @GetMapping("/dept/list")
    public List<Dept> queryAll();
}
