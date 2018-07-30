package top.qwe666.spring5demo.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.qwe666.spring5demo.dao.UserMapper;
import top.qwe666.spring5demo.entity.User;
import top.qwe666.spring5demo.service.IndexService;

import java.util.List;

/**
 * @author jqw1122@foxmail.com
 * @description
 * @date 2018-07-30 9:55 AM
 */
@Service
public class IndexServiceImpl implements IndexService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> listAll() {
       return userMapper.listAll();
    }

    @Override
    public List<User> mplist(String nickname) {
        //传统方式
        List<User> list = userMapper.selectList(new EntityWrapper<User>().like("nickname", nickname));
        //ActiveRecord
        List<User> list1 = User.dao.selectList(new EntityWrapper<User>().like("nickname", nickname));

        return list;
    }
}
