package com.ef.cim.objectmodel;

import java.util.List;

public class Section {

    private String text;
    private List<Row> rows;

    public Section() {
    }

    public Section(String text, List<Row> rows) {
        this.text = text;
        this.rows = rows;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<Row> getRows() {
        return rows;
    }

    public void setRows(List<Row> rows) {
        this.rows = rows;
    }

    @Override
    public String toString() {
        return "Section{" +
                "text='" + text + '\'' +
                ", rows=" + rows +
                '}';
    }
}
