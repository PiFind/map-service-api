package io.pifind.place.model;

import lombok.Data;

import java.util.List;

/**
 * 行政区划实体类
 */
@Data
public class AdministrativeAreaDTO {

    /**
     * 当前的行政区ID
     */
    private Long id;

    /**
     * 管辖当前行政区的上级行政区ID
     */
    private Long superior;

    /**
     * 行政区名
     */
    private String name;

    /**
     * 行政区等级
     */
    private Integer level;

    /**
     * 管辖地
     */
    private List<AdministrativeAreaDTO> areas;

}
