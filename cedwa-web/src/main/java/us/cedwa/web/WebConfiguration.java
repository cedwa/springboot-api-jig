package us.cedwa.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import us.cedwa.dao.DaoConfiguration;

import java.util.concurrent.TimeUnit;

/**
 * Created by cedwa on 8/30/15.
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = {"us.cedwa.dao", "us.cedwa.web"})
@PropertySource("classpath:/cedwa-web.properties")
@PropertySource("classpath:/cedwa-dao.properties")
@ContextConfiguration(classes = DaoConfiguration.class)
@EnableWebMvc
public class WebConfiguration {

    @Autowired
    Environment env;

    public static void main(String[] args) throws Exception {
        SpringApplication.run(WebConfiguration.class, args);
    }

    @Bean
    public EmbeddedServletContainerFactory servletContainer() {
        TomcatEmbeddedServletContainerFactory factory = new TomcatEmbeddedServletContainerFactory();
        factory.setPort(Integer.valueOf(env.getRequiredProperty("tomcat.port")));
        factory.setSessionTimeout(59, TimeUnit.MINUTES);
        return factory;
    }
}
