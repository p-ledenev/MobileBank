package app.configs;

import org.hibernate.*;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.datasource.*;
import org.springframework.orm.hibernate4.*;
import org.springframework.transaction.annotation.*;

import javax.sql.*;
import java.util.*;

/**
 * Created by DiKey on 29.08.2015.
 */

@Configuration
@EnableTransactionManagement
public class DataBaseConfig {

    @Bean
    public DataSource dataSource() {

        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();

        dataSource.setDriverClass(org.h2.Driver.class);
        dataSource.setUrl("jdbc:h2:mem:test;MODE=Oracle;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE");
        dataSource.setUsername("sa");
        dataSource.setPassword("");

        return dataSource;
    }

    @Bean
    public SessionFactory sessionFactory(DataSource dataSource) throws Throwable {

        LocalSessionFactoryBean sessionBean = new LocalSessionFactoryBean();

        sessionBean.setDataSource(dataSource);

        Properties properties = new Properties();
        properties.setProperty("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
        properties.setProperty("hibernate.hbm2ddl.auto", "update");
        properties.setProperty("hibernate.show_sql", "false");

        sessionBean.setPackagesToScan("app.model");

        sessionBean.setHibernateProperties(properties);

        sessionBean.afterPropertiesSet();

        return sessionBean.getObject();
    }
}
