package com.startup.startsitepresentation.spring.prototyping;

import com.startup.startsitepresentation.interactor.concept.Page;
import com.startup.startsitepresentation.interactor.concept.Theme;
import com.startup.startsitepresentation.interactor.concept.components.Component;
import com.startup.startsitepresentation.interactor.concept.components.header.HeaderComponent;
import com.startup.startsitepresentation.interactor.concept.components.header.HeaderDS;
import com.startup.startsitepresentation.interactor.concept.components.commons.Link;
import com.startup.startsitepresentation.spring.controller.GeneralPagePresenter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HeaderPrototyping {

    @Autowired
    GeneralPagePresenter presenter;

    @GetMapping("/prototyping/header")
    ModelAndView homepage() {
        HeaderDS data = new HeaderDS("Great Logo",
                List.of(
                        new Link("First link", "page-one"),
                        new Link("Second link", "page-two")),
                List.of(
                        new Link("Third link", "page-tree"),
                        new Link("Forth link", "page-four"))
        );

        Component<HeaderDS> lightHeader = new HeaderComponent(data);

        Page page = new Page("Cool title", Theme.LIGHT, "test-a", "index.html", List.of(lightHeader));
        return presenter.presentHomepage(page);
    }
}
