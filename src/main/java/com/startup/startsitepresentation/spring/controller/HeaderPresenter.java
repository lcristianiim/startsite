package com.startup.startsitepresentation.spring.controller;

import com.startup.startsitepresentation.interactor.concept.components.header.HeaderDS;
import org.springframework.web.servlet.ModelAndView;

public interface HeaderPresenter {
    public ModelAndView presentHeader(HeaderInput input);
    public String presentHeader(HeaderDS data);
}
