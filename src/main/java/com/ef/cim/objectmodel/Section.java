package com.ef.cim.objectmodel;

import java.util.List;
import javax.validation.Valid;

public class Section {

    private String title;
    @Valid
    private List<Row> rows;

    public Section() {
    }

    public Section(String title, List<Row> rows) {
        this.title = title;
        this.rows = rows;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
                "text='" + title + '\'' +
                ", rows=" + rows +
                '}';
    }
}
