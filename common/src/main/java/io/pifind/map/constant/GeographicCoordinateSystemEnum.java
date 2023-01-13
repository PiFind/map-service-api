package io.pifind.map.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * 地理坐标系
 */
public enum GeographicCoordinateSystemEnum {

    /**
     * GPS 用的坐标系
     */
    WGS84,

    /**
     * 由中国国家测绘局制定的地理坐标系统。
     */
    GCJ02,

    /**
     * 中国北斗系统所使用的坐标系。
     */
    CGCS2000,
    ;

    private static Map<String,GeographicCoordinateSystemEnum> map;

    public static GeographicCoordinateSystemEnum parse(String str) {
        if (map == null) {
            map = new HashMap<>();
            for (GeographicCoordinateSystemEnum systemEnum : values()) {
                map.put(systemEnum.name().toLowerCase(),systemEnum);
            }
        }
        return map.get(str.toLowerCase());
    }

}
