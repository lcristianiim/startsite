package ro.kluner.klunerpresentation.screen_presenter.pages;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ro.kluner.klunerpresentation.screen_presenter.components.header.HeaderDS;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HomepageDS {
    String title;
    HeaderDS header;
}
