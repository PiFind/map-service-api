package io.pifind.poi.api;

import io.pifind.common.response.Page;
import io.pifind.common.response.R;
import io.pifind.map.model.CoordinateDTO;
import io.pifind.place.model.AdministrativeAreaDTO;
import io.pifind.poi.model.CategoryDTO;
import io.pifind.poi.model.InterestPointDTO;

import javax.validation.constraints.NotNull;
import java.util.List;

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
     * @param keywords 关键词
     * @return 返回值类型为 {@link Page } ，如果没有搜索到结果 {@link Page#getTotal() } 将为 0
     * @see AdministrativeAreaDTO
     */
    R<Page<InterestPointDTO>> searchPointsByAreaAndKeywords(
            @NotNull Integer pageSize,
            @NotNull Integer currentPage,
            @NotNull Long areaId,
            @NotNull List<String> keywords
    );

    /**
     * 通过地区和类别搜索兴趣点
     * @param pageSize 页大小（一页最多存放多少条数据）
     * @param currentPage 当前页
     * @param areaId 搜索的区域的ID (参考 : {@link AdministrativeAreaDTO} )
     * @param categoryId 搜索的类别的ID (参考 : {@link CategoryDTO} )
     * @return 返回值类型为 {@link Page } ，如果没有搜索到结果 {@link Page#getTotal() } 将为 0
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
     * @param areaId 搜索的区域的ID (参考 : {@link AdministrativeAreaDTO})
     * @param categoryId 搜索的类别的ID (参考 : {@link CategoryDTO})
     * @param keywords 关键词
     * @return {@link Page } ，如果没有搜索到结果 {@link Page#getTotal() } 将为 0
     * @see AdministrativeAreaDTO
     * @see CategoryDTO
     */
    R<Page<InterestPointDTO>> searchPointsByAreaAndCategoryAndKeywords(
            @NotNull Integer pageSize,
            @NotNull Integer currentPage,
            @NotNull Long areaId,
            @NotNull Long categoryId,
            @NotNull List<String> keywords
    );

    /**
     * 通过坐标、类别搜索<b>附近的兴趣点</b>
     * @param pageSize 页大小（一页最多存放多少条数据）
     * @param currentPage 当前页
     * @param coordinate 当前坐标
     * @param range 以当前坐标为圆心，半径为 range 的范围搜索目标，单位：米
     * @param categoryId 搜索的类别的ID (参考 : {@link CategoryDTO})
     * @return {@link Page } ，如果没有搜索到结果 {@link Page#getTotal() } 将为 0
     * @see CategoryDTO
     */
    R<Page<InterestPointDTO>> searchNearbyPoints(
            @NotNull Integer pageSize,
            @NotNull Integer currentPage,
            @NotNull CoordinateDTO coordinate,
            @NotNull Integer range,
            @NotNull Long categoryId
    );

}
