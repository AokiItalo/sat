package com.italoaoki.sat.network.contact;

import com.google.gson.annotations.SerializedName;
import com.italoaoki.sat.data.contato.enumType;
import com.italoaoki.sat.data.contato.enumTypeField;

import org.parceler.Parcel;

@Parcel(Parcel.Serialization.BEAN)
public class CellResponse {

    private Integer id;
    private enumType type;
    private String message;
    @SerializedName("typefield")
    private enumTypeField typeField;
    private boolean hidden;
    private double topSpacing;
    private Integer show;
    private boolean required;

    public Integer getId() {
        return id;
    }

    public enumType getType() {
        return type;
    }

    public String getMessage() {
        return message;
    }

    public boolean isHidden() {
        return hidden;
    }

    public Integer getShow() {
        return show;
    }

    public boolean isRequired() {
        return required;
    }

    public enumTypeField getTypeField() {
        return typeField;
    }

    public double getTopSpacing() {
        return topSpacing;
    }
}
