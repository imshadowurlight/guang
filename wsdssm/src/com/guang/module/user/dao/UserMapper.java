package com.guang.module.user.dao;


import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.guang.module.user.po.User;
import com.guang.module.user.po.UserExample;

public interface UserMapper {
    @Deprecated
	int countByExample(UserExample example);

    @Deprecated
    int deleteByExample(UserExample example);

    @Deprecated
    int deleteByPrimaryKey(Integer id);

    /**
     * 插入一条用户记录
     * */
    int insert(User record);

    @Deprecated
    int insertSelective(User record);

    @Deprecated
    List<User> selectByExample(UserExample example);

    @Deprecated
    User selectByPrimaryKey(Integer id);

    @Deprecated
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    @Deprecated
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    @Deprecated
    int updateByPrimaryKeySelective(User record);

    @Deprecated
    int updateByPrimaryKey(User record);

    @Deprecated
	List<User> selectUsers();

    /**
	 * 查看用户列表
	 * */
	List<User> userList(Map map);

	/**
	 * 获取数据记录数
	 * */
	int getUsersSize(Map map);

	/**
	 * 删除用户
	 * */
	void deleteUser(User user);
}