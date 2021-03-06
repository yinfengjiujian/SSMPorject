<%--
  <p>Company:东软集团:neusoft</p> 
  <p>Copyright:Copyright(c)2018</p> 
  User: 段美林
  Date: 2018/6/13 18:00
  Description: No Description
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<HTML>
<HEAD>
    <TITLE> ZTREE DEMO - Custom Icon Skin </TITLE>
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
                //是否为简单数据格式 enable---true 为简单数据格式，否则false,树的数据格式必须为标准形式
                simpleData: {
                    enable: true,
                    idkey: "id",
                    pIdKey: "pId",
                    rootPId: null
                }
            }
        };

        var zNodes =[
            { id:1, pId:0, name:"展开、折叠 自定义图标不同", open:true, iconSkin:"pIcon01"},
            { id:11, pId:1, name:"叶子节点1", iconSkin:"icon01"},
            { id:12, pId:1, name:"叶子节点2", iconSkin:"icon02"},
            { id:13, pId:1, name:"叶子节点3", iconSkin:"icon03"},
            { id:2, pId:0, name:"展开、折叠 自定义图标相同", open:true, iconSkin:"pIcon02"},
            { id:21, pId:2, name:"叶子节点1", iconSkin:"icon04"},
            { id:22, pId:2, name:"叶子节点2", iconSkin:"icon05"},
            { id:23, pId:2, name:"叶子节点3", iconSkin:"icon06"},
            { id:3, pId:0, name:"不使用自定义图标", open:true },
            { id:31, pId:3, name:"叶子节点1"},
            { id:32, pId:3, name:"叶子节点2"},
            { id:33, pId:3, name:"叶子节点3"}
        ];

        $(document).ready(function(){

            $.fn.zTree.init($("#treeDemo"), setting, zNodes);
        });
        //-->
    </SCRIPT>
    <style type="text/css">
        .ztree li span.button.pIcon01_ico_open{margin-right:2px; background: url(<%=request.getContextPath() %>/static/ZTreeV3/css/zTreeStyle/img/diy/1_open.png) no-repeat scroll 0 0 transparent; vertical-align:top; *vertical-align:middle}
        .ztree li span.button.pIcon01_ico_close{margin-right:2px; background: url(<%=request.getContextPath() %>/static/ZTreeV3/css/zTreeStyle/img/diy/1_close.png) no-repeat scroll 0 0 transparent; vertical-align:top; *vertical-align:middle}
        .ztree li span.button.pIcon02_ico_open, .ztree li span.button.pIcon02_ico_close{margin-right:2px; background: url(<%=request.getContextPath() %>/static/ZTreeV3/css/zTreeStyle/img/diy/2.png) no-repeat scroll 0 0 transparent; vertical-align:top; *vertical-align:middle}
        .ztree li span.button.icon01_ico_docu{margin-right:2px; background: url(<%=request.getContextPath() %>/static/ZTreeV3/css/zTreeStyle/img/diy/3.png) no-repeat scroll 0 0 transparent; vertical-align:top; *vertical-align:middle}
        .ztree li span.button.icon02_ico_docu{margin-right:2px; background: url(<%=request.getContextPath() %>/static/ZTreeV3/css/zTreeStyle/img/diy/4.png) no-repeat scroll 0 0 transparent; vertical-align:top; *vertical-align:middle}
        .ztree li span.button.icon03_ico_docu{margin-right:2px; background: url(<%=request.getContextPath() %>/static/ZTreeV3/css/zTreeStyle/img/diy/5.png) no-repeat scroll 0 0 transparent; vertical-align:top; *vertical-align:middle}
        .ztree li span.button.icon04_ico_docu{margin-right:2px; background: url(<%=request.getContextPath() %>/static/ZTreeV3/css/zTreeStyle/img/diy/6.png) no-repeat scroll 0 0 transparent; vertical-align:top; *vertical-align:middle}
        .ztree li span.button.icon05_ico_docu{margin-right:2px; background: url(<%=request.getContextPath() %>/static/ZTreeV3/css/zTreeStyle/img/diy/7.png) no-repeat scroll 0 0 transparent; vertical-align:top; *vertical-align:middle}
        .ztree li span.button.icon06_ico_docu{margin-right:2px; background: url(<%=request.getContextPath() %>/static/ZTreeV3/css/zTreeStyle/img/diy/8.png) no-repeat scroll 0 0 transparent; vertical-align:top; *vertical-align:middle}
    </style>
</HEAD>

<BODY>
<h1>自定义图标 -- iconSkin 属性</h1>
<h6>[ 文件路径: core/custom_iconSkin.html ]</h6>
<div class="content_wrap">
    <div class="zTreeDemoBackground left">
        <ul id="treeDemo" class="ztree"></ul>
    </div>
    <div class="right">
        <ul class="info">
            <li class="title"><h2>1、setting 配置信息说明</h2>
                <ul class="list">
                    <li>自定义图标不需要对 setting 进行特殊配置</li>
                </ul>
            </li>
            <li class="title"><h2>2、treeNode 节点数据说明</h2>
                <ul class="list">
                    <li>利用 节点数据的 iconSkin 属性 配合 css 实现自定义图标</li>
                    <li class="highlight_red">详细请参见 API 文档中的相关内容</li>
                </ul>
            </li>
            <li class="title"><h2>3、其他说明</h2>
                <ul class="list">
                    <li class="highlight_red">由于时间关系，例子直接采用 png 图片，如果需要解决 ie6 下 png 图片的透明问题，请针对 ie6 制作特殊的 gif 图片或者利用 css filter 解决</li>
                </ul>
            </li>
        </ul>
    </div>
</div>
</BODY>
</HTML>
