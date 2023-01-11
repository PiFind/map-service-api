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
     * @param id 类别ID
     * @return 返回值类型为 {@link CategoryDTO}
     * <p>
     *     <ul>
     *         <li><b>存在类别</b> - 返回 {@link CategoryDTO 类别实体对象} </li>
     *         <li><b>不存在类别</b> - 返回 {@code null} </li>
     *     </ul>
     * </p>
     */
    R<CategoryDTO> getCategoryById(String id);


    /**
     * 修改类别信息
     * @param modifiedCategory 修改过后的{@link CategoryDTO 类别实体对象}
     * @return 返回值类型为 {@link Boolean}
     * <p>
     *     <ul>
     *         <li><b>修改类别成功</b> - 返回 {@code true}</li>
     *         <li><b>修改类别失败</b> - 返回 {@code false}，且会在 {@link R#getMessage()} 中说明原因</li>
     *     </ul>
     * </p>
     */
    R<Boolean> modifyCategory(CategoryDTO modifiedCategory);

    /**
     * 通过类别ID删除类别
     * <p>
     *     <font style="color:red;">
     *     <b>注意：</b> 如果删除的类别下有子类别，那么也会删除其子类别
     *     </font>
     * </p>
     * @param id 类被ID
     * @return 返回值类型为 {@link Boolean}
     * <p>
     *     <ul>
     *         <li><b>删除类别成功</b> - 返回 {@code true}</li>
     *         <li><b>删除类别失败</b> - 返回 {@code false}，且会在 {@link R#getMessage()} 中说明原因</li>
     *     </ul>
     * </p>
     */
    R<Boolean> removeCategoryById(String id);

}
