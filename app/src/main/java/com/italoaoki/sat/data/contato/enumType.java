package com.italoaoki.sat.data.contato;

import com.google.gson.annotations.SerializedName;

public enum enumType {
    @SerializedName("1")
    FIELD(1),
    @SerializedName("2")
    TEXT(2),
    @SerializedName("3")
    IMAGE(3),
    @SerializedName("4")
    CHECKBOX(4),
    @SerializedName("5")
    SEND(5);

    public final int type;

    enumType(int i) {
        this.type = i;
    }
}
