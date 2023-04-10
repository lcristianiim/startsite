package com.startup.startsitepresentation.spring.spring_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.startup.startsitepresentation.spring.presenter.GeneralPagePresenter;
import com.startup.startsitepresentation.spring.presenter.ThymeleafPresenter;

@Configuration
public class BeansDefinitions {

    @Bean
    GeneralPagePresenter homepagePresenter() {
        return new ThymeleafPresenter();
    }
}
