package com.javaconstructors;

class Teacher1 {
    String name = "samuel";
    int age = 22;
    int yop = 2026;
}
class Teacher {
    void showTeacher(Teacher1 s) {
        System.out.println("Student Name: " + s.name);
        System.out.println("age : " + s.age);
        System.out.println("yop : " + s.yop);
    }
}

public class ObjectRefCons {
    public static void main(String[] args) {
        Teacher1 s = new Teacher1();
        Teacher t = new Teacher();
        t.showTeacher(s);
    }
}
