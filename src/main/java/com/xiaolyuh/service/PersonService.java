package com.xiaolyuh.service;

import com.github.pagehelper.Page;
import com.xiaolyuh.domain.model.Person;

import java.util.List;

/**
 * Created by Administrator on 2018/3/6.
 */
public interface PersonService {
    List<Person> findAll();

    /**
     * 分页查询
     * @param pageNo 页号
     * @param pageSize 每页显示记录数
     * @return
     */
    Page<Person> findByPage(int pageNo, int pageSize);

    void insert(Person person);
}
