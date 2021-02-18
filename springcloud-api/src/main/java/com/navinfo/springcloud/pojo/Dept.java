package com.navinfo.springcloud.pojo;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author zhangZhuoWen
 * @ClassName Dept
 * @date 2021/1/31 13:03
 * @Description TODO
 */

@Data
@NoArgsConstructor
@Accessors(chain = true)  //链式写法
public class Dept implements Serializable {
    private Long deptno;
    private String dename;
    //这个数据存在哪个数据库的字段，微服务，一个服务对应一个数据库，同一个信息可能存在不同的数据库
    private String db_source;

    public Dept(String dename) {
        this.dename = dename;
    }


    /**
     * 链式写法
     *
     * Dept dept = new Dept();
     * dept.setDeptNo(11).setDname().....
     *
     */

}
