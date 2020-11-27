package com.example.lessonweb;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfigue {
    @Bean
    public FilterRegistrationBean testFilterRegistration(){

           FilterRegistrationBean registrationBean = new FilterRegistrationBean() ;
           registrationBean.setFilter(new MyFilter());
           registrationBean.addUrlPatterns("/*");
           registrationBean.setName("MyFilter");
           //设置筛选的优先级 越小的越先执行
           registrationBean.setOrder(6);
           return  registrationBean ;
        }
}
