package com.italoaoki.sat.data.investimento;

import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;
import org.parceler.ParcelConstructor;
import org.parceler.ParcelProperty;

@Parcel(Parcel.Serialization.BEAN)
public enum enumRisk {

    @SerializedName("1")
    RISK_LOWER(1),
    @SerializedName("2")
    RISK_LOW(2),
    @SerializedName("3")
    RISK_MEDIUM(3),
    @SerializedName("4")
    RISK_HIGH(4),
    @SerializedName("5")
    RISK_HIGHER(5);

    @ParcelProperty("risk")
    public final int risk;

    @ParcelConstructor
    enumRisk(@ParcelProperty("risk") int risk) {
        this.risk = risk;
    }
}
