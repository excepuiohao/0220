package com.java;

/**
 * @author excepuio Java Àà ¾ÙÀý
 */
public class JavaClassExample {

	private String name;

	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public JavaClassExample(String name, int age) {
		super();
		this.name = "Jeff";
		this.age = 23;
	}

	public JavaClassExample() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * introduce myself
	 * 
	 * @param name
	 * @param age
	 */
	public void introduceMyself(String name, int age) {
		System.out.println("my name is " + this.name + " " + "my age is " + this.age);
	}
}
