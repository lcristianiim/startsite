package com.startup.startsitepresentation.interactor.concept;

import com.startup.startsitepresentation.interactor.concept.components.Component;

import java.util.List;

public class Page {
    String title;
    String url;
    String view;
    List<Component> components;

    public Page(String title, String url, String view, List<Component> components) {
        this.title = title;
        this.url = url;
        this.view = view;
        this.components = components;
    }

    public List<Component> getComponents() {
        return components;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public String getView() {
        return view;
    }
}
