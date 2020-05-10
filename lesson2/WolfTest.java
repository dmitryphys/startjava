public class WolfTest {
	public static void main(String[] args) {
		Wolf wolfOne = new Wolf();
		wolfOne.setSex('M');
		wolfOne.setAlias("Норд");
		wolfOne.setWeight(25.4f);
		wolfOne.setAge(5);
		wolfOne.setColor("Черный");
		System.out.println(wolfOne.getSex());
		System.out.println(wolfOne.getAlias());
		System.out.println(wolfOne.getWeight());
		System.out.println(wolfOne.getAge());
		System.out.println(wolfOne.getColor());
		System.out.println(wolfOne.walk());
		System.out.println(wolfOne.sit());
		System.out.println(wolfOne.run());
		System.out.println(wolfOne.yowl());
		System.out.println(wolfOne.hunt());
	}
}