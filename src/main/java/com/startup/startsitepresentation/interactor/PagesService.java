package com.startup.startsitepresentation.interactor;

import com.startup.startsitepresentation.interactor.concept.Page;

@FunctionalInterface
public interface PagesService {
     Page getPageByURL(String url);
}
