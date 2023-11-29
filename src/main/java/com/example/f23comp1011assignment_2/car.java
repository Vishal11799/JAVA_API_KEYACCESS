package com.example.f23comp1011assignment_2;


import com.google.gson.annotations.SerializedName;

public class car {
   @SerializedName("MakeId")
    private int MakeId;
    @SerializedName("MakeName")
    private int MakeName;
    @SerializedName("VehicleTypeId")
    private int VehicleTypeId;
    @SerializedName("VehicleTypeName")
    private int VehicleTypeName;

    public int getMakeId() {
        return MakeId;
    }

    public int getMakeName() {
        return MakeName;
    }

    public int getVehicleTypeId() {
        return VehicleTypeId;
    }

    public int getVehicleTypeName() {
        return VehicleTypeName;
    }
    @Override
    public String toString() {
        return "car Name{" +
                "MakeId =" + MakeId + '\'' +
                ",MakeName =" + MakeName + '\'' +
                ", VehicleTypeId='" + VehicleTypeId + '\'' +
                ", VehicleTypeName='" + VehicleTypeName + '\'' +

           '}';
    }
}
