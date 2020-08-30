package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author Birdie
 * @email BirdieForLove@gmail.com
 * @date 2020-08-30 14:49:23
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
