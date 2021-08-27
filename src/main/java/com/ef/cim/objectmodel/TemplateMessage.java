package com.ef.cim.objectmodel;

import java.util.ArrayList;
import java.util.List;

public class TemplateMessage extends StructuredMessage {

    private String namespace;
    private String name;
    private Language language;
    private List<Component> components;

    public TemplateMessage() {
        super(MessageType.TEMPLATE);
        this.components = new ArrayList<>();
    }

    public TemplateMessage(String namespace, String name, Language language,
            List<Component> components) {
        super(MessageType.TEMPLATE);
        this.namespace = namespace;
        this.name = name;
        this.language = language;
        this.components = components;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public List<Component> getComponents() {
        return components;
    }

    public void setComponents(List<Component> components) {
        this.components = components;
    }

    @Override
    public String toString() {
        return "TemplateMessage{" +
                "type=" + type +
                ", markdownText='" + markdownText + '\'' +
                ", additionalDetails=" + additionalDetails +
                ", namespace='" + namespace + '\'' +
                ", name='" + name + '\'' +
                ", language=" + language +
                ", components=" + components +
                '}';
    }
}
