package com.linksyi.readwritebranch.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.linksyi.readwritebranch.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper extends BaseMapper<User> {


    /**
     * 批量根据主键查询用户详情
     * @param ids 用户主键
     * @return 用户详情数据
     * TODO 真实业务场景返回值请自行创建VO
     */
    List<Map<String, ?>> queryUserDetailsByIds(@Param("ids") List<Long> ids);
}
