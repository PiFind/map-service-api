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
     * logo URL地址
     */
    private String logo;

    /**
     * 公司类别
     */
    private Long categoryId;

    /**
     * 公司简介
     */
    private String introduction;

}
