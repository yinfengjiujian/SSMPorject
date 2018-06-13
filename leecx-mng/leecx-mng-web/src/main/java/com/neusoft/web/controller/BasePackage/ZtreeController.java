package com.neusoft.web.controller.BasePackage;

import com.neusoft.web.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * <p>Title: com.neusoft.web.controller.BasePackage</p>
 * <p>Company:东软集团(neusoft)</p>
 * <p>Copyright:Copyright(c)2018</p>
 * User: 段美林
 * Date: 2018/6/13 12:33
 * Description: 树形例子
 */
@Controller
@RequestMapping("/ztree")
public class ZtreeController extends BaseController{

    @RequestMapping("/demo")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("ztree/ztreeDemo");
        return modelAndView;
    }

    @RequestMapping("/jsonTree")
    public ModelAndView JsonTree() {
        ModelAndView modelAndView = new ModelAndView("ztree/ztreeForJson");
        return modelAndView;
    }

    @RequestMapping("/treeClick")
    public ModelAndView treeClick() {
        ModelAndView modelAndView = new ModelAndView("ztree/ztreeClickNode");
        return modelAndView;
    }

    @RequestMapping("/treeCheckBox")
    public ModelAndView treeCheckBox() {
        ModelAndView modelAndView = new ModelAndView("ztree/ztreeCheckBox");
        return modelAndView;
    }

    @RequestMapping("/treeIconSkin")
    public ModelAndView treeIconSkin() {
        ModelAndView modelAndView = new ModelAndView("ztree/ztreeIconSkin");
        return modelAndView;
    }
}
