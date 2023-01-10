package io.pifind.poi.api;

import io.pifind.common.response.R;
import io.pifind.poi.model.TagDTO;

/**
 * 公司标签服务
 */
public interface ICompanyTagService {

    /**
     * 添加一个标签
     * @param tag {@link TagDTO 标签实体对象}
     * @return 返回值类型为 {@link Boolean}
     * <p>
     *     <ul>
     *         <li><b>添加标签成功</b> - 返回 {@code true}</li>
     *         <li><b>添加标签失败</b> - 返回 {@code false}，且会在 {@link R#getMessage()} 中说明原因</li>
     *     </ul>
     * </p>
     */
    R<Boolean> addTag(TagDTO tag);

}
