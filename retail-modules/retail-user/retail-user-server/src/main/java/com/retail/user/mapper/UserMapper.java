package com.retail.user.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.retail.user.domain.UserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户表
 *
 * @author fengge
 * @email 1287137373@qq.com
 * @date 2023-03-22 18:26:56
 */
@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {

}
