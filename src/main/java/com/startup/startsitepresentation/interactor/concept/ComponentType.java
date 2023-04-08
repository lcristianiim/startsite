package com.startup.startsitepresentation.interactor.concept;

import java.util.List;

public enum ComponentType {
    HEADER("header",
            "components/header.html",
            List.of( "components/header/header.css"),
            List.of("header.js"));

    ComponentType(String name, String html, List<String> css, List<String> js) {
        this.name = name;
        this.html = html;
        this.css = css;
        this.js = js;
    }

    private final String html;
    private final List<String> css;
    private final List<String> js;
    private final String name;

    public String getHtml() {
        return html;
    }

    public List<String> getCss() {
        return css;
    }

    public List<String> getJs() {
        return js;
    }

    public String getName() {
        return name;
    }
}