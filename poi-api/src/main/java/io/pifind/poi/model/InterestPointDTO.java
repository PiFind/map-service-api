package io.pifind.poi.model;

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
     * 哈希值
     */
    private String hash;

    /**
     * 浏览量
     */
    private Integer pageviews;

    /**
     * 收藏数
     */
    private Integer collections;

    /**
     * 顾客评分( 0 - 5 )
     */
    private Double score;

    /**
     * 兴趣点状态
     */
    private PoiStatusEnum status;

    /**
     * 定位的坐标
     */
    private CoordinateDTO coordinate;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}
