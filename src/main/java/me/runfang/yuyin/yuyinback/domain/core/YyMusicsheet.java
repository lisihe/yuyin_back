package me.runfang.yuyin.yuyinback.domain.core;

import java.util.Date;

public class YyMusicsheet {
    private Integer id;

    private String name;

    private Integer amount;

    private String username;

    private String introduce;

    private Date createTime;

    private Integer star;

    private String sheetImage;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    public String getSheetImage() {
        return sheetImage;
    }

    public void setSheetImage(String sheetImage) {
        this.sheetImage = sheetImage == null ? null : sheetImage.trim();
    }
}