package io.pifind.map.model;

import io.pifind.map.constant.GeographicCoordinateSystemEnum;
import lombok.Data;

/**
 * 定位坐标系
 */
@Data
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

}
