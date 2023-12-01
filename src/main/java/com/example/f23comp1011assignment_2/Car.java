package com.example.f23comp1011assignment_2;

import com.google.gson.annotations.SerializedName;

public class Car {
    @SerializedName("MakeId")
    private int makeId;
    @SerializedName("MakeName")
    private String makeName;
    @SerializedName("VehicleTypeId")
    private int vehicleTypeId;
    @SerializedName("VehicleTypeName")
    private String vehicleTypeName;

    public int getMakeId() {
        return makeId;
    }

    public String getMakeName() {
        return makeName;
    }

    public int getVehicleTypeId() {
        return vehicleTypeId;
    }

    public String getVehicleTypeName() {
        return vehicleTypeName;
    }

    @Override
    public String toString() {
        return makeName + vehicleTypeName;
    }


}
