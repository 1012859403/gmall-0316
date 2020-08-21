package com.atguigu.gmall.sms.mapper;

import com.atguigu.gmall.sms.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author mjw
 * @email mjw@atguigu.com
 * @date 2020-08-21 20:32:21
 */
@Mapper
public interface CouponMapper extends BaseMapper<CouponEntity> {
	
}
