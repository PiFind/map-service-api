package io.pifind.poi.api;

import io.pifind.common.response.R;
import io.pifind.poi.model.InterestPointDTO;

import javax.validation.constraints.NotNull;

/**
 * 兴趣点基础服务
 * <p>
 *     该服务包含了除搜索服务外的增删改查（简单查询）等方法
 * </p>
 */
public interface InterestPointBaseService {

    /**
     * 添加一个兴趣点
     * @param interestPoint {@link InterestPointDTO 兴趣点实体对象}
     * @return 无返回值
     * <ul>
     *     <li><b>添加兴趣点成功</b> - 返回成功响应 {@code code == 0}</li>
     *     <li><b>添加兴趣点失败</b> - 返回失败响应 {@code code != 0}，且会在 {@link R#getMessage()} 中说明原因</li>
     * </ul>
     */
    R<Void> addInterestPoint(@NotNull InterestPointDTO interestPoint);

    /**
     * 根据兴趣点ID获取兴趣点
     * @param id 兴趣点ID
     * @return 返回值类型为 {@link InterestPointDTO}
     * <ul>
     *     <li><b>查询到兴趣点</b> - 返回 {@link InterestPointDTO 兴趣点实体对象}</li>
     *     <li><b>没有查询到兴趣点</b> - 返回 {@code false}，且会在 {@code null}</li>
     * </ul>
     */
    R<InterestPointDTO> getInterestPointById(@NotNull Long id);

    /**
     *
     * @param modifiedInterestPoint 修改过兴趣点信息后的{@link InterestPointDTO 兴趣点实体对象}
     * @return 无返回值
     * <ul>
     *     <li><b>修改兴趣点成功</b> - 返回成功响应 {@code code == 0}</li>
     *     <li><b>修改兴趣点失败</b> - 返回失败响应 {@code code != 0}，且会在 {@link R#getMessage()} 中说明原因</li>
     * </ul>
     */
    R<Void> modifyInterestPoint(@NotNull InterestPointDTO modifiedInterestPoint);

    /**
     * 根据兴趣点ID删除兴趣点
     * @param id 兴趣点ID
     * @return 无返回值
     * <ul>
     *     <li><b>删除兴趣点成功</b> - 返回成功响应 {@code code == 0}</li>
     *     <li><b>删除兴趣点失败</b> - 返回失败响应 {@code code != 0}，且会在 {@link R#getMessage()} 中说明原因</li>
     * </ul>
     */
    R<Void> removeInterestPointById(@NotNull Long id);

}
