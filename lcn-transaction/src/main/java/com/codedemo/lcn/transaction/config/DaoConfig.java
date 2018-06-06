package com.codedemo.lcn.transaction.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

/**
 * @Describe: 数据库配置
 * @Author: linjuanjuan
 * @Date: 2018/6/6 20:38
 * @Version: 1.0
 */
@MapperScan(basePackages = {"com.codedemo.lcn.transaction.dao.mapper"})
@Configuration
public class DaoConfig {

    private static final String MAPPER_LOCATION = "classpath*:sqlmap/*.xml";

    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(MAPPER_LOCATION));
        SqlSessionFactory sqlSessionFactory  = sqlSessionFactoryBean.getObject();
        return sqlSessionFactory;
    }

}
