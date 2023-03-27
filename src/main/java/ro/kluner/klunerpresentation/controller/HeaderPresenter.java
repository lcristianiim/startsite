package ro.kluner.klunerpresentation.controller;

import org.springframework.web.servlet.ModelAndView;
import ro.kluner.klunerpresentation.screen_presenter.components.header.HeaderDS;

public interface HeaderPresenter {
    public ModelAndView presentHeader(HeaderInput input);
    public String presentHeader(HeaderDS data);
}
