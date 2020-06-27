package com.startjava.lesson2_3.robot;

public class JaegerTest {
	public static void main(String[] args) {

		Jaeger jaeger1 = new Jaeger("Gipsy Danger", 79.25f, 7);
		System.out.println("Jaeger1's name: " + jaeger1.getModelName());
		System.out.println("Jaeger1's height: " + jaeger1.getHeight());
		System.out.println("Jaeger1's speed: " + jaeger1.getSpeed());
		System.out.println(jaeger1.move());
		System.out.println(jaeger1.scanKaiju());

		Jaeger jaeger2 = new Jaeger("Coyote Tango", 85.34f, 5);
		System.out.println("Jaeger2's name: " + jaeger2.getModelName());
		System.out.println("Jaeger2's height: " + jaeger2.getHeight());
		System.out.println("Jaeger2's speed: " + jaeger2.getSpeed());
		System.out.println(jaeger2.move());
		System.out.println(jaeger2.scanKaiju());

	}
}