package com.startup.startsitepresentation.controller;


import com.startup.startsitepresentation.interactor.concept.Page;
import com.startup.startsitepresentation.interactor.concept.Theme;
import com.startup.startsitepresentation.interactor.concept.components.Component;
import com.startup.startsitepresentation.interactor.concept.components.HeaderComponent;
import com.startup.startsitepresentation.screen_presenter.components.header.HeaderDS;
import com.startup.startsitepresentation.screen_presenter.components.header.Link;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class TestController {
    @Autowired
    HomepagePresenter presenter;

    @GetMapping("/test")
    ModelAndView homepage() {

        HeaderDS data = new HeaderDS("Great Logo",
                List.of(
                        new Link("First link", "page-one"),
                        new Link("Second link", "page-two")),
                List.of(
                        new Link("Third link", "page-tree"),
                        new Link("Forth link", "page-four"))
        );


        Component header = new HeaderComponent(data, Theme.DARK);
        Page page = new Page("Cool title", "test-a", "testing.html", List.of(header));

        return presenter.presentHomepage(page);
    }
}
