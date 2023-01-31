package io.pifind.poi.api;

import io.pifind.common.response.R;

import javax.validation.constraints.NotNull;

/**
 * 兴趣点社交服务服务
 * <p>
 *     社交服务包括浏览、收藏、评分等服务，因为这些服务都属于高频服务，
 *     所以这里需要进行单独列出
 * </p>
 */
public interface InterestPointSocialService {


    /**
     * 兴趣点的浏览量增加 1
     * @param id 兴趣点ID
     * @return 返回值类型为 {@link Boolean}
     * <ul>
     *     <li><b>浏览量增加成功</b> - 返回 {@code true}</li>
     *     <li><b>浏览量增加失败</b> - 返回 {@code false}，且会在 {@link R#getMessage()} 中说明原因</li>
     * </ul>
     */
    R<Boolean> browse(@NotNull Long id);

    /**
     * 兴趣点的收藏量增加 1
     * @param id 兴趣点ID
     * @return 返回值类型为 {@link Boolean}
     * <ul>
     *     <li><b>收藏量增加成功</b> - 返回 {@code true}</li>
     *     <li><b>收藏量增加失败</b> - 返回 {@code false}，且会在 {@link R#getMessage()} 中说明原因</li>
     * </ul>
     */
    R<Boolean> collect(@NotNull Long id);

    /**
     * 对兴趣点进行评价
     * @param id 兴趣点ID
     * @param score 用户的评分
     * @return 返回值类型为 {@link Boolean}
     * <ul>
     *     <li><b>收藏量增加成功</b> - 返回 {@code true}</li>
     *     <li><b>收藏量增加失败</b> - 返回 {@code false}，且会在 {@link R#getMessage()} 中说明原因</li>
     * </ul>
     */
    R<Boolean> evaluate(@NotNull Long id,@NotNull Double score);

}
