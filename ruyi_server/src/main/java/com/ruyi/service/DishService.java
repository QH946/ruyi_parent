package com.ruyi.service;

import com.ruyi.dto.DishDTO;
import com.ruyi.dto.DishPageQueryDTO;
import com.ruyi.entity.Dish;
import com.ruyi.result.PageResult;
import com.ruyi.vo.DishVO;

import java.util.List;

/**
 * 菜品操作
 */
public interface DishService {

    //添加菜品
    void save(DishDTO dishDTO);

    //菜品信息分页查询
    PageResult page(DishPageQueryDTO dishPageQueryDTO);

    //批量删除菜品
    void delete(List<Long> ids);

    //根据id查询菜品和关联的口味
    DishVO getByIdWithFlavor(Long id);

    //修改菜品
    void updateWithFlavor(DishDTO dishDTO);

    //菜品起售、停售
    void startOrStop(Integer status, Long id);

    //根据分类id查询菜品
    List<Dish> list(Long categoryId, String name);

    // 条件查询菜品和口味
    List<DishVO> listWithFlavor(Dish dish);
}
