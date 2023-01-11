package io.pifind.poi.api;

import io.pifind.common.response.Page;
import io.pifind.common.response.R;
import io.pifind.place.model.AdministrativeAreaDTO;
import io.pifind.poi.model.CategoryDTO;
import io.pifind.poi.model.InterestPointDTO;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * 兴趣点搜索服务
 */
public interface InterestPointSearchService {

    /**
     * 通过地区和关键词搜索兴趣点 (模糊搜索)
     * @param pageSize 页大小（一页最多存放多少条数据）
     * @param currentPage 当前页
     * @param areaId 搜索的区域的ID (参考 : {@link AdministrativeAreaDTO#getId()})
     * @param keywords 关键词
     * @return 返回值类型为 {@link Page< InterestPointDTO > } ，如果没有搜索到结果 {@link Page#getTotal() } 将为 0
     * @see AdministrativeAreaDTO
     */
    R<Page<InterestPointDTO>> searchPointsByAreaAndKeyword(
            @NotNull Integer pageSize,
            @NotNull Integer currentPage,
            @NotNull Long areaId,
            @NotNull List<String> keywords
    );

    /**
     * 通过地区和类别搜索兴趣点
     * @param pageSize 页大小（一页最多存放多少条数据）
     * @param currentPage 当前页
     * @param areaId 搜索的区域的ID (参考 : {@link AdministrativeAreaDTO#getId()})
     * @param categoryId 搜索的类别的ID (参考 : {@link CategoryDTO#getId()})
     * @return 返回值类型为 {@link Page< InterestPointDTO > } ，如果没有搜索到结果 {@link Page#getTotal() } 将为 0
     * @see AdministrativeAreaDTO
     * @see CategoryDTO
     */
    R<Page<InterestPointDTO>> searchPointsByAreaAndCategory(
            @NotNull Integer pageSize,
            @NotNull Integer currentPage,
            @NotNull Long areaId,
            @NotNull Long categoryId
    );

    /**
     * 通过地区、类别和关键字搜索兴趣点（模糊搜索）
     * @param pageSize 页大小（一页最多存放多少条数据）
     * @param currentPage 当前页
     * @param areaId 搜索的区域的ID (参考 : {@link AdministrativeAreaDTO#getId()})
     * @param categoryId 搜索的类别的ID (参考 : {@link CategoryDTO#getId()})
     * @param keywords 关键词
     * @return {@link Page< InterestPointDTO >} ，如果没有搜索到结果 {@link Page#getTotal() } 将为 0
     * @see AdministrativeAreaDTO
     * @see CategoryDTO
     */
    R<Page<InterestPointDTO>> searchPointsByAreaAndCategory(
            @NotNull Integer pageSize,
            @NotNull Integer currentPage,
            @NotNull Long areaId,
            @NotNull Long categoryId,
            @NotNull List<String> keywords
    );

}
