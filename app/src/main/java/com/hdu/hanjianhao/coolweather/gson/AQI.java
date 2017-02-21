package com.hdu.hanjianhao.coolweather.gson;

/**
 * Created by hanjianhao on 17/2/11.
 */

public class AQI {

    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
