package io.pifind.place.api;

import io.pifind.common.response.R;
import io.pifind.place.model.AdministrativeAreaDTO;
import io.pifind.place.model.LocationDTO;

import javax.validation.constraints.NotNull;

/**
 * 定位服务
 */
public interface IPositioningService {

    /**
     * 通过IP进行定位
     * @param ip 需要定位的目标IP
     * @return 返回值类型为 {@link LocationDTO}
     * <ul>
     *     <li><b>IP正确</b> 且 <b>数据库存在记录</b> - 返回 {@link LocationDTO 位置实体}</li>
     *     <li><b>IP不正确</b> 或 <b>数据库不存在记录</b> - 返回 {@code null}</li>
     * </ul>
     */
    R<LocationDTO> getLocationByIP(@NotNull String ip);

}
