package com.company;

public class Horse {
    private  String NickName;
    private  int age;
    private  String color;
    private  String gender;
    private  int wheight;

    public Horse(String nickName, int age, String color, String gender, int wheight) {
        NickName = nickName;
        this.age = age;
        this.color = color;
        this.gender = gender;
        this.wheight = wheight;
    }

    public String getNickName() {
        return NickName;
    }

    public void setNickName(String nickName) {
        NickName = nickName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getWheight() {
        return wheight;
    }

    public void setWheight(int wheight) {
        this.wheight = wheight;
    }

    @Override
    public String toString() {
        return "Hourse{" +
                "NickName='" + NickName + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", gender='" + gender + '\'' +
                ", wheight=" + wheight +
                '}';
    }
}

