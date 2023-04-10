package com.startup.startsitepresentation.interactor;


import org.componenter.Page;
import org.componenter.Theme;
import org.componenter.components.Component;
import org.componenter.components.commons.Link;
import org.componenter.components.header.HeaderComponent;
import org.componenter.components.header.HeaderDS;

import java.util.List;

public class PagesServiceMockingImplementation implements PagesService {
    public Page getPageByURL(String url) {
        if (url.equals("/")) {

            HeaderDS data = new HeaderDS("Great Logo",
                    List.of(
                            new Link("First link", "page-one"),
                            new Link("Second link", "page-two")),
                    List.of(
                            new Link("Third link", "page-tree"),
                            new Link("Forth link", "page-four"))
            );

            Component header = new HeaderComponent(data);
            return new Page("Cool title", Theme.LIGHT, "test-a", "index.html", List.of(header));
        }
        return null;
    }
}