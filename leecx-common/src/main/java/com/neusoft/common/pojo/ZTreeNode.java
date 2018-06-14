package com.neusoft.common.pojo;

/**
 * <p>Title: com.neusoft.common.pojo</p>
 * <p>Company:东软集团(neusoft)</p>
 * <p>Copyright:Copyright(c)2018</p>
 * User: 段美林
 * Date: 2018/6/13 23:20
 * Description: 树形ZTreeNode的简单数据格式封装类
 */
public class ZTreeNode {

    //树形Id
    private long id;
    //树形父亲Id
    private long pId;
    //树形节点名称
    private String name;
    //树形节点自定义图标className名称
    private String iconSkin;
    //节点是否展开
    private String open;
    //是否是父节点
    private String isParent;

    public ZTreeNode(long id, long pId, String name, String iconSkin, String open, String isParent) {
        this.id = id;
        this.pId = pId;
        this.name = name;
        this.iconSkin = iconSkin;
        this.open = open;
        this.isParent = isParent;
    }

    public ZTreeNode() {
    }

    /**
     * Gets the value of id.
     *
     * @return the value of id
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the id.
     * <p>
     * <p>You can use getId() to get the value of id</p>
     *
     * @param id id
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Gets the value of pId.
     *
     * @return the value of pId
     */
    public long getpId() {
        return pId;
    }

    /**
     * Sets the pId.
     * <p>
     * <p>You can use getpId() to get the value of pId</p>
     *
     * @param pId pId
     */
    public void setpId(long pId) {
        this.pId = pId;
    }

    /**
     * Gets the value of name.
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     * <p>
     * <p>You can use getName() to get the value of name</p>
     *
     * @param name name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the value of iconSkin.
     *
     * @return the value of iconSkin
     */
    public String getIconSkin() {
        return iconSkin;
    }

    /**
     * Sets the iconSkin.
     * <p>
     * <p>You can use getIconSkin() to get the value of iconSkin</p>
     *
     * @param iconSkin iconSkin
     */
    public void setIconSkin(String iconSkin) {
        this.iconSkin = iconSkin;
    }

    /**
     * Gets the value of isParent.
     *
     * @return the value of isParent
     */
    public String getIsParent() {
        return isParent;
    }

    /**
     * Sets the isParent.
     * <p>
     * <p>You can use getIsParent() to get the value of isParent</p>
     *
     * @param isParent isParent
     */
    public void setIsParent(String isParent) {
        this.isParent = isParent;
    }

    /**
     * Gets the value of open.
     *
     * @return the value of open
     */
    public String getOpen() {
        return open;
    }

    /**
     * Sets the open.
     * <p>
     * <p>You can use getOpen() to get the value of open</p>
     *
     * @param open open
     */
    public void setOpen(String open) {
        this.open = open;
    }
}
