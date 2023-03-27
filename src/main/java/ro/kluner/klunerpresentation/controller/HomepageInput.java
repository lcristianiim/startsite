package ro.kluner.klunerpresentation.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ro.kluner.klunerpresentation.screen_presenter.components.header.HeaderDS;

@AllArgsConstructor
@Getter
@Setter
public class HomepageInput {
    String pageTitle;
    HeaderDS headerDS;
}
