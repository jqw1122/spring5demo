package top.qwe666.spring5demo.dao;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import top.qwe666.spring5demo.entity.User;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {

    List<User> listAll();
}