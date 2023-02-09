package com.github.tehsteel.multipledatabases.student;

public class Student {

	private final String name;

	private int age;

	public Student(final String name) {
		this.name = name;
	}


	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(final int age) {
		this.age = age;
	}
}
