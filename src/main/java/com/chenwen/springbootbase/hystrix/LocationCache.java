package com.chenwen.springbootbase.hystrix;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chen.jw
 * @date 2021/7/14 17:29
 */
public class LocationCache {
    private static Map<Long, String> CITY_MAP = new HashMap<>();

    static {
        CITY_MAP.put(1L, "北京");
    }

    /**
     * 通过cityId 获取 cityName
     *
     * @param cityId 城市id
     * @return 城市名
     */
    public static String getCityName(Long cityId) {
        return CITY_MAP.get(cityId);
    }
}
