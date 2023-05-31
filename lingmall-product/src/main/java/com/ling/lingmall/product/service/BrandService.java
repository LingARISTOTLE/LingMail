package com.ling.lingmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ling.common.utils.PageUtils;
import com.ling.lingmall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author LingAristotle
 * @email 2397328561@qq.com
 * @date 2023-05-31 10:28:44
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

