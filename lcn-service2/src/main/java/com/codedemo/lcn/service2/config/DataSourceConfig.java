package com.codedemo.lcn.service2.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @Describe: 数据源配置
 * @Author: linjuanjuan
 * @Date: 2018/6/6 20:38
 * @Version: 1.0
 */
@Configuration
public class DataSourceConfig {

    @Value("${druid.datasource.driverClassName}")
    private String driverClassName;

    @Value("${druid.datasource.url}")
    private String url;

    @Value("${druid.datasource.username}")
    private String userName;

    @Value("${druid.datasource.password}")
    private String password;

    @Value("${druid.datasource.initialSize}")
    private int initialSize;

    @Value("${druid.datasource.minIdle}")
    private int minIdle;

    @Value("${druid.datasource.maxActive}")
    private int maxActive;

    @Value("${druid.datasource.maxWait}")
    private long maxWait;

    @Value("${druid.datasource.timeBetweenEvictionRunsMillis}")
    private long timeBetweenEvictionRunsMillis;

    @Value("${druid.datasource.minEvictableIdleTimeMillis}")
    private long minEvictableIdleTimeMillis;

    @Value("${druid.datasource.validationQuery}")
    private String validationQuery;

    @Value("${druid.datasource.testWhileIdle}")
    private boolean testWhileIdle;
    @Value("${druid.datasource.testOnBorrow}")
    private boolean testOnBorrow;

    @Value("${druid.datasource.testOnReturn}")
    private boolean testOnReturn;

    @Value("${druid.datasource.filters}")
    private String filters;

    @Value("${druid.datasource.poolPreparedStatements}")
    private boolean poolPreparedStatements;

    @Value("${druid.datasource.maxPoolPreparedStatementPerConnectionSize}")
    private int maxPoolPreparedStatementPerConnectionSize;

    @Bean
    public DruidDataSource dataSource() throws SQLException {
        DruidDataSource dataSource = new DruidDataSource();

        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(url);
        dataSource.setUsername(userName);
        dataSource.setPassword(password);
        //配置初始化大小、最大、最小
        dataSource.setInitialSize(initialSize);
        dataSource.setMinIdle(minIdle);
        dataSource.setMaxActive(maxActive);
        //配置获取连接等待超时的时间
        dataSource.setMaxWait(maxWait);
        //配置间隔多久才进行一次检测，检测需要关闭的空闲连接，单位是毫秒
        dataSource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
        //配置一个连接在池中最小生存的时间，单位是毫秒
        dataSource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
        //
        dataSource.setValidationQuery(validationQuery);
        dataSource.setTestWhileIdle(testWhileIdle);
        dataSource.setTestOnBorrow(testOnBorrow);
        dataSource.setTestOnReturn(testOnReturn);

        dataSource.setPoolPreparedStatements(poolPreparedStatements);
        dataSource.setMaxPoolPreparedStatementPerConnectionSize(maxPoolPreparedStatementPerConnectionSize);
        dataSource.setFilters(filters);
        //dataSource.setConnectProperties();
        return dataSource;
    }

    @Bean(name = "transactionManager")
    public DataSourceTransactionManager dataSourceTransactionManager(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }
}
