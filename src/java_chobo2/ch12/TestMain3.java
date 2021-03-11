package java_chobo2.ch12;

interface Eatable{}

class Fruit implements Eatable{
	@Override
	public String toString() {
		return "Fuit";
	}
}

class Apple extends Fruit{
	@Override
	public String toString() {
		return "Apple";
	}
}

class Grape extends Fruit{
	@Override
	public String toString() {
		return "Grape";
	}
}

class Toy {
	@Override
	public String toString() {
		return "Toy";
	}
}

class FruitBox<T extends Fruit & Eatable> extends Box<T>{}

public class TestMain3 {

	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
		
//		FruitBox<Grape> grape2Box = new FruitBox<Apple>();
//		FruitBox<Toy> toyBox = new FruitBox<Toy>();
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		
		appleBox.add(new Apple());
//		appleBox.add(new Grape());
		
		grapeBox.add(new Grape());
		
		System.out.println("fruitBox - " + fruitBox);
		System.out.println("appleBox - " + appleBox);
		System.out.println("grapeBox - " + grapeBox);
	}

}
