package com.startup.startsitepresentation.spring.controller;

import com.startup.startsitepresentation.interactor.concept.Page;
import org.springframework.web.servlet.ModelAndView;

public interface GeneralPagePresenter {
    ModelAndView presentHomepage(Page page);
}
