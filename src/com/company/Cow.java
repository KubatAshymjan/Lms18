package com.company;

public class Cow {
    private  String NickName;
    private  int age;
    private  String gender;
    private  int wheight;


    public Cow(String nickName, int age, String gender, int wheight) {
        NickName = nickName;
        this.age = age;
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
        return "Cow{" +
                "NickName='" + NickName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", wheight=" + wheight +
                '}';
    }
}


