package com.startup.startsitepresentation.interactor.concept.components;

import com.startup.startsitepresentation.interactor.concept.ComponentType;

import java.util.List;

public interface Component<V> {
    ComponentType getType();
    V getDataStructure();
    List<String> getCss();
}
