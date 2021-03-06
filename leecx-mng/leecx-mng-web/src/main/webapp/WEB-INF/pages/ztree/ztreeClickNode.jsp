<%--
  <p>Company:东软集团:neusoft</p> 
  <p>Copyright:Copyright(c)2018</p> 
  User: 段美林
  Date: 2018/6/13 16:57
  Description: No Description
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<HTML>
<HEAD>
    <TITLE> ZTREE DEMO - beforeClick / onClick</TITLE>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">

    <link rel="stylesheet" href="<%=request.getContextPath() %>/static/ZTreeV3/css/demo.css" type="text/css">
    <link rel="stylesheet" href="<%=request.getContextPath() %>/static/ZTreeV3/css/zTreeStyle/zTreeStyle.css" type="text/css">
    <script src="<%=request.getContextPath() %>/static/jquery/jquery-3.3.1.js?version=<%=Math.random()%>"
            type="text/javascript"></script>
    <script src="<%=request.getContextPath() %>/static/ZTreeV3/js/jquery.ztree.core.js?version=<%=Math.random()%>"
            type="text/javascript"></script>
    <script src="<%=request.getContextPath() %>/static/ZTreeV3/js/jquery.ztree.excheck.js?version=<%=Math.random()%>"
            type="text/javascript"></script>
    <script src="<%=request.getContextPath() %>/static/ZTreeV3/js/jquery.ztree.exedit.js?version=<%=Math.random()%>"
            type="text/javascript"></script>

    <SCRIPT type="text/javascript">
        <!--
        var setting = {
            data: {
                key: {
                    title:"t"
                },
                //是否为简单数据格式 enable---true 为简单数据格式，否则false,树的数据格式必须为标准形式
                simpleData: {
                    enable: true
                }
            },
            callback: {
                beforeClick: beforeClick,
                onClick: onClick
            }
        };

        var zNodes =[
            { id:1, pId:0, name:"普通的父节点", t:"我很普通，随便点我吧", open:true},
            { id:11, pId:1, name:"叶子节点 - 1", t:"我很普通，随便点我吧"},
            { id:12, pId:1, name:"叶子节点 - 2", t:"我很普通，随便点我吧"},
            { id:13, pId:1, name:"叶子节点 - 3", t:"我很普通，随便点我吧"},
            { id:2, pId:0, name:"NB的父节点", t:"点我可以，但是不能点我的子节点，有本事点一个你试试看？", open:true},
            { id:21, pId:2, name:"叶子节点2 - 1", t:"你哪个单位的？敢随便点我？小心点儿..", click:false},
            { id:22, pId:2, name:"叶子节点2 - 2", t:"我有老爸罩着呢，点击我的小心点儿..", click:false},
            { id:23, pId:2, name:"叶子节点2 - 3", t:"好歹我也是个领导，别普通群众就来点击我..", click:false},
            { id:3, pId:0, name:"郁闷的父节点", t:"别点我，我好害怕...我的子节点随便点吧...", open:true, click:false },
            { id:31, pId:3, name:"叶子节点3 - 1", t:"唉，随便点我吧"},
            { id:32, pId:3, name:"叶子节点3 - 2", t:"唉，随便点我吧"},
            { id:33, pId:3, name:"叶子节点3 - 3", t:"唉，随便点我吧"}
        ];

        var log, className = "dark";

        /**
         * 树形节点单击之前触发的事件，当返回true时，才会调用onClick 否则不调用
         * @param treeId
         * @param treeNode
         * @param clickFlag
         * @returns {boolean}
         */
        function beforeClick(treeId, treeNode, clickFlag) {
            className = (className === "dark" ? "":"dark");
            showLog("[ "+getTime()+" beforeClick ]&nbsp;&nbsp;" + treeNode.name );
            return (treeNode.click != false);
        }

        function onClick(event, treeId, treeNode, clickFlag) {
            showLog("[ "+getTime()+" onClick ]&nbsp;&nbsp;clickFlag = " + clickFlag + " (" + (clickFlag===1 ? "普通选中": (clickFlag===0 ? "<b>取消选中</b>" : "<b>追加选中</b>")) + ")");
        }


        function showLog(str) {
            if (!log) log = $("#log");
            log.append("<li class='"+className+"'>"+str+"</li>");
            if(log.children("li").length > 8) {
                log.get(0).removeChild(log.children("li")[0]);
            }
        }
        function getTime() {
            var now= new Date(),
                h=now.getHours(),
                m=now.getMinutes(),
                s=now.getSeconds();
            return (h+":"+m+":"+s);
        }

        $(document).ready(function(){
            $.fn.zTree.init($("#treeDemo"), setting, zNodes);
        });
        //-->
    </SCRIPT>
</HEAD>

<BODY>
<h1>单击节点控制</h1>
<h6>[ 文件路径: core/click.html ]</h6>
<div class="content_wrap">
    <div class="zTreeDemoBackground left">
        <ul id="treeDemo" class="ztree"></ul>
    </div>
    <div class="right">
        <ul class="info">
            <li class="title"><h2>1、beforeClick / onClick 事件回调函数控制</h2>
                <ul class="list">
                    <li>利用 click 事件回调函数 可以进行各种其他的附加操作，这里简单演示如何监控此事件</li>
                    <li><p><span class="highlight_red">请尝试按下 <b>Ctrl</b> 或 <b>Cmd</b> 键进行 多节点选择 和 取消选择</span><br/>
                        click log:<br/>
                        <ul id="log" class="log"></ul></p>
                    </li>
                </ul>
            </li>
            <li class="title"><h2>2、setting 配置信息说明</h2>
                <ul class="list">
                    <li class="highlight_red">需要设置 setting.callback.beforeClick 和  setting.callback.onClick 属性, 详细请参见 API 文档中的相关内容</li>
                </ul>
            </li>
            <li class="title"><h2>3、treeNode 节点数据说明</h2>
                <ul class="list">
                    <li>对 节点数据 没有特殊要求，用户可以根据自己的需求添加自定义属性</li>
                </ul>
            </li>
        </ul>
    </div>
</div>
</BODY>
</HTML>

