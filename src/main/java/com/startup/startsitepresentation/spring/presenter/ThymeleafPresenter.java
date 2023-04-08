package com.startup.startsitepresentation.spring.presenter;

import com.startup.startsitepresentation.spring.controller.GeneralPagePresenter;
import com.startup.startsitepresentation.interactor.concept.Page;
import com.startup.startsitepresentation.interactor.concept.components.Component;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

public class ThymeleafPresenter implements GeneralPagePresenter {

    @Override
    public ModelAndView presentHomepage(Page page) {
        String view = page.getView();
        var mav = new ModelAndView(view);

        List<String> componentsCss = new ArrayList<>();
        List<ThymeleafComponentInsert> inserts = new ArrayList<>();

        for (var comp : page.getComponents()) {
            addComponentsToInserts(inserts, comp);
            addCssOfComponent(componentsCss, comp);
        }

        mav.addObject("pageTitle", page.getTitle());
        mav.addObject("componentsCSS", componentsCss);
        mav.addObject("inserts", inserts);

        return mav;
    }

    private static void addComponentsToInserts(List<ThymeleafComponentInsert> inserts, Component comp) {
        inserts.add(new ThymeleafComponentInsert(comp.getType().getHtml(),
                comp.getType().getName(), comp.getDataStructure()));
    }

    private static void addCssOfComponent(List<String> componentsCss, Component comp) {
        componentsCss.addAll(comp.getCss());
    }

    public record ThymeleafComponentInsert(String html, String componentName, Object dataStructure){
        @Override
        public String html() {
            return html;
        }

        @Override
        public String componentName() {
            return componentName;
        }

        @Override
        public Object dataStructure() {
            return dataStructure;
        }
    }
}
