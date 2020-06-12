import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		String reply;

		do {
			Scanner scan = new Scanner(System.in, "cp866");

			System.out.print("Введите имя и число для 1-го игрока: ");
			Player player1 = new Player(scan.next(), scan.nextInt());

			System.out.print("Введите имя и число для 2-го игрока: ");
			Player player2 = new Player(scan.next(), scan.nextInt());

			GuessNumber guessNumberOne = new GuessNumber(player1.getName(), player1.getNumber(), player2.getName(), player2.getNumber());
			guessNumberOne.game();
			do {
				System.out.print("Хотите продолжить? [да/нет]: ");
				reply = scan.next();
			} while(!reply.equals("да") && !reply.equals("нет"));
		} while(reply.equals("да"));
	}
}