public class GuessNumber {
	public static void main(String[] args) {
		int computerNumber = 95;
		int myNumber = 92;
		System.out.println("Вами введено число " + myNumber);
		if(computerNumber >= 0 && computerNumber <= 100) {
			do {
				if(myNumber < computerNumber) {
					System.out.println("Введенное Вами число " + myNumber + " меньше того, что загадал компьютер");
					myNumber++;
				} else if(myNumber > computerNumber) {
					System.out.println("Введенное Вами число " + myNumber + " больше того, что загадал компьютер");
					myNumber--;
				}
			} while(myNumber != computerNumber);
			
			System.out.println("Вы угадали!");
		
		} else {System.out.println("error");
		}
	}
}