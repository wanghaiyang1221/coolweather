package com.why.coolweather.util;

import android.text.TextUtils;
import com.why.coolweather.db.City;
import com.why.coolweather.db.County;
import com.why.coolweather.db.Province;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Utility {
    public static boolean handleProvinceResponse(String response) {
        if(!TextUtils.isEmpty(response)) {
            try {
                JSONArray array = new JSONArray(response);
                for(int i = 0; i < array.length(); i++) {
                    JSONObject provinceObj = array.getJSONObject(i);
                    Province province = new Province();
                    province.setProvinceCode(provinceObj.getString("id"));
                    province.setProvinceName(provinceObj.getString("name"));
                    province.save();
                }

                return true;
            } catch (JSONException e) {
                e.printStackTrace();
                return false;
            }
        }

        return false;
    }

    public static boolean handleCityResponse(String response, int provinceId) {
        if(!TextUtils.isEmpty(response)) {
            try {
                JSONArray array = new JSONArray(response);
                for(int i = 0; i < array.length(); i++) {
                    JSONObject cityObj = array.getJSONObject(i);
                    City city = new City();
                    city.setCityCode(cityObj.getString("id"));
                    city.setCityName(cityObj.getString("name"));
                    city.setProvinceId(provinceId);
                    city.save();
                }

                return true;
            } catch (JSONException e) {
                e.printStackTrace();
                return false;
            }
        }

        return false;
    }

    public static boolean handleCountyResponse(String response, int cityId) {
        if(!TextUtils.isEmpty(response)) {
            try {
                JSONArray array = new JSONArray(response);
                for(int i = 0; i < array.length(); i++) {
                    JSONObject countyObj = array.getJSONObject(i);
                    County county = new County();
                    county.setWeatherId(countyObj.getString("weather_id"));
                    county.setCountyName(countyObj.getString("name"));
                    county.setCityId(cityId);
                    county.save();
                }

                return true;
            } catch (JSONException e) {
                e.printStackTrace();
                return false;
            }
        }

        return false;
    }
}
