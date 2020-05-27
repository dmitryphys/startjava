public class GuessNumber {
	private int computerNumber;
	private int myNumber;
	// System.out.println("Вами введено число " + myNumber);

	public int getComputerNumber() {
		return computerNumber;
	}

	public int getMyNumber() {
		return myNumber;
	}

	public void setComputerNumber(int computerNumber) {
		this.computerNumber = computerNumber;
	}

	public void setMyNumber(int myNumber) {
		this.myNumber = myNumber;
	}

	public void game() {
		computerNumber = computerNumber;
		myNumber = myNumber;
		if(myNumber < computerNumber) {
			System.out.println("Введенное Вами число " + myNumber + " меньше того, что загадал компьютер");
		} else if(myNumber > computerNumber) {
			System.out.println("Введенное Вами число " + myNumber + " больше того, что загадал компьютер");
		}
	}
}
