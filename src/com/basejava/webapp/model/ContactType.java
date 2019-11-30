package com.basejava.webapp.model;

public enum ContactType {
    PHONE("Тел."),
    SKYPE("Skype"),
    MAIL("Почта"),
    GITHUB("Профиль GitHub");


    private final String title;

    ContactType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
