package com.startjava.lesson1.conditionalstatement;

public class ConditionalStatement {
	public static void main(String[] args) {
		int age = 25;
		if(age > 20) {
			System.out.println("Вам больше 20 лет");
		}

		char sex = 'М';
		boolean isMale = sex == 'М';
		if(isMale) {
			System.out.println("Ваш пол - мужской");
		}
		if(!isMale) {
			System.out.println("Ваш пол - женский");
		}
		
		float height = 1.801f;
		if(height < 1.80) {
			System.out.println("Ваш рост ниже среднего");
		} else {
			System.out.println("Ваш рост является средним или выше среднего");
		}

		char firstLetter = 'Д';
		if(firstLetter == 'М') {
			System.out.println("Ваша фамилия начинается с согласной");
		} else if(firstLetter == 'И') {
			System.out.println("Ваша фамилия начинается с гласной");
		} else {
			System.out.println("Ваша фамилия начинается с гласной или согласной");
		}
	}
}