package com.codedemo.lcn.service2.dao.mapper;

import com.codedemo.lcn.service2.dao.model.ServiceB;
import com.codedemo.lcn.service2.dao.model.ServiceBExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServiceBMapper {
    int countByExample(ServiceBExample example);

    int deleteByExample(ServiceBExample example);

    int deleteByPrimaryKey(String serviceBId);

    int insert(ServiceB record);

    int insertSelective(ServiceB record);

    List<ServiceB> selectByExample(ServiceBExample example);

    ServiceB selectByPrimaryKey(String serviceBId);

    int updateByExampleSelective(@Param("record") ServiceB record, @Param("example") ServiceBExample example);

    int updateByExample(@Param("record") ServiceB record, @Param("example") ServiceBExample example);

    int updateByPrimaryKeySelective(ServiceB record);

    int updateByPrimaryKey(ServiceB record);
}