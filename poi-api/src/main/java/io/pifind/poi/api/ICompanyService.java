package io.pifind.poi.api;

import io.pifind.common.response.R;
import io.pifind.poi.model.CompanyDTO;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * 公司服务
 */
public interface ICompanyService {

    /**
     * 增加一家公司
     * @param company {@link CompanyDTO 公司实体对象}
     * @return 返回值类型为 {@link Boolean}
     * <ul>
     *     <li><b>添加公司成功</b> - 返回 {@code true}</li>
     *     <li><b>添加公司失败</b> - 返回 {@code false}，且会在 {@link R#getMessage()} 中说明原因</li>
     * </ul>
     */
    R<Boolean> addCompany(@NotNull CompanyDTO company);

    /**
     * 通过公司ID获取公司实体对象
     * @param id 公司ID
     * @return 返回值类型为 {@link CompanyDTO}
     * <ul>
     *     <li><b>存在公司</b> - 返回 {@link CompanyDTO 公司实体对象} </li>
     *     <li><b>不存在公司</b> - 返回 {@code null} </li>
     * </ul>
     */
    R<CompanyDTO> getCompanyById(@NotNull @NotEmpty  String id);

    /**
     * 修改公司信息
     * @param modifiedCompany 修改过公司信息后的{@link CompanyDTO 公司实体对象}
     * @return 返回值类型为 {@link Boolean}
     * <ul>
     *     <li><b>修改公司成功</b> - 返回 {@code true}</li>
     *     <li><b>修改公司失败</b> - 返回 {@code false}，且会在 {@link R#getMessage()} 中说明原因</li>
     * </ul>
     */
    R<Boolean> modifyCompany(@NotNull CompanyDTO modifiedCompany);

    /**
     * 通过公司ID删除公司
     * @param id 公司ID
     * @return 返回值类型为 {@link Boolean}
     * <ul>
     *     <li><b>删除公司成功</b> - 返回 {@code true}</li>
     *     <li><b>删除公司失败</b> - 返回 {@code false}，且会在 {@link R#getMessage()} 中说明原因</li>
     * </ul>
     */
    R<Boolean> removeCompanyById(@NotEmpty String id);

}
