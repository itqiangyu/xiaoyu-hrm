package com.xiaoyu.hrm.controller;

import com.xiaoyu.hrm.pojo.Menu;
import com.xiaoyu.hrm.pojo.Meta;
import com.xiaoyu.hrm.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author xiaoyu
 * @date 2020/3/18 14:03
 */
@RestController
public class IndexMenuController {

    @Autowired
    MenuService menuService;

    /**
     * 获取菜单栏所有信息
     * @return
     */
    @GetMapping("/system/config/menu")
    public List<Menu> getMenu() {
        return menuService.getAllMenus();
    }

}
