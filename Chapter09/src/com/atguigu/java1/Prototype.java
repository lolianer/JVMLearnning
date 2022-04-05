package com.atguigu.java1;

/**
 * 测试原型模式
 * @author shen_wzhong
 * @create 2022-03-26 14:38
 */
public class Prototype implements Cloneable{
    private String name;
    private Integer age;
    private String color;

    public Prototype() {
    }

    public Prototype(String name, Integer age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Prototype{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype prototype = new Prototype("qwe",12,"asd");
        Prototype clone = (Prototype) prototype.clone();
        System.out.println(prototype == clone);
        System.out.println(prototype.color == clone.color);
    }
}
