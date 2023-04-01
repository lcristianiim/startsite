package com.startup.startsitepresentation.controller;


import com.startup.startsitepresentation.interactor.HomepageService;
import com.startup.startsitepresentation.screen_presenter.components.header.HeaderDS;
import com.startup.startsitepresentation.screen_presenter.components.header.Link;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class Homepage {
    @Autowired
    HomepagePresenter presenter;

    @GetMapping("/")
    ModelAndView homepage() {
        HomepageService service = new HomepageService();
        HeaderDS data = new HeaderDS("Great Logo",
                List.of(
                        new Link("First link", "page-one"),
                        new Link("Second link", "page-two")),
                List.of(
                        new Link("Third link", "page-tree"),
                        new Link("Forth link", "page-four"))
        );

        HomepageInput input = new HomepageInput(service.getTitle(), data);

        return presenter.presentHomepage(input);
    }
}
