package me.runfang.yuyin.yuyinback.domain.core;

public class YySinger {
    private Integer id;

    private String name;

    private Integer location;

    private Integer age;

    private String gender;

    private String portrailUrl;

    private String introduce;

    private Integer musicCount;

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

    public Integer getLocation() {
        return location;
    }

    public void setLocation(Integer location) {
        this.location = location;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getPortrailUrl() {
        return portrailUrl;
    }

    public void setPortrailUrl(String portrailUrl) {
        this.portrailUrl = portrailUrl == null ? null : portrailUrl.trim();
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }

    public Integer getMusicCount() {
        return musicCount;
    }

    public void setMusicCount(Integer musicCount) {
        this.musicCount = musicCount;
    }
}