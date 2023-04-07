package com.startup.startsitepresentation.screen_presenter.pages;

import com.startup.startsitepresentation.interactor.concept.Page;
import com.startup.startsitepresentation.interactor.concept.components.Component;
import org.springframework.web.servlet.ModelAndView;
import com.startup.startsitepresentation.controller.HomepageInput;
import com.startup.startsitepresentation.controller.HomepagePresenter;

import java.util.ArrayList;
import java.util.List;

public class ScreenHomepagePresenter implements HomepagePresenter {

    public static final String VIEW_NAME = "index.html";

    @Override
    public ModelAndView presentHomepage(HomepageInput input) {
        var mav = new ModelAndView(VIEW_NAME);
        HomepageDS data = inputToData(input);

        mav.addObject("title", data.getTitle());
        mav.addObject("header", data.getHeader());
        return mav;
    }

    @Override
    public ModelAndView presentHomepage(Page page) {
        String view = page.getView();
        var mav = new ModelAndView(view);

        List<String> componentsCss = new ArrayList<>();
        for (var comp : page.getComponents()) {
            addDataStructureOfComponent(mav, comp);
            addCssOfComponent(componentsCss, comp);
        }

        mav.addObject("pageTitle", page.getTitle());
        mav.addObject("componentsCSS", componentsCss);

        return mav;
    }

    private static void addCssOfComponent(List<String> componentsCss, Component comp) {
        componentsCss.addAll(comp.getCss());
    }

    private static void addDataStructureOfComponent(ModelAndView mav, Component comp) {
        mav.addObject(comp.getType().getAttributeNameInPage(), comp.getDataStructure());
    }

    private HomepageDS inputToData(HomepageInput input) {
        HomepageDS data = new HomepageDS();
        data.setTitle(input.getPageTitle());
        data.setHeader(input.getHeaderDS());
        return data;
    }
}
