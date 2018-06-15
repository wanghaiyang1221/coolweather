package com.why.coolweather.db;

import org.litepal.crud.DataSupport;

public class County extends DataSupport{
    private int id;

    private String ccountyName;

    private int cityId;

    private String weatherId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCcountyName() {
        return ccountyName;
    }

    public void setCcountyName(String ccountyName) {
        this.ccountyName = ccountyName;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }
}
