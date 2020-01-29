
public class ShapeTest {

	public static void main(String[] args) {
		Circle circle = new Circle(5);
		circle.display();
		Rectangle rectangle = new Rectangle(5.0, 10.0);
		rectangle.display();
		Triangle triangle = new Triangle(5.0, 10.0);
		Triangle triangle2 = new Triangle(3.0, 4.0, 5.0);
		Triangle triangle3 = new Triangle(5.0);
		triangle.display();
		triangle2.display();
		triangle3.display();

	}

}
