<%--
  <p>Company:东软集团:neusoft</p> 
  <p>Copyright:Copyright(c)2018</p> 
  User: 段美林
  Date: 2018/6/14 17:39
  Description: 树形菜单实现例子，并可以进行异步加载实现
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>树形菜单实现例子</title>
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

</head>
<body>

<div class="content_wrap">
    <div class="zTreeDemoBackground left">
        <ul id="treeDemo" class="ztree"></ul>
    </div>
</div>

<script src="<%=request.getContextPath() %>/static/pages/js/ztree/ztreeAsyncDemo.js?version=<%=Math.random()%>" type="text/javascript"></script>

</body>
</html>
