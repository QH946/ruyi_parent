package com.ruyi.mapper;


import com.github.pagehelper.Page;
import com.ruyi.annotation.AutoFill;
import com.ruyi.constant.AutoFillConstant;
import com.ruyi.dto.CategoryPageQueryDTO;
import com.ruyi.entity.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryMapper {

    //新增分类
    @AutoFill(type = AutoFillConstant.INSERT)
    void insert(Category category);

    //分类信息分页查询
    Page<Category> pageQuery(CategoryPageQueryDTO categoryPageQueryDTO);

    //删除分类
    void deleteById(Long id);

    @AutoFill(type = AutoFillConstant.UPDATE)
    //修改分类
    void update(Category category);

    //根据类型查询分类
    List<Category> list(Integer type);
}
