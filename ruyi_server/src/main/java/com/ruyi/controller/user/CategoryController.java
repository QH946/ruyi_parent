package com.ruyi.controller.user;

import com.ruyi.entity.Category;
import com.ruyi.result.R;
import com.ruyi.service.CategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("userCategoryController")
@RequestMapping("/user/category")
@Api(tags = "C端-分类接口")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    /**
     * 查询分类
     *
     * @param type 分类类型
     * @return 所有  菜品/套餐
     */
    @GetMapping("/list")
    @ApiOperation("查询分类")
    public R<List<Category>> list(Integer type) {
        List<Category> list = categoryService.list(type);
        return R.success(list);
    }
}
