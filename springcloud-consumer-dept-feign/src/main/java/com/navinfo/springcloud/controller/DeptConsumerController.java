package com.navinfo.springcloud.controller;

import com.navinfo.springcloud.pojo.Dept;
import com.navinfo.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author zhangZhuoWen
 * @ClassName DeptConsumerController
 * @date 2021/2/3 17:52
 * @Description TODO
 */
@RestController
public class DeptConsumerController {
    @Autowired
    private DeptClientService service = null;

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return this.service.queryById(id);
    }

    @RequestMapping("/consumer/dept/add")
    public boolean add(Dept dept) {
        return this.service.addDept(dept);
    }

    @RequestMapping("/consumer/dept/list")
    public List<Dept> list(Dept dept) {
        return this.service.queryAll();
    }
}
