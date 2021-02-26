package com.navinfo.springcloud.dao;

import com.navinfo.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zhangZhuoWen
 * @ClassName DeptDao
 * @date 2021/2/3 17:12
 * @Description TODO
 */
@Mapper
@Repository
public interface DeptDao {

    public boolean addDept(Dept dept);

    public Dept queryById(Long id);

    public List<Dept> queryAll();
}
