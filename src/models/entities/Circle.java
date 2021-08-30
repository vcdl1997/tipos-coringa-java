package models.entities;

public class Circle implements Shape{
	
	private Double radius;
	
	public Circle(Double radius) {
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(this.radius, 2); 
	}
}
