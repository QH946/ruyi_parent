package com.ruyi.mapper;

import com.github.pagehelper.Page;
import com.ruyi.annotation.AutoFill;
import com.ruyi.constant.AutoFillConstant;
import com.ruyi.dto.SetmealPageQueryDTO;
import com.ruyi.entity.Setmeal;
import com.ruyi.vo.SetmealVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface SetmealMapper {

    //根据分类id查询对应的套餐数量
    Long cuntByCategoryId(Long id);

    //根据套餐id更新套餐数据
    @AutoFill(type = AutoFillConstant.UPDATE)
    void updatesByIds(Setmeal setmeal);

    //套餐表插入数据
    @AutoFill(type = AutoFillConstant.INSERT)
    void insert(Setmeal setmeal);

    //套餐分页查询
    Page<SetmealVO> pageQuery(SetmealPageQueryDTO setmealPageQueryDTO);

    //通过套餐id查找套餐数据
    Setmeal getById(Long id);

    //套餐ids删除套餐表中的数据
    void deleteById(List<Long> ids);

    //id查询套餐查询所有套餐关联数据
    SetmealVO getByIdWithDish(Long id);

    //动态条件查询套餐
    List<Setmeal> list(Setmeal setmeal);

    //根据条件统计套餐数量
    Integer countByMap(Map map);
}
