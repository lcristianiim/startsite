package com.startup.startsitepresentation.interactor;

import com.startup.startsitepresentation.interactor.concept.Page;
import com.startup.startsitepresentation.interactor.concept.Theme;
import com.startup.startsitepresentation.interactor.concept.components.Component;
import com.startup.startsitepresentation.interactor.concept.components.commons.Link;
import com.startup.startsitepresentation.interactor.concept.components.header.HeaderComponent;
import com.startup.startsitepresentation.interactor.concept.components.header.HeaderDS;

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

            Component<HeaderDS> header = new HeaderComponent(data);
            return new Page("Cool title", Theme.LIGHT, "test-a", "index.html", List.of(header));
        }
        return null;
    }
}