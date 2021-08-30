package application;

import java.util.ArrayList;
import java.util.List;

import models.entities.Circle;
import models.entities.Rectangle;
import models.entities.Shape;
import models.services.ShapeService;

public class Application {

	public static void main(String[] args) {
		
		List<Shape> shapes = new ArrayList<>();
		shapes.add(new Rectangle(3.0, 2.0));
		shapes.add(new Circle(2.0));
		
		List<Circle> circles = new ArrayList<>();
		circles.add(new Circle(2.0));
		circles.add(new Circle(3.0));
				
		System.out.println("Total area of ​​shape list: " + ShapeService.totalArea(shapes));
		System.out.println("Total area of ​​circle list: " + ShapeService.totalArea(circles));
	}

}
