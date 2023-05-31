package com.ling.lingmall.product.dao;

import com.ling.lingmall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author LingAristotle
 * @email 2397328561@qq.com
 * @date 2023-05-31 10:28:44
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
