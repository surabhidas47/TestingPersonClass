package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {

    private String name;
    private int age;
    private String job;
    private String faveColor;
    private int faveNum;



    public Person() {

        //this works for a constructor that wants to enter all the variables
        //bc para is empty..default.. so if i use this one will say Surabhi, 24...

        this.name="";
        this.age=Integer.MAX_VALUE;
        this.job="student";
        this.faveColor="purple";
        this.faveNum=47;


    }

    public Person(int age) {
       //this is a constructor that only asks for age
        this.age=age;


    }

    public Person(String name) {

    this.name=name;
    }

    public Person(String name, int age) {

    this.name=name;
    this.age=age;

    }

    public Person(String name, int age,String job, String faveColor, int faveNum){
        this.name=name;
        this.age=age;
        this.job=job;
        this.faveColor=faveColor;
        this.faveNum=faveNum;

    }



    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setFaveNum(int faveNum) {
        this.faveNum = faveNum;
    }

    public void setFaveColor(String faveColor) {
        this.faveColor = faveColor;
    }



    public String getName() {

        return this.name;
    }

    public Integer getAge() {

        return this.age;
    }

    public String getJob() {

        return this.job;
    }

    public String getFaveColor() {

        return this.faveColor;
    }

    public int getFaveNum() {

        return this.faveNum;
    }
}

//if im in another class.. i can call these constructors based on what parameters i waant.. or default
