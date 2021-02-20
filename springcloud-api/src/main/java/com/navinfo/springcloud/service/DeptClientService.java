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
@FeignClient(value = "SPRINGCLOUD-PROVIDER-DEPT")
@Component
public interface DeptClientService {

    @PostMapping("/dept/add")
    public boolean addDept(Dept dept);

    @GetMapping("/dept/get/{id}")
    public Dept queryById(@PathVariable("id") Long id);

    @GetMapping("/dept/list")
    public List<Dept> queryAll();
}
