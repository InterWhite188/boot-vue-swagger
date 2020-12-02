package com.epoch.user.mapper;

import com.epoch.user.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @return
 * @author dangsk
 * @date 2020/8/21 15:05
 * @decription
 * @modify
 */

@Mapper
@Repository
public interface UserMapper {

    public List<User> findUserByName(String userName);

    public List<User> ListUser();

    public List<User> queryPage(Integer startRows);

    public int getRowCount();

    public int insertUser(User user);

    public int delete(int userId);

    public int Update(User user);
}
