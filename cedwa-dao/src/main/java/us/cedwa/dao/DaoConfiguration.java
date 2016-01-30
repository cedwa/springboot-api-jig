package us.cedwa.dao;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * Created by cedwa on 8/30/15.
 */
@Configuration
@EnableAutoConfiguration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "us.cedwa.dao.repository")
@EnableSpringDataWebSupport
@PropertySource("classpath:/cedwa-dao.properties")
public class DaoConfiguration {

//    @Autowired
//    private Environment env;
//
//    @Bean
//    public DataSource dataSource() {
//        try {
//            ComboPooledDataSource ds = new ComboPooledDataSource();
//            ds.setDriverClass(env.getRequiredProperty("spring.datasource.driverClassName"));
//            ds.setJdbcUrl(env.getRequiredProperty("spring.datasource.url"));
//            ds.setUser(env.getRequiredProperty("spring.datasource.username"));
//            ds.setPassword(env.getRequiredProperty("spring.datasource.password"));
//            ds.setAcquireIncrement(Integer.valueOf(env.getRequiredProperty("spring.datasource.acquireIncrement")));
//            ds.setIdleConnectionTestPeriod(Integer.valueOf(env.getRequiredProperty("spring.datasource.idleConnectionTestPeriod")));
//            ds.setMaxPoolSize(Integer.valueOf(env.getRequiredProperty("spring.datasource.maxNumberPoolSize")));
//            ds.setMaxStatements(Integer.valueOf(env.getRequiredProperty("spring.datasource.maxStatements")));
//            ds.setMinPoolSize(Integer.valueOf(env.getRequiredProperty("spring.datasource.initialPoolSize")));
//            return ds;
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    // Declare a JPA entityManagerFactory
//    @Bean
//    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
//        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
//        em.setPackagesToScan("us.cedwa");
//        //em.setPersistenceXmlLocation("classpath*:META-INF/persistence.xml");
//        em.setPersistenceUnitName("hibernatePersistenceUnit");
//        em.setDataSource(dataSource());
//
//        HibernateJpaVendorAdapter vendor = new HibernateJpaVendorAdapter();
//        vendor.setShowSql(true);
//        em.setJpaVendorAdapter(vendor);
//
//        return em;
//    }
//
//    // Declare a transaction manager
//    @Bean
//    public JpaTransactionManager transactionManager() {
//        JpaTransactionManager transactionManager = new JpaTransactionManager();
//        transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
//        return transactionManager;
//    }
}
