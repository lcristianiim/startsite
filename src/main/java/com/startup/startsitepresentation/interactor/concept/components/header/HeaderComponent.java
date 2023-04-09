package com.startup.startsitepresentation.interactor.concept.components.header;

import com.startup.startsitepresentation.interactor.concept.ComponentType;
import com.startup.startsitepresentation.interactor.concept.components.Component;

import java.util.List;

public class HeaderComponent implements Component<HeaderDS> {
    HeaderDS data;
    ComponentType type = ComponentType.HEADER;

    public HeaderComponent(HeaderDS data) {
        this.data = data;
    }

    @Override
    public ComponentType getType() {
        return type;
    }

    @Override
    public HeaderDS getDataStructure() {
        return data;
    }

    @Override
    public List<String> getCss() {
        return type.getCss();
    }
}
