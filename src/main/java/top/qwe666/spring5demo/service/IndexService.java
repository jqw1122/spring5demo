package top.qwe666.spring5demo.service;

import top.qwe666.spring5demo.entity.User;

import java.util.List;

/**
 * @author jqw1122@foxmail.com
 * @description
 * @date 2018-07-30 9:54 AM
 */
public interface IndexService {
    List<User> listAll();

    List<User> mplist(String nickname);
}
