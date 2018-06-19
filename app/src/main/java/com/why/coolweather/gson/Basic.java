package com.why.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {
    public String cid;
    public String location;
    @SerializedName("parent_city")
    public String parentCity;
    @SerializedName("admin_area")
    public String adminArea;
    public String cnty;
    public String lat;
    public String lon;
    public String tz;
    public String city;
    public String id;
    public Update update;

    public class Update {
        public String loc;
        public String utc;
    }
}
