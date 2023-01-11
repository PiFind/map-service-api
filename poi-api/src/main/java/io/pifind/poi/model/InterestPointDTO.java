package io.pifind.poi.model;

import io.pifind.map.model.CoordinateDTO;
import lombok.Data;

/**
 * 兴趣点
 */
@Data
public class InterestPointDTO {

    /**
     * 主键
     */
    private String id;

    /**
     * 兴趣点名称
     */
    private String name;

    /**
     * 兴趣点详细地址
     */
    private String address;

    /**
     * 公司ID
     */
    private String companyId;

    /**
     * 所属类别ID
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
