public class Wolf {
	char sex;
	String alias;
	float weight;
	int age;
	String color;

	boolean walk() {
		System.out.println("Может идти");
		return true;
	}

	boolean sit() {
		System.out.println("Может сидеть");
		return true;
	}

	boolean run() {
		System.out.println("Может бежать");
		return true;
	}

	boolean yowl() {
		System.out.println("Может выть");
		return true;
	}

	boolean hunt() {
		System.out.println("Может охотиться");
		return true;
	}
}