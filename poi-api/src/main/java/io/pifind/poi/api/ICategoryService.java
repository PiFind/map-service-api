package io.pifind.poi.api;

import io.pifind.common.response.R;
import io.pifind.poi.model.CategoryDTO;

/**
 * 公司标签服务
 */
public interface ICategoryService {

    /**
     * 添加一个类别
     * @param category {@link CategoryDTO 类别实体对象}
     * @return 返回值类型为 {@link Boolean}
     * <p>
     *     <ul>
     *         <li><b>添加类别成功</b> - 返回 {@code true}</li>
     *         <li><b>添加类别失败</b> - 返回 {@code false}，且会在 {@link R#getMessage()} 中说明原因</li>
     *     </ul>
     * </p>
     */
    R<Boolean> addCategory(CategoryDTO category);

    /**
     * 根据类别ID获取类别实体对象
     * @param id
     * @return
     */
    R<CategoryDTO> getCategoryById(String id);

}
