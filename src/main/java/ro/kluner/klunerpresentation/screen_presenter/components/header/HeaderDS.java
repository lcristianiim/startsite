package ro.kluner.klunerpresentation.screen_presenter.components.header;

import java.util.List;

public record HeaderDS(String logo, List<Link> leftLinks, List<Link> rightLinks) {};