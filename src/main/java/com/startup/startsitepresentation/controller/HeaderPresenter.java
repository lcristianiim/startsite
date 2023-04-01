package com.startup.startsitepresentation.controller;

import com.startup.startsitepresentation.screen_presenter.components.header.HeaderDS;
import org.springframework.web.servlet.ModelAndView;

public interface HeaderPresenter {
    public ModelAndView presentHeader(HeaderInput input);
    public String presentHeader(HeaderDS data);
}
