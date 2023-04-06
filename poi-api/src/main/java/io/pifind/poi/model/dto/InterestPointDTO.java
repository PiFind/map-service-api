package io.pifind.poi.model.dto;

import io.pifind.map.model.CoordinateDTO;
import io.pifind.poi.constant.BusinessStatusEnum;
import io.pifind.poi.constant.PoiStatusEnum;
import io.pifind.poi.model.component.BusinessTimeDTO;
import lombok.Data;

import java.util.Date;
import java.util.List;

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
     * 兴趣点名称（英文名）
     */
    private String nameEN;

    /**
     * 兴趣点详细地址
     */
    private String address;

    /**
     * 兴趣点详细地址（英文名）
     */
    private String addressEN;

    /**
     * 所属类别ID
     */
    private Long categoryId;

    /**
     * 行政区ID
     */
    private Long administrativeAreaId;

    /**
     * 营业时间
     */
    private BusinessTimeDTO businessTime;

    /**
     * 营业执照
     */
    private String businessLicense;

    /**
     * 营业状态
     */
    private BusinessStatusEnum businessStatus;

    /**
     * 电话
     */
    private List<String> tels;

    /**
     * 图片
     */
    private List<String> images;

    /**
     * 人均消费
     */
    private Double consumptionPerPerson;

    /**
     * 人均消费使用的币种
     */
    private String consumptionCurrency;

    /**
     * 支持消费的币种
     */
    private List<String> supportedCurrencies;

    /**
     * 标签
     */
    private List<String> tags;

    /**
     * 上传者
     */
    private String publisher;

    /**
     * 定位的坐标
     */
    private CoordinateDTO coordinate;

}