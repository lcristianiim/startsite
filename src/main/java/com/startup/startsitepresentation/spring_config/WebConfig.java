package com.startup.startsitepresentation.spring_config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@Configuration
//public class WebConfig implements WebMvcConfigurer, ApplicationContextAware {

//    @Autowired
//    private ApplicationContext applicationContext;
//
//    @Override
//    public void setApplicationContext(ApplicationContext applicationContext) throws
//            BeansException {
//        this.applicationContext = applicationContext;
//    }
//
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry
//                .addResourceHandler("/css/**")
//                .addResourceLocations("/home/cristian/projects/klunerpresentation/target/classes/static/css/");
//        registry
//                .addResourceHandler("/js/**")
//                .addResourceLocations("/static/js/");
//    }
//}
