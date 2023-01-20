package io.pifind.map.model;

import io.pifind.map.constant.GeographicCoordinateSystemEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 定位坐标系
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CoordinateDTO {

    /**
     * 经度，精确到小数点后6位
     */
    private Double longitude;

    /**
     * 维度，精确到小数点后6位
     */
    private Double latitude;

    /**
     * 坐标系
     */
    private GeographicCoordinateSystemEnum system;

    /**
     * 默认使用 WGS84 坐标系
     * @param longitude 经度
     * @param latitude 纬度
     */
    public CoordinateDTO(Double longitude,Double latitude) {
        this(longitude,latitude,GeographicCoordinateSystemEnum.WGS84);
    }

}
