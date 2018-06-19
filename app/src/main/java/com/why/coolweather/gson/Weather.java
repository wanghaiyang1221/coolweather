package com.why.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather {
    public Basic basic;
    public String status;
    public Update update;
    public Now now;
    @SerializedName("daily_forecast")
    public List<DailyForecast> dailyForecastList;
    @SerializedName("hourly")
    public List<Hourly> hourlyList;
    public Aqi aqi;
    public Suggestion suggestion;
}
