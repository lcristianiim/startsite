package com.startup.startsitepresentation.interactor.concept.components.header;

import com.startup.startsitepresentation.interactor.concept.components.commons.Link;

import java.util.List;

public record HeaderDS(String logo, List<Link> leftLinks, List<Link> rightLinks) {};
