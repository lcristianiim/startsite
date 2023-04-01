package com.startup.startsitepresentation.spring_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.startup.startsitepresentation.controller.HomepagePresenter;
import com.startup.startsitepresentation.screen_presenter.pages.ScreenHomepagePresenter;

@Configuration
public class BeansDefinitions {

    @Bean
    HomepagePresenter homepagePresenter() {
        return new ScreenHomepagePresenter();
    }
}
