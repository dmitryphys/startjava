public class Person {
	String sex = "Мужской";
	String name = "Иван";
	float height = 178.5f;
	float weight = 82.5f;
	int age = 29;

	boolean walk() {
		System.out.println("Он может ходить");
		return true;
	}

	boolean sit() {
		System.out.println("Он может сидеть");
		return true;
	}

	boolean run() {
		System.out.println("Он может бегать");
		return true;
	}

	boolean speak() {
		System.out.println("Он может говорить");
		return true;
	}

	boolean learnJava() {
		System.out.println("Он может учить Java");
		return false;
	}
}