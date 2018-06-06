package com.codedemo.lcn.service1.dao.mapper;

import com.codedemo.lcn.service1.dao.model.ServiceA;
import com.codedemo.lcn.service1.dao.model.ServiceAExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServiceAMapper {
    int countByExample(ServiceAExample example);

    int deleteByExample(ServiceAExample example);

    int deleteByPrimaryKey(String serviceAId);

    int insert(ServiceA record);

    int insertSelective(ServiceA record);

    List<ServiceA> selectByExample(ServiceAExample example);

    ServiceA selectByPrimaryKey(String serviceAId);

    int updateByExampleSelective(@Param("record") ServiceA record, @Param("example") ServiceAExample example);

    int updateByExample(@Param("record") ServiceA record, @Param("example") ServiceAExample example);

    int updateByPrimaryKeySelective(ServiceA record);

    int updateByPrimaryKey(ServiceA record);
}