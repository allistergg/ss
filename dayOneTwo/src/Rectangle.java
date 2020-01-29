
public class Rectangle implements Shape {

	double side1;
	double side2;
	
	@Override
	public void display() {
		System.out.println("Rectangle with sides " + this.side1 + " and " + this.side2 + " has area " + this.calculateArea());
		
	}
	
	public Rectangle(Double side1, Double side2) {
		this.side1 = side1;
		this.side2 = side2;
	}

	@Override
	public double calculateArea() {
		
		return this.side1 * this.side2;
	}

}
