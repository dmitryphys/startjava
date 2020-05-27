public class Jaeger {
	private String modelName;
	private float height;
	private int speed;

	public String getModelName() {
		return modelName;
	}

	public float getHeight() {
		return height;
	}

	public int getSpeed() {
		return speed;
	}

	public Jaeger(String modelName, float height, int speed) {
		this.modelName = modelName;
		this.height = height;
		this.speed = speed;
	}

	public boolean move() {
		System.out.println("Передвигается");
		return true;
	}

	public boolean scanKaiju() {
		System.out.println("Обнаруживает Кайдзю");
		return true;
	}
}