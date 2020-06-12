import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	private Player player1;
	private Player player2;

	Random compNumb = new Random();
	int computerNumber = compNumb.nextInt(101);
	Scanner scan = new Scanner(System.in);

	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void play() {
		do {
			System.out.print("Введите число для игрока " + player1.getName() + ": ");
			player1.setNumber(scan.nextInt());
			if(player1.getNumber() == computerNumber) {
				System.out.println(player1.getName() + "! Поздравляем с победой!");
			} else {
				if(player1.getNumber() < computerNumber) {
					System.out.println("Введенное Вами число " + player1.getNumber() + " меньше того, что загадал компьютер");
				} else if(player1.getNumber() > computerNumber) {
					System.out.println("Введенное Вами число " + player1.getNumber() + " больше того, что загадал компьютер");
				}
				System.out.print("Введите число для игрока " + player2.getName() + ": ");
				player2.setNumber(scan.nextInt());
				if(player2.getNumber() == computerNumber) {
					System.out.println(player2.getName() + "! Поздравляем с победой!");
				} else {
					if(player2.getNumber() < computerNumber) {
						System.out.println("Введенное Вами число " + player2.getNumber() + " меньше того, что загадал компьютер");
					} else if(player2.getNumber() > computerNumber) {
						System.out.println("Введенное Вами число " + player2.getNumber() + " больше того, что загадал компьютер");
					}
				}
			}
		} while (computerNumber != player1.getNumber() && computerNumber != player2.getNumber());
	}
}