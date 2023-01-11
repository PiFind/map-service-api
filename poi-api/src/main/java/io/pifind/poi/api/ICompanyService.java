package io.pifind.poi.api;

import io.pifind.common.response.Page;
import io.pifind.common.response.R;
import io.pifind.place.model.AdministrativeAreaDTO;
import io.pifind.poi.model.CategoryDTO;
import io.pifind.poi.model.CompanyDTO;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

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

    /**
     * 通过公司ID获取公司实体对象
     * @param id 公司ID
     * @return 返回值类型为 {@link CompanyDTO}
     * <p>
     *     <ul>
     *         <li><b>存在公司</b> - 返回 {@link CompanyDTO 公司实体对象} </li>
     *         <li><b>不存在公司</b> - 返回 {@code null} </li>
     *     </ul>
     * </p>
     */
    R<CompanyDTO> getCompanyById(@NotNull @NotEmpty  String id);

    /**
     * 修改公司信息
     * @param modifiedCompany 修改过公司信息后的{@link CompanyDTO 公司实体对象}
     * @return 返回值类型为 {@link Boolean}
     * <p>
     *     <ul>
     *         <li><b>修改公司成功</b> - 返回 {@code true}</li>
     *         <li><b>修改公司失败</b> - 返回 {@code false}，且会在 {@link R#getMessage()} 中说明原因</li>
     *     </ul>
     * </p>
     */
    R<Boolean> modifyCompany(@NotNull CompanyDTO modifiedCompany);

    /**
     * 通过公司ID删除公司
     * @param id 公司ID
     * @return 返回值类型为 {@link Boolean}
     * <p>
     *     <ul>
     *         <li><b>删除公司成功</b> - 返回 {@code true}</li>
     *         <li><b>删除公司失败</b> - 返回 {@code false}，且会在 {@link R#getMessage()} 中说明原因</li>
     *     </ul>
     * </p>
     */
    R<Boolean> removeCompanyById(@NotNull @NotEmpty String id);


    /**
     * 通过地区和关键词搜索公司 (模糊搜索)
     * @param pageSize 页大小（一页最多存放多少条数据）
     * @param currentPage 当前页
     * @param areaId 搜索的区域的ID (参考 : {@link AdministrativeAreaDTO#getId()})
     * @param keywords 关键词
     * @return 返回值类型为 {@link Page<CompanyDTO>} ，如果没有搜索到结果 {@link Page#getTotal() } 将为 0
     * @see AdministrativeAreaDTO
     */
    R<Page<CompanyDTO>> searchCompaniesByAreaAndKeyword(
            @NotNull Integer pageSize,
            @NotNull Integer currentPage,
            @NotNull Long areaId,
            @NotNull List<String> keywords
    );

    /**
     * 通过地区和类别搜索公司
     * @param pageSize 页大小（一页最多存放多少条数据）
     * @param currentPage 当前页
     * @param areaId 搜索的区域的ID (参考 : {@link AdministrativeAreaDTO#getId()})
     * @param categoryId 搜索的类别的ID (参考 : {@link CategoryDTO#getId()})
     * @return 返回值类型为 {@link Page<CompanyDTO>} ，如果没有搜索到结果 {@link Page#getTotal() } 将为 0
     * @see AdministrativeAreaDTO
     * @see CategoryDTO
     */
    R<Page<CompanyDTO>> searchCompaniesByAreaAndCategory(
            @NotNull Integer pageSize,
            @NotNull Integer currentPage,
            @NotNull Long areaId,
            @NotNull Long categoryId
    );

    /**
     * 通过地区、类别和关键字搜索公司（模糊搜索）
     * @param pageSize 页大小（一页最多存放多少条数据）
     * @param currentPage 当前页
     * @param areaId 搜索的区域的ID (参考 : {@link AdministrativeAreaDTO#getId()})
     * @param categoryId 搜索的类别的ID (参考 : {@link CategoryDTO#getId()})
     * @param keywords 关键词
     * @return {@link Page<CompanyDTO>} ，如果没有搜索到结果 {@link Page#getTotal() } 将为 0
     * @see AdministrativeAreaDTO
     * @see CategoryDTO
     */
    R<Page<CompanyDTO>> searchCompaniesByAreaAndCategory(
            @NotNull Integer pageSize,
            @NotNull Integer currentPage,
            @NotNull Long areaId,
            @NotNull Long categoryId,
            @NotNull List<String> keywords
    );

}
