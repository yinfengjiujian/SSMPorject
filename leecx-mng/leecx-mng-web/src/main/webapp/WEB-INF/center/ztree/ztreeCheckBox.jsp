<%--
  <p>Company:东软集团:neusoft</p> 
  <p>Copyright:Copyright(c)2018</p> 
  User: 段美林
  Date: 2018/6/13 17:40
  Description: No Description
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<HTML>
<HEAD>
    <TITLE> ZTREE DEMO - getChangeCheckedNodes / getCheckedNodes</TITLE>
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
            view: {
                selectedMulti: false
            },
            check: {
                enable: true
            },
            data: {
                simpleData: {
                    enable: true
                }
            },
            callback: {
                onCheck: onCheck
            }
        };

        var zNodes =[
            { id:1, pId:0, name:"随意勾选 1", open:true},
            { id:11, pId:1, name:"随意勾选 1-1"},
            { id:12, pId:1, name:"随意勾选  1-2", open:true},
            { id:121, pId:12, name:"随意勾选 1-2-1", checked:true},
            { id:122, pId:12, name:"随意勾选 1-2-2"},
            { id:123, pId:12, name:"随意勾选 1-2-3"},
            { id:13, pId:1, name:"随意勾选 1-3"},
            { id:2, pId:0, name:"随意勾选 2", open:true},
            { id:21, pId:2, name:"随意勾选 2-1"},
            { id:22, pId:2, name:"随意勾选 2-2", open:true},
            { id:221, pId:22, name:"随意勾选 2-2-1", checked:true},
            { id:222, pId:22, name:"随意勾选 2-2-2"},
            { id:223, pId:22, name:"随意勾选 2-2-3"},
            { id:23, pId:2, name:"随意勾选 2-3", checked:true}
        ];

        var clearFlag = false;
        function onCheck(e, treeId, treeNode) {
            count();
            if (clearFlag) {
                clearCheckedOldNodes();
            }
        }
        function clearCheckedOldNodes() {
            var zTree = $.fn.zTree.getZTreeObj("treeDemo"),
                nodes = zTree.getChangeCheckedNodes();
            for (var i=0, l=nodes.length; i<l; i++) {
                nodes[i].checkedOld = nodes[i].checked;
            }
        }
        function count() {
            var zTree = $.fn.zTree.getZTreeObj("treeDemo"),
                checkCount = zTree.getCheckedNodes(true).length,
                nocheckCount = zTree.getCheckedNodes(false).length,
                changeCount = zTree.getChangeCheckedNodes().length;
            $("#checkCount").text(checkCount);
            $("#nocheckCount").text(nocheckCount);
            $("#changeCount").text(changeCount);

        }
        function createTree() {
            $.fn.zTree.init($("#treeDemo"), setting, zNodes);
            count();
            clearFlag = $("#last").attr("checked");
        }

        $(document).ready(function(){
            createTree();
            $("#init").bind("change", createTree);
            $("#last").bind("change", createTree);
        });
        //-->
    </SCRIPT>
</HEAD>

<BODY>
<h1>checkbox 勾选统计</h1>
<h6>[ 文件路径: excheck/checkbox_count.html ]</h6>
<div class="content_wrap">
    <div class="zTreeDemoBackground left">
        <ul id="treeDemo" class="ztree"></ul>
    </div>
    <div class="right">
        <ul class="info">
            <li class="title"><h2>1、getChangeCheckedNodes / getCheckedNodes 方法操作说明</h2>
                <ul class="list">
                    <li class="highlight_red">使用 zTreeObj.getChangeCheckedNodes / getCheckedNodes 方法，详细请参见 API 文档中的相关内容</li>
                    <li><p>去勾选 checkbox 比较下面的数字变化：<br/>
                        <ul id="log" class="log" style="height:110px;">
                            <li>当前被勾选的节点共 <span id="checkCount" class="highlight_red"></span> 个</li>
                            <li>当前未被勾选的节点共 <span id="nocheckCount" class="highlight_red"></span> 个</li>
                            <li>勾选状态对比规则：<input type="radio" id="init" name="stateType" class="radio first" checked /><span>与 zTree 初始化时对比</span><br/>
                                <input type="radio" id="last" name="stateType" class="radio first" style="margin-left:108px;"/><span>与上一次勾选后对比</span></li>
                            <li>当前被修改勾选状态的节点共 <span id="changeCount" class="highlight_red"></span> 个</li>
                        </ul></p>
                    </li>
                </ul>
            </li>
            <li class="title"><h2>2、setting 配置信息说明</h2>
                <ul class="list">
                    <li>同 "checkbox 勾选操作" 中的说明</li>
                </ul>
            </li>
            <li class="title"><h2>3、treeNode 节点数据说明</h2>
                <ul class="list">
                    <li>同 "checkbox 勾选操作" 中的说明</li>
                </ul>
            </li>
        </ul>
    </div>
</div>
</BODY>
</HTML>
