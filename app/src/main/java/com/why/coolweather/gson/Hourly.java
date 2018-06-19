package com.why.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class Hourly {
    public String cloud;
    @SerializedName("cond_code")
    public String condCode;
    @SerializedName("cond_txt")
    public String condTxt;
    public String dew;
    public String hum;
    public String pop;
    public String pres;
    public String time;
    public String tmp;
    @SerializedName("wind_deg")
    public String windDeg;
    @SerializedName("wind_dir")
    public String windDir;
    @SerializedName("wind_sc")
    public String windSc;
    @SerializedName("wind_spd")
    public String windSpd;
}
