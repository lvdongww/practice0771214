package com.kgc.dubbo.service;

import com.kgc.dubbo.pojo.Person;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-12-14 18:50
 */
public interface HrManagerService {
    List<Person> selectByAll();
    int add(Person person);
    int del(Integer id);
}
