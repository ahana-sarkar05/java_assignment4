package com.example;

	class Student {
	    private String name;
	    private int rollNo;
	    private int age;

	    public Student(String name, int rollNo, int age) {
	        this.name = name;
	        this.rollNo = rollNo;
	        this.age = age;
	    }

	    @Override
	    public String toString() {
	        return "Student [Name=" + name + ", RollNo=" + rollNo + ", Age=" + age + "]";
	    }

	    public static void main(String[] args) {
	        Student student = new Student("John", 123, 21);
	        System.out.println(student);
	    }
	}