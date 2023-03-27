package ro.kluner.klunerpresentation.spring_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ro.kluner.klunerpresentation.controller.HomepagePresenter;
import ro.kluner.klunerpresentation.screen_presenter.pages.ScreenHomepagePresenter;

@Configuration
public class BeansDefinitions {

    @Bean
    HomepagePresenter homepagePresenter() {
        return new ScreenHomepagePresenter();
    }
}
