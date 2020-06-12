import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	private String playerName1;
	private int number1;
	private String playerName2;
	private int number2;

	public GuessNumber(String playerName1, int number1, String playerName2, int number2) {
		this.playerName1 = playerName1;
		this.number1 = number1;
		this.playerName2 = playerName2;
		this.number2 = number2;
	}

	Random compNumb = new Random();
	int computerNumber = compNumb.nextInt(100);
	Scanner scan = new Scanner(System.in);

	public void game () {
		while (computerNumber != number1 && computerNumber != number2) {
			System.out.print("Введите число для игрока " + playerName1 + ": ");
			number1 = scan.nextInt();
			if(number1 == computerNumber) {
				System.out.println(playerName1 + "! Поздравляем с победой!");
			} else {
				if(number1 < computerNumber) {
					System.out.println("Введенное Вами число " + number1 + " меньше того, что загадал компьютер");
				} else if(number1 > computerNumber) {
					System.out.println("Введенное Вами число " + number1 + " больше того, что загадал компьютер");
				}
				System.out.print("Введите число для игрока " + playerName2 + ": ");
				number2 = scan.nextInt();
				if(number2 == computerNumber) {
					System.out.println(playerName2 + "! Поздравляем с победой!");
				} else {
					if(number2 < computerNumber) {
						System.out.println("Введенное Вами число " + number2 + " меньше того, что загадал компьютер");
					} else if(number2 > computerNumber) {
						System.out.println("Введенное Вами число " + number2 + " больше того, что загадал компьютер");
					}
				}
			}
		}
	}
}
