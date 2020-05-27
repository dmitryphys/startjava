import java.util.Scanner;
import java.util.Random;

public class GuessNumberTest {
	public static void main(String[] args) {
		GuessNumber guessNumberOne = new GuessNumber();
		Scanner scan = new Scanner(System.in, "cp866");

		Player player1 = new Player();
		System.out.print("Введите имя 1-го игрока: ");
		player1.Player(scan.next());

		Player player2 = new Player();
		System.out.print("Введите имя 2-го игрока: ");
		player2.Player(scan.next());

		String reply;

		Random compNumb = new Random();
		guessNumberOne.setComputerNumber(compNumb.nextInt(100));

		do {
			System.out.print("Введите число для игрока " + player1.getPlayerName() + ": ");
			player1.setPlayerNumber(scan.nextInt());
			guessNumberOne.setMyNumber(player1.getPlayerNumber());
			guessNumberOne.game();
			if(guessNumberOne.getMyNumber() == guessNumberOne.getComputerNumber()) {
				System.out.println(player1.getPlayerName() + "! Поздравляем с победой!");
			} else {
				System.out.print("Введите число для игрока " + player2.getPlayerName() + ": ");
				player2.setPlayerNumber(scan.nextInt());
				guessNumberOne.setMyNumber(player2.getPlayerNumber());
				guessNumberOne.game();
				if(guessNumberOne.getMyNumber() == guessNumberOne.getComputerNumber()) {
					System.out.println(player2.getPlayerName() + "! Поздравляем с победой!");
				}
			}
			if(guessNumberOne.getMyNumber() == guessNumberOne.getComputerNumber()) {
				do {
					System.out.print("Хотите продолжить? [да/нет]: ");
					reply = scan.next();
				} while(!reply.equals("да") && !reply.equals("нет"));
			}
		} while (guessNumberOne.getComputerNumber() != guessNumberOne.getMyNumber());// && !reply.equals("нет"));
	}
}