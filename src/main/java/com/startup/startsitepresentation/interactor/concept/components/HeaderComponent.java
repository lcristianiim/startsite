package com.startup.startsitepresentation.interactor.concept.components;

import com.startup.startsitepresentation.interactor.concept.ComponentType;
import com.startup.startsitepresentation.interactor.concept.Theme;
import com.startup.startsitepresentation.screen_presenter.components.header.HeaderDS;

import java.util.List;

public class HeaderComponent implements Component<HeaderDS> {
    HeaderDS data;
    ComponentType type = ComponentType.HEADER;
    Theme theme;

    public HeaderComponent(HeaderDS data, Theme theme) {
        this.data = data;
        this.theme = theme;
    }

    @Override
    public ComponentType getType() {
        return type;
    }

    @Override
    public String getTheme() {
        return this.theme.getFolderName();
    }

    @Override
    public HeaderDS getDataStructure() {
        return data;
    }

    @Override
    public List<String> getCss() {
        return type.getCss().stream()
                .map(e -> theme.getFolderName() + "/" + e)
                .toList();
    }
}
