package com.startup.startsitepresentation.interactor;


import org.componenter.Page;

@FunctionalInterface
public interface PagesService {
     Page getPageByURL(String url);
}
