package io.pifind.poi.api;

import io.pifind.common.response.R;
import io.pifind.poi.model.CompanyDTO;

import javax.validation.constraints.NotNull;

/**
 * 公司服务
 */
public interface ICompanyService {

    /**
     * 增加一家公司
     * @param company {@link CompanyDTO 公司实体对象}
     * @return 返回值类型为 {@link Boolean}
     * <p>
     *     <ul>
     *         <li><b>添加公司成功</b> - 返回 {@code true}</li>
     *         <li><b>添加公司失败</b> - 返回 {@code false}，且会在 {@link R#getMessage()} 中说明原因</li>
     *     </ul>
     * </p>
     */
    R<Boolean> addCompany(@NotNull CompanyDTO company);

}
