package io.pifind.place.model;

import io.pifind.map.model.CoordinateDTO;
import lombok.Data;

/**
 * 位置实体类
 */
@Data
public class LocationDTO {

    /**
     * 地点拼接好的全名
     */
    private String fullName ;

    /**
     * 位置名
     */
    private String name;

    /**
     * 丢失坐标标志
     * <p>
     *     判断是否能通过 {@link #getCoordinate()} 获取到经纬度坐标
     *     <ul>
     *         <li>{@code true} - <b>不能</b>获取经纬度定位 ({@link #getCoordinate()} 为 {@code null})</li>
     *         <li>{@code false} - <b>能</b>获取经纬度定位 (可以通过 {@link #getCoordinate()} 获取到经纬度的值)</li>
     *     </ul>
     * </p>
     */
    private boolean missingCoordinate;

    /**
     * 定位的坐标
     */
    private CoordinateDTO coordinate;

    /**
     * 定位到的行政区
     * <p>
     *     <font style="color:red;">
     *     <b>注意：</b> 只定位一层深度，即返回值的 {@link AdministrativeAreaDTO#getAreas()} 为 {@code null}
     *     </font>
     * </p>
     */
    private AdministrativeAreaDTO administrativeArea;

}
