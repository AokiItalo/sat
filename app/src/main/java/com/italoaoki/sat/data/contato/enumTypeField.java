package com.italoaoki.sat.data.contato;

import com.google.gson.annotations.SerializedName;

public enum enumTypeField {
    @SerializedName("1")
    TEXT(1),
    @SerializedName("telnumber")
    TEL_NUMBER(2),
    @SerializedName("3")
    EMAIL(3);

    public final int typeField;

    enumTypeField(int i) {
        this.typeField = i;
    }
}