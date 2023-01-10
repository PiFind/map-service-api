package io.pifind.poi.model;

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
     * 行政区ID
     */
    private Long administrativeAreaId;

}
