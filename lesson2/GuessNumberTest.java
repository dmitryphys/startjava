import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		String reply;
		Scanner scan = new Scanner(System.in, "cp866");

		do {
			System.out.print("Введите имя 1-го игрока: ");
			Player player1 = new Player(scan.next());

			System.out.print("Введите имя 2-го игрока: ");
			Player player2 = new Player(scan.next());

			GuessNumber guessNumberOne = new GuessNumber(player1, player2);
			guessNumberOne.play();
			do {
				System.out.print("Хотите продолжить? [да/нет]: ");
				reply = scan.next();
			} while(!reply.equals("да") && !reply.equals("нет"));
		} while(reply.equals("да"));
	}
}