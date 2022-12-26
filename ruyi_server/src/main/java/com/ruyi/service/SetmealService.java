package com.ruyi.service;

import com.ruyi.dto.SetmealDTO;
import com.ruyi.dto.SetmealPageQueryDTO;
import com.ruyi.entity.Setmeal;
import com.ruyi.result.PageResult;
import com.ruyi.vo.DishItemVO;
import com.ruyi.vo.SetmealVO;

import java.util.List;

/**
 * 套餐操作
 */
public interface SetmealService {

    //新增套餐
    void saveWithDish(SetmealDTO setmealDTO);

    //套餐分页查询
    PageResult pageQuery(SetmealPageQueryDTO setmealPageQueryDTO);

    //批量删除的套餐
    void deleteBatch(List<Long> ids);

    //id查询套餐
    SetmealVO getById(Long id);

    //修改套餐
    void update(SetmealDTO setmealDTO);

    //套餐 启用禁用
    void startOrStop(Integer status, Long id);


    //条件查询
    List<Setmeal> list(Setmeal setmeal);

    //根据id查询菜品选项
    List<DishItemVO> getDishItemById(Long id);
}
