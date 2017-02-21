package com.hdu.hanjianhao.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by hanjianhao on 17/2/11.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
