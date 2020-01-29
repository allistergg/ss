
public class Circle implements Shape{
	
	double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double calculateArea() {
		return this.radius * this.radius * Math.PI;
	}
	
	@Override
	public void display() {
		System.out.println("Circle with radius " + this.radius + " has area " + this.calculateArea());
		
	}

}
