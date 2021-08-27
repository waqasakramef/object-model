package com.ef.cim.objectmodel;

import java.util.List;

public class Action {

    private String button;
    private List<Section> sections;

    public Action() {
    }

    public Action(String button, List<Section> sections) {
        this.button = button;
        this.sections = sections;
    }

    public String getButton() {
        return button;
    }

    public void setButton(String button) {
        this.button = button;
    }

    public List<Section> getSections() {
        return sections;
    }

    public void setSections(List<Section> sections) {
        this.sections = sections;
    }

    @Override
    public String toString() {
        return "Action{" +
                "button='" + button + '\'' +
                ", sections=" + sections +
                '}';
    }
}
