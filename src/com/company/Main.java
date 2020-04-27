package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
         String name = sc.next();
        String sex = sc.next();
        float gpa = sc.nextFloat();
        q1 stu = new q1(id,name,sex,gpa);
        stu.print();

            stu.Exam(44);
            stu.print();


       /* dogg d1 = new dogg(sc.next(),sc.next());
        dogg d2 = new dogg(sc.next(),sc.next(),sc.nextBoolean());
        dogg d3 = new dogg(sc.next(),sc.next(),sc.nextBoolean(),sc.nextInt());*/

      /*  dogg d1= new dogg() ;
        d1.name="Sonic";
        d1.breed="Shiba Inu";
        d1.sex= true;
        d1.age=3;

        dogg d2 = new dogg();
        d2.name="Husky";
        d2.breed="Siberian Husky";
        d2.sex=false;
        d2.age=1;

        dogg d3 = new dogg();
        d3.name=sc.nextLine();
        d3.breed=sc.nextLine();
        d3.sex=sc.nextBoolean();
        d3.age=sc.nextInt();

        d1.introduce();
        d2.introduce();
        d3.introduce();

        System.out.println(d2.sameBreed(sc.nextLine()));*/
    }
}
