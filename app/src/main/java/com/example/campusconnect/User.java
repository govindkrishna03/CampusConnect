//package com.example.campusconnect;
//
//public class User {
//    private String username;
//    private String password;
//
//    public User(String username, String password) {
//        this.username = username;
//        this.password = password;
//    }
//
//    public boolean authenticate(String enteredUsername, String enteredPassword) {
//        return username.equals(enteredUsername) && password.equals(enteredPassword);
//    }
//
//    // Getters and setters for username and password
//}
//
//public class Faculty extends User {
//    private String name;
//    private int id;
//    private String department;
//    private List<String> classesTaught;
//
//    public Faculty(String username, String password, String name, int id, String department) {
//        super(username, password);
//        this.name = name;
//        this.id = id;
//        this.department = department;
//        this.classesTaught = new ArrayList<>();
//    }
//
//    // Getters and setters specific to Faculty
//}
//
//public class Student extends User {
//    private String name;
//    private String rollNo;
//    private String batch;
//    private String department;
//    private List<String> notifications;
//    private List<String> events;
//
//    public Student(String username, String password, String name, String rollNo, String batch, String department) {
//        super(username, password);
//        this.name = name;
//        this.rollNo = rollNo;
//        this.batch = batch;
//        this.department = department;
//        this.notifications = new ArrayList<>();
//        this.events = new ArrayList<>();
//    }
//
//    // Getters and setters specific to Student
//}
//
//public class Admin extends User {
//    // Add specific attributes and methods for Admin
//}
