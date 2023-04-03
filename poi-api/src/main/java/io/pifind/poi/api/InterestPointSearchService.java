package io.pifind.poi.api;

import io.pifind.common.response.Page;
import io.pifind.common.response.R;
import io.pifind.place.model.AdministrativeAreaDTO;
import io.pifind.poi.constant.SortOrderEnum;
import io.pifind.poi.constant.SortReferenceEnum;
import io.pifind.poi.model.dto.CategoryDTO;
import io.pifind.poi.model.vo.InterestPointVO;

import javax.validation.constraints.NotNull;

/**
 * 兴趣点搜索服务
 * <p>
 *     本类中的方法返回值均为 {@link Page } 类型
 * </p>
 * @see Page
 */
public interface InterestPointSearchService {

    /**
     * 通过地区和关键词搜索兴趣点 (模糊搜索)
     * @param pageSize 页大小（一页最多存放多少条数据）
     * @param currentPage 当前页
     * @param areaId 搜索的区域的ID (参考 : {@link AdministrativeAreaDTO})
     * @param keyword 关键词
     * @param sortOrder 排序模式
     * @param reference 排序参考字段
     * @return 返回值类型为 {@link Page } ，如果没有搜索到结果 {@link Page#getTotal() } 将为 0
     * @see AdministrativeAreaDTO
     */
    R<Page<InterestPointVO>> searchPointsByAreaAndKeywords(
            @NotNull Integer pageSize,
            @NotNull Integer currentPage,
            @NotNull Long areaId,
            @NotNull String keyword,
            @NotNull SortOrderEnum sortOrder,
            @NotNull SortReferenceEnum reference
    );

    /**
     * 通过地区和类别搜索兴趣点
     * @param pageSize 页大小（一页最多存放多少条数据）
     * @param currentPage 当前页
     * @param areaId 搜索的区域的ID (参考 : {@link AdministrativeAreaDTO} )
     * @param categoryId 搜索的类别的ID (参考 : {@link CategoryDTO} )
     * @param sortOrder 排序模式
     * @param reference 排序参考字段
     * @return 返回值类型为 {@link Page } ，如果没有搜索到结果 {@link Page#getTotal() } 将为 0
     * @see AdministrativeAreaDTO
     * @see CategoryDTO
     */
    R<Page<InterestPointVO>> searchPointsByAreaAndCategory(
            @NotNull Integer pageSize,
            @NotNull Integer currentPage,
            @NotNull Long areaId,
            @NotNull Long categoryId,
            @NotNull SortOrderEnum sortOrder,
            @NotNull SortReferenceEnum reference
    );

    /**
     * 通过地区、类别和关键字搜索兴趣点（模糊搜索）
     * @param pageSize 页大小（一页最多存放多少条数据）
     * @param currentPage 当前页
     * @param areaId 搜索的区域的ID (参考 : {@link AdministrativeAreaDTO})
     * @param categoryId 搜索的类别的ID (参考 : {@link CategoryDTO})
     * @param keyword 关键词
     * @param sortOrder 排序模式
     * @param reference 排序参考字段
     * @return {@link Page } ，如果没有搜索到结果 {@link Page#getTotal() } 将为 0
     * @see AdministrativeAreaDTO
     * @see CategoryDTO
     */
    R<Page<InterestPointVO>> searchPointsByAreaAndCategoryAndKeywords(
            @NotNull Integer pageSize,
            @NotNull Integer currentPage,
            @NotNull Long areaId,
            @NotNull Long categoryId,
            @NotNull String keyword,
            @NotNull SortOrderEnum sortOrder,
            @NotNull SortReferenceEnum reference
    );

}