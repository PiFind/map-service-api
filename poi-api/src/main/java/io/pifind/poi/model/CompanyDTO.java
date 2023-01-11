package io.pifind.poi.model;

import io.pifind.map.model.CoordinateDTO;
import lombok.Data;

/**
 * 公司实体类
 */
@Data
public class CompanyDTO {

    /**
     * 公司ID
     */
    private String id;

    /**
     * 公司名
     */
    private String name;

    /**
     * 公司详细地址
     */
    private String address;

    /**
     * 公司简介
     */
    private String introduction;

    /**
     * 所属类别
     */
    private Long categoryId;

    /**
     * 行政区ID
     */
    private Long administrativeAreaId;

    /**
     * 定位的坐标
     */
    private CoordinateDTO coordinate;

}
