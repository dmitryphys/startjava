package com.startjava.lesson2_3.wolf;

public class Wolf {
	private char sex;
	private String alias;
	private float weight;
	private int age;
	private String color;

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age > 8) {
			System.out.println("Некорректный возраст");
		} else {
			this.age = age;
		}
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean walk() {
		System.out.println("Может идти");
		return true;
	}

	public boolean sit() {
		System.out.println("Может сидеть");
		return true;
	}

	public boolean run() {
		System.out.println("Может бежать");
		return true;
	}

	public boolean yowl() {
		System.out.println("Может выть");
		return true;
	}

	public boolean hunt() {
		System.out.println("Может охотиться");
		return true;
	}
}