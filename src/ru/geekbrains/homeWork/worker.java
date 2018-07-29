package ru.geekbrains.homeWork;

public class worker {
    String fullName;
    String job;
    String email;
    String phone;
    String salary;
    int age;

    public worker(String fullName, String job, String email, String phone, String salary, int age) {
        this.fullName = fullName;
        this.job = job;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public void printInfo () {
        System.out.println (fullName + "\n" + job + "\n" + email + "\n" + phone + "\n" + salary + "\n" + age);
    }
}
