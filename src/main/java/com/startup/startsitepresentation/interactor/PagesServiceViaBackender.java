package com.startup.startsitepresentation.interactor;

import com.startup.startsitepresentation.interactor.concept.Page;

public class PagesServiceViaBackender implements PagesService {
    String backenderAddress = "localhost:8090";
    @Override
    public Page getPageByURL(String url) {
        return null;
    }
}
