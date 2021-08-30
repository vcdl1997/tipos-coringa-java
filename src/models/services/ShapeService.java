package models.services;

import java.util.List;

import models.entities.Shape;

public class ShapeService {
	
	public static double totalArea(List<? extends Shape> list) {
		if(list.isEmpty()) throw new IllegalArgumentException("List is empty");
		
		double total = 0;
		
		for(Shape shape : list) {
			total += shape.area();
		}
		
		return total;
	}
	
}
