
public class Triangle implements Shape {

	Double side;
	Double base;
	Double height;
	Double side1;
	Double side2;
	Double side3;

	public Triangle(Double side) {
		this.side = side;
	}

	public Triangle(Double base, Double height) {

		this.base = base;
		this.height = height;
	}

	public Triangle(Double side1, Double side2, Double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	@Override
	public void display() {
		if (this.side != null) {
			System.out.println("Equilateral triangle with side " + this.side + " has area " + this.calculateArea());
		} else if (this.base != null) {
			System.out.println("Triangle with base " + this.base + " and height " + this.height + " has area " + this.calculateArea());
		} else if (side1 != null) {
			System.out.println("Triangle with sides " + side1 + " " + side2 + " " + side3 + " has area " + this.calculateArea());	
		}
	}
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		if (this.side != null) {
			return (this.side * this.side * Math.sqrt(3)) / 4;
		} else if (this.base != null) {
			return (this.base * this.height) / 2;
		} else if (side1 != null) {
			double semiperimeter = (this.side1 + this.side2 + this.side3) / 2;
			return Math.sqrt(semiperimeter * (semiperimeter - this.side1) * (semiperimeter - this.side2)
					* (semiperimeter - this.side3));
		}
		return 0;

	}

}
