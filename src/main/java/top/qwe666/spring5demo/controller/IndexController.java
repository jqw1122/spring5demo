package top.qwe666.spring5demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.qwe666.spring5demo.entity.User;
import top.qwe666.spring5demo.service.IndexService;

import java.util.List;

/**
 * @author jqw1122@foxmail.com
 * @description
 * @date 2018-07-30 9:04 AM
 */
@Api(description = "demo")
@Controller
@RequestMapping()
public class IndexController {
    @Autowired
    private IndexService indexService;

    @ApiOperation(value="hello world")
    @GetMapping("/hello")
    @ResponseBody
    public String hw(){
        return "hello world!";
    }

    @ApiOperation(value="首页")
    @GetMapping()
    public String index(){
        return "index";
    }

    @ApiOperation(value="查询所有用户")
    @GetMapping("/list")
    @ResponseBody
    public List<User> list(){
        List<User> list = indexService.listAll();
        return list;
    }

    /**
     * @author jqw1122@foxmail.com
     * @description 根据昵称查询用户
     * @date 7/30/2018 2:02 PM
     */
    @ApiOperation(value="根据昵称查询用户")
    @ApiImplicitParam(value = "昵称",name = "nickname", required = true, example = "张")
    @GetMapping("/mplist/{nickname}")
    @ResponseBody
    public List<User> mplist(@PathVariable("nickname") String nickname){
        List<User> list = indexService.mplist(nickname);
        return list;
    }
}
