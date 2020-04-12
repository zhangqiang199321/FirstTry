package com.example.xiaoshuo.en;

public enum Price {
    BELOW200("200以下","zj201", 1),
    TO300("200到300", "zj202", 2),
    TO500("300到500", "zj203", 3),
    TO1000("500到1000", "zj204", 4),
    TO2000("1000到2000", "zj205", 5),
    TO3000("2000到3000", "zj206", 6),
    TO5000("3000到5000", "zj207", 7),
    UP5000("5000以上","zj208", 8);
    // 成员变量
    private String name;
    private String type;
    private int index;
    // 构造方法
    private Price(String name, String type, int index) {
        this.name = name;
        this.type = type;
        this.index = index;
    }
    // 普通方法
    public static String getName(int index) {
        for (Price c : Price.values()) {
            if (c.getIndex() == index) {
                return c.name;
            }
        }
        return null;
    }
    public static String getType(int index) {
        for (Price c : Price.values()) {
            if (c.getIndex() == index) {
                return c.type;
            }
        }
        return null;
    }
    // get set 方法
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getIndex() {
        return index;
    }
    public void setIndex(int index) {
        this.index = index;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
