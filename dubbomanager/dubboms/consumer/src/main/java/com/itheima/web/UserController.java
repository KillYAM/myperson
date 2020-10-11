package com.itheima.web;

import com.itheima.pojo.User;
import com.itheima.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class UserController {

    @Reference
    private UserService userService;

    @RequestMapping("/index")
    public List<User> userFindAll(){
        List<User> list = userService.list();
        return list;
    }

    @RequestMapping("/deleteUser")
    public String userDelete(HttpServletRequest req){
        String id = req.getParameter("id");
        boolean b = userService.removeById(id);
        return b+"";
    }
}
