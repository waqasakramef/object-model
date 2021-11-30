package com.ef.cim.objectmodel;

import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

public class Action {

    @NotBlank(message = "button is mandatory")
    private String button;
    private List<Button> buttons;
    @Valid
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

    public List<Button> getButtons() {
        return buttons;
    }

    public void setButtons(List<Button> buttons) {
        this.buttons = buttons;
    }

    @Override
    public String toString() {
        return "Action{" +
                "button='" + button + '\'' +
                ", buttons=" + buttons +
                ", sections=" + sections +
                '}';
    }
}
