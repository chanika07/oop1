package com.company;

public class q1 {
    int id;
    String name;
    String sex;
    float gpa;
    int room;
    String sub[];
    public q1(int id, String name, String sex, float gpa){
        this.id=id;
        this.sex=sex;
        this.gpa=gpa;
        manageRoom();
    }
    private void manageRoom(){
        if (this.gpa >= 3.5) {
            this.room = 1;
        } else if (this.gpa >= 3 && this.gpa < 3.49) {
            this.room = 2;
        } else if(this.gpa < 3){
            this.room = 3;
        }
    }
     float Exam(int score){
        if (score > 80) {
            return gpa = 4;
        }else if (score >= 75) {
            return gpa = (float) 3.5;
        } else if (score >= 70) {
            return gpa = 3;
        } else if (score >= 65) {
            return gpa = (float) 2.5;
        } else if (score >= 60) {
            return gpa = 2;
        } else if (score >= 55) {
            return gpa = (float) 1.5;
        } else if (score >= 50) {
            return gpa = 1;
        } else {
            return gpa = 0;
        }
    }

    void print(){
        System.out.println("ID : "+id+" "+"Name : "+name);
        System.out.println("GPA"+gpa);
        System.out.println("Room "+room);
        if (room==1){
            System.out.println("Subject : Science Math");
        }
        else if (room==2){
            System.out.println("Subject : Math English");
        }
        else{
            System.out.println("Subject : English Thai");
        }
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public float getGpa() {
        return gpa;
    }

    public int getRoom() {
        return room;
    }

    public String[] getSub() {
        return sub;
    }
}
