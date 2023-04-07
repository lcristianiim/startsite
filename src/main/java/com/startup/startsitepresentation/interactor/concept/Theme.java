package com.startup.startsitepresentation.interactor.concept;

public enum Theme {
    LIGHT("light"), DARK("dark");

    private String folderName;

    Theme(String folderName) {
        this.folderName = folderName;
    }

    public String getFolderName() {
        return folderName;
    }
}
