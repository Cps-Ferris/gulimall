package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author Cai Peishen
 * @email peishen.cai@foxmail.com
 * @date 2021-02-03 09:37:03
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
