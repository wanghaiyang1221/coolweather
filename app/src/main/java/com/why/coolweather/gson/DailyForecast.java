package com.why.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class DailyForecast {
    public String date;
    public Cond cond;
    public Tmp tmp;

    public static class Cond {
        @SerializedName("txt_d")
        public String txtD;
    }

    public class Tmp {
        public String max;
        public String min;
    }
}
