public class Number {
	public static void main(String[] args) {
		int number = 99; // Число, "загаданное" компьютером
		int myNumber = 100; // Введите число
		System.out.println("Вами введено число " + myNumber);
		if(0 <= number && number <= 100) {
			do {
				if(myNumber < number) {
					System.out.println("Введенное Вами число меньше того, что загадал компьютер");
				} else if(myNumber > number) {
					System.out.println("Введенное Вами число больше того, что загадал компьютер");
				}
				myNumber = 99; //Введите новое число
				System.out.println("Вами введено новое число " + myNumber);
			}
			while(myNumber != number);
			System.out.println("Вы угадали!");
			} else {System.out.println("error");
		}
	}
}