package com.startup.startsitepresentation.controller;

import com.startup.startsitepresentation.interactor.concept.Page;
import org.springframework.web.servlet.ModelAndView;

public interface HomepagePresenter {
    public ModelAndView presentHomepage(HomepageInput input);

    ModelAndView presentHomepage(Page page);
}
