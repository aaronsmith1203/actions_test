package com.aaronsmith.qa.challenges.goldilocks;

import java.util.ArrayList;

public class Goldilocks {

	public static void main(String[] args) {
		System.out.println("Hello");
	}
	
	public static ArrayList<Integer> getComfortableChairs(int weight, int maxTemperature, int[] chairCapacities, int[] porridgeTemperatures) {
		ArrayList<Integer> comfortableChairs = new ArrayList<Integer>();
		for (int i = 0; i < chairCapacities.length; i++) {
			if (chairCapacities[i] >= weight && porridgeTemperatures[i] <= maxTemperature) {
				comfortableChairs.add(i + 1); // 1 is the first seat
			}
		}
		return comfortableChairs;
	}
	
	public static ArrayList<Integer> getComfortableChairs(int weight, int maxTemperature, int minLuminosity, int[] chairCapacities, int[] porridgeTemperatures, int[]luminosities) {
		ArrayList<Integer> comfortableChairs = new ArrayList<Integer>();
		for (int i = 0; i < chairCapacities.length; i++) {
			boolean suitableChair = chairCapacities[i] >= weight;
			boolean suitablePorridge = porridgeTemperatures[i] <= maxTemperature;
			boolean suitableLighting = luminosities[i] >= minLuminosity;
			if (suitableChair && suitablePorridge && suitableLighting) {
				comfortableChairs.add(i + 1); // 1 is the first seat
			}
		}
		return comfortableChairs;
	}
}
