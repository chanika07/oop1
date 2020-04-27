package com.company;

public class dogg {
    private String name;
    private String breed;
    private boolean sex;
    private int age;
    private String nation;
    public dogg (String name,String breed,String nation){
        this.name=name;
        this.breed=breed;
        this.sex=true;
        this.age=10;
        this.nation=nation;
    }
    public dogg (String name,String breed,boolean sex,String nation){
        this.name=name;
        this.breed=breed;
        this.sex=true;
        this.age=20;
        this.nation=nation;
    }
    public dogg (String name,String breed,boolean sex,int age,String nation){
        this.name=name;
        this.breed=breed;
        this.sex=sex;
        this.age=age;
        this.nation=nation;
        bark();

    }
    public void introduce(){
        System.out.println("I'm"+name);
    }
    public void bark(){
        System.out.println("I'm barking");
    }
    public Boolean sameBreed(String bead){
        if (this.breed.equalsIgnoreCase(breed)){
            return true;
        }
        else{
            return false;
        }
    }
    public String getName() {
        return name;
    }
    public void setName(){
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public Boolean getsex(){
        return sex;
    }

    public int getAge(){
        return age;
    }
    public void setAge(){
        this.age = age;
    }

    public String getNation(){
        return nation;
    }
}
