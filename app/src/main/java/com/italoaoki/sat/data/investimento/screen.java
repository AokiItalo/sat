package com.italoaoki.sat.data.investimento;

import org.parceler.ParcelConstructor;

public class screen {
    private String title;
    private String fundName;
    private String whatIs;
    private String definition;


    @ParcelConstructor
    public screen(String title, String fundName, String whatIs, String definition) {
        this.title = title;
        this.fundName = fundName;
        this.whatIs = whatIs;
        this.definition = definition;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName;
    }

    public String getWhatIs() {
        return whatIs;
    }

    public void setWhatIs(String whatIs) {
        this.whatIs = whatIs;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }
}
