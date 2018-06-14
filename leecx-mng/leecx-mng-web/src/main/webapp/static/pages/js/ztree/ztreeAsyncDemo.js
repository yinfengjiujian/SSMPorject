/**
 * <p>Title: </p>
 * <p>Company:东软集团(neusoft)</p>
 * <p>Copyright:Copyright(c)2018</p>
 * User: 段美林
 * Date: 2018/6/14 17:45
 * Description: 自己实现的树形例子JS
 */
var ztreeAsync = {
    //和后端交互的所有请求地址封装
    URL: {
        //页面加载初始化树地址
        startTreeUrl: function () {
            return '/ztree/getTree.action';
        },
        //异步获取树数据地址
        getAsyncUrl: function () {
            return '/ztree/asyncGetNodes.action';
        }
    },

    //树形菜单加载
    handleTree: function () {
        //树形参数setting属性设置
        var setting = {
            data: {
                //是否为简单数据格式 enable---true 为简单数据格式，否则false,树的数据格式必须为标准形式
                simpleData: {
                    enable: true,
                    idkey: "id",
                    pIdKey: "pId",
                    rootPId: 0
                }
            },
            view: {
                selectedMulti: false
            },
            check: {
                enable: true
            },
            async: {
                enable: true,
                type: "post",
                url: ztreeAsync.getAsyncFunction,
                autoParam: ["id", "pId", "name"],
                dataFilter: ztreeAsync.dataFiter
            },
        };

        //页面进入初始化加载树
        $.ajax({
            url: ztreeAsync.URL.startTreeUrl(),
            type: "post",
            dataType: "json",
            success: function (data) {
                var zTreeObj = $.fn.zTree.init($("#treeDemo"), setting, data);
                //让第一个父节点展开
                var rootNode_0 = zTreeObj.getNodeByParam('pId', 0, null);
                zTreeObj.expandNode(rootNode_0, true, false, false, false);
            },
            error: function () {
                alert("初始化加载树形，发生错误！");
            }
        });
    },

    /**
     * 用于处理返回-->树形某个节点Node异步加载时，向后端发起请求的地址
     * 可以根据异步加载节点ID的值不同,向后端发起请求的地址也不同
     * @param treeId
     * @param treeNode
     * @returns {*|string}
     */
    getAsyncFunction: function (treeId, treeNode) {
        if (treeId && treeNode.id == 10) {
            return ztreeAsync.URL.getAsyncUrl();
        } else {
            alert("不允许异步加载树！");
        }
    },

    /**
     * 用于对 Ajax 返回数据进行预处理的函数
     * 异步加载树返回的数据可以进行预处理
     * @param treeId
     * @param parentNode
     * @param responseData
     * @returns {*}
     */
    dataFiter: function (treeId, parentNode, responseData) {
        if (responseData) {
            for (var i = 0; i < responseData.length; i++) {
                responseData[i].name += "_neusoft";
            }
        }
        return responseData;
    },

    //页面加载实现过程
    loading: {
        //初始化业务加载
        init: function () {
            ztreeAsync.handleTree();
        }
    }
}

//页面加载完后执行
jQuery(document).ready(function () {
    ztreeAsync.loading.init();
});