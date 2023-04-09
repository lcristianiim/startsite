package com.startup.startsitepresentation.spring.controller;

import com.startup.startsitepresentation.interactor.PagesService;
import com.startup.startsitepresentation.interactor.PagesServiceMockingImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomePage {
    @Autowired
    GeneralPagePresenter presenter;

    @GetMapping("/")
    ModelAndView homepage() {

        PagesService service = new PagesServiceMockingImplementation();
        service.getPageByURL("/");

        return presenter.presentHomepage(service.getPageByURL("/"));
    }
}
