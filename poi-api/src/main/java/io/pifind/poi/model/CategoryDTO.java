package io.pifind.poi.model;

import lombok.Data;

import java.util.List;

/**
 * 类别
 */
@Data
public class CategoryDTO {

    /**
     * 主键
     */
    private Long id;

    /**
     * 类别名
     */
    private String name;

    /**
     * 上级分类的ID
     */
    private Long superior;

    /**
     * 该类目下的所有子类
     */
    private List<CategoryDTO> categories;

}
