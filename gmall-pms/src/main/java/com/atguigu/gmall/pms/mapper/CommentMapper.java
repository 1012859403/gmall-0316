package com.atguigu.gmall.pms.mapper;

import com.atguigu.gmall.pms.entity.CommentEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价
 * 
 * @author mjw
 * @email mjw@atguigu.com
 * @date 2020-08-21 19:36:39
 */
@Mapper
public interface CommentMapper extends BaseMapper<CommentEntity> {
	
}
