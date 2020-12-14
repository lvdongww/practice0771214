package com.kgc.dubbo.hrmanagerprovider.service;

import com.kgc.dubbo.hrmanagerprovider.mapper.PersonMapper;
import com.kgc.dubbo.pojo.Person;
import com.kgc.dubbo.service.HrManagerService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-12-14 18:52
 */
@Component
@Service
public class HrManagerServiceImpl implements HrManagerService {
    @Resource
    PersonMapper personMapper;
    @Override
    public List<Person> selectByAll() {
        return personMapper.selectByExample(null);
    }

    @Override
    public int add(Person person) {
        return personMapper.insertSelective(person);
    }

    @Override
    public int del(Integer id) {
     return  personMapper.deleteByPrimaryKey(id);
    }
}
