package fr.mario.com.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import fr.mario.com.model.Dimensions;
import fr.mario.com.model.Mower;
import fr.mario.com.model.PayloadEntree;
import fr.mario.com.model.PayloadSortie;
import fr.mario.com.model.Position;

@Service
public class TondeuseService {

	public PayloadSortie deplacements(PayloadEntree payloadEntree) {
		List<Position> positions = payloadEntree
				.getMowers()
				.stream()
				.map(mower -> deplacer(mower, payloadEntree.getDimensions()))
				.collect(Collectors.toList());
		
		PayloadSortie payloadSortie = new PayloadSortie();
		payloadSortie.setPositions(positions);
		return payloadSortie;
	}

	private static Position deplacer(Mower mower, Dimensions dimensions) {
		
		String[] instructions = mower.getInstructions().split("");
		String orientation = mower.getPosition().getOrientation();
		String orientationFinal = orientation;
		Integer x = mower.getPosition().getX();
		Integer y = mower.getPosition().getY();
		
		for(String instruction : instructions) {
			
				if("A".equalsIgnoreCase(instruction)) {
					if("N".equalsIgnoreCase(orientation) && y < dimensions.getHeight()) y++; 
					if("E".equalsIgnoreCase(orientation) && x < dimensions.getWidth()) x++; 
					if("W".equalsIgnoreCase(orientation) && x > 0) x--; 
					if("S".equalsIgnoreCase(orientation) && y > 0) y--; 
				}
				
				if("D".equalsIgnoreCase(instruction)) {
					if("N".equalsIgnoreCase(orientation)) orientationFinal = "E"; 
					if("E".equalsIgnoreCase(orientation)) orientationFinal = "S"; 
					if("W".equalsIgnoreCase(orientation)) orientationFinal = "N";
					if("S".equalsIgnoreCase(orientation)) orientationFinal = "W";
				}
				
				if("G".equalsIgnoreCase(instruction)) {
					if("N".equalsIgnoreCase(orientation)) orientationFinal = "W";
					if("E".equalsIgnoreCase(orientation)) orientationFinal = "N";
					if("W".equalsIgnoreCase(orientation)) orientationFinal = "S";
					if("S".equalsIgnoreCase(orientation)) orientationFinal = "E";
				}
				orientation = orientationFinal;
					
		}
		
		Position position = new Position();
		position.setOrientation(orientation);
		position.setX(x);
		position.setY(y);
		
		return position;
	}

}
