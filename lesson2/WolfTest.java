public class WolfTest {
	public static void main(String[] args) {
		Wolf wolfOne = new Wolf();
		wolfOne.sex = 'M';
		wolfOne.alias = "Норд";
		wolfOne.weight = 25.4f;
		wolfOne.age = 5;
		wolfOne.color = "Черный";
		System.out.println(wolfOne.sex);
		System.out.println(wolfOne.alias);
		System.out.println(wolfOne.weight);
		System.out.println(wolfOne.age);
		System.out.println(wolfOne.color);
		System.out.println(wolfOne.walk());
		System.out.println(wolfOne.sit());
		System.out.println(wolfOne.run());
		System.out.println(wolfOne.yowl());
		System.out.println(wolfOne.hunt());
	}
}