package com.startup.startsitepresentation.interactor.concept;

import java.util.List;

public enum ComponentType {
    HEADER("header",
            "header.html",
            List.of( "components/header/header.css"),
            List.of("header"));

    ComponentType(String attributeNameInPage, String html, List<String> css, List<String> js) {
        this.attributeNameInPage = attributeNameInPage;
        this.html = html;
        this.css = css;
        this.js = js;
    }

    private final String html;
    private final List<String> css;
    private final List<String> js;
    private final String attributeNameInPage;

    public String getHtml() {
        return html;
    }

    public List<String> getCss() {
        return css;
    }

    public List<String> getJs() {
        return js;
    }

    public String getAttributeNameInPage() {
        return attributeNameInPage;
    }
}