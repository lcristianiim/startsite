package com.startup.startsitepresentation.spring.prototyping;

import com.startup.startsitepresentation.spring.presenter.GeneralPagePresenter;
import org.componenter.Page;
import org.componenter.Theme;
import org.componenter.components.Component;
import org.componenter.components.commons.Link;
import org.componenter.components.header.HeaderComponent;
import org.componenter.components.header.HeaderDS;
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

        Component lightHeader = new HeaderComponent(data);

        Page page = new Page("Cool title", Theme.LIGHT, "test-a", "index.html", List.of(lightHeader));
        return presenter.presentHomepage(page);
    }
}
