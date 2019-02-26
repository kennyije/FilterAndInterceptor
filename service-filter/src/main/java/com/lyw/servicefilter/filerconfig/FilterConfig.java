package com.lyw.servicefilter.filerconfig;

import com.lyw.servicefilter.filter.FilterTest;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {
    @Bean
    public FilterRegistrationBean registFilter() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new FilterTest());
        filterRegistrationBean.addUrlPatterns("/*");
        filterRegistrationBean.setName("filterTest");
        filterRegistrationBean.setOrder(1);
        return filterRegistrationBean;
    }
}
