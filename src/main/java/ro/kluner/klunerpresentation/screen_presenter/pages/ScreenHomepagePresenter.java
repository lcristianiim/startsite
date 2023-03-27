package ro.kluner.klunerpresentation.screen_presenter.pages;

import org.springframework.web.servlet.ModelAndView;
import ro.kluner.klunerpresentation.controller.HomepageInput;
import ro.kluner.klunerpresentation.controller.HomepagePresenter;

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

    private HomepageDS inputToData(HomepageInput input) {
        HomepageDS data = new HomepageDS();
        data.setTitle(input.getPageTitle());
        data.setHeader(input.getHeaderDS());
        return data;
    }
}
