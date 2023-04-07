package com.startup.startsitepresentation.interactor.concept.components;

import com.startup.startsitepresentation.interactor.concept.ComponentType;
import com.startup.startsitepresentation.interactor.concept.Theme;

import java.util.List;

public interface Component<V> {
    ComponentType getType();
    String getTheme();
    V getDataStructure();

    List<String> getCss();
}
