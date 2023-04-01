package com.startup.startsitepresentation.controller;

import com.startup.startsitepresentation.screen_presenter.components.header.HeaderDS;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class HomepageInput {
    String pageTitle;
    HeaderDS headerDS;
}
