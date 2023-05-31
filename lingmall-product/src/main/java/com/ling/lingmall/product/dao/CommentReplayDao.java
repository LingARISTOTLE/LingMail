package com.ling.lingmall.product.dao;

import com.ling.lingmall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author LingAristotle
 * @email 2397328561@qq.com
 * @date 2023-05-31 10:28:45
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
