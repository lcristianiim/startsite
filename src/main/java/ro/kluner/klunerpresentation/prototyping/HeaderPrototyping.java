package ro.kluner.klunerpresentation.prototyping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import ro.kluner.klunerpresentation.screen_presenter.components.header.HeaderDS;
import ro.kluner.klunerpresentation.screen_presenter.components.header.Link;

import java.util.List;

@Controller
public class HeaderPrototyping {

    @GetMapping("/prototyping/header")
    ModelAndView getHeader() {
        ModelAndView mav = new ModelAndView("prototyping/header");
        HeaderDS data = new HeaderDS("Great Logo",
                List.of(
                        new Link("First link", "page-one"),
                        new Link("Second link", "page-two")),
                List.of(
                        new Link("Third link", "page-tree"),
                        new Link("Forth link", "page-four"))
        );

        mav.addObject("header", data);
        return mav;
    }
}
