package com.neusoft.web.controller.BasePackage;

import com.neusoft.common.pojo.ZTreeNode;
import com.neusoft.web.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

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
public class ZtreeController extends BaseController {

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

    @RequestMapping("/treeAsync")
    public ModelAndView treeAsync() {
        ModelAndView modelAndView = new ModelAndView("ztree/ztreeAsyncDemo");
        return modelAndView;
    }

    @RequestMapping(value = "/getTree", method = RequestMethod.POST)
    @ResponseBody
    public List<ZTreeNode> getTree() {
        List<ZTreeNode> nodeList = new ArrayList<ZTreeNode>();
        nodeList.add(new ZTreeNode(1, 0, "硬件规格", "pIcon01", "false", "true"));
        nodeList.add(new ZTreeNode(10, 1, "单板", "pIcon01", "false", "true"));
        nodeList.add(new ZTreeNode(11, 1, "子卡", "icon02", "false", "false"));
        nodeList.add(new ZTreeNode(12, 1, "设备", "icon03", "false", "false"));
        nodeList.add(new ZTreeNode(2, 0, "软件规格", "pIcon02", "true", "true"));
        nodeList.add(new ZTreeNode(20, 2, "java", "icon04", "false", "false"));
        nodeList.add(new ZTreeNode(21, 2, "jscript", "icon05", "false", "false"));
        nodeList.add(new ZTreeNode(22, 2, "php", "icon06", "false", "false"));
        return nodeList;
    }

    @RequestMapping(value = "/asyncGetNodes", method = RequestMethod.POST)
    @ResponseBody
    public List<ZTreeNode> asyncGetNodes(long id, long pId, String name) throws Exception {
        List<ZTreeNode> nodeList = new ArrayList<ZTreeNode>();
        if (id == 10) {
            nodeList.add(new ZTreeNode(100, id, "单板_00", "icon02", "false", "false"));
            nodeList.add(new ZTreeNode(101, id, "单板_01", "icon03", "false", "false"));
        }
        Thread.sleep(1500);
        return nodeList;
    }
}
