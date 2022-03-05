package goldilockstesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

import com.aaronsmith.qa.challenges.goldilocks.Goldilocks;

public class GoldilocksTest {
	
	@Test
	public void testGetComfortableChairsGreenPath1() {
		// goldilocks inputs
		int weight = 100;
		int maxTemperature = 100;
		
		// environment inputs
		int[] chairCapacities = {30, 130, 90, 150, 120, 200, 110};
		int[] porridgeTemperatures = {30, 95, 90, 150, 70, 200, 110};
		
		ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(2,5));
		ArrayList<Integer> actual = Goldilocks.getComfortableChairs(weight, maxTemperature, chairCapacities, porridgeTemperatures);
		assertEquals(expected, actual);
	}

	@Test
	public void testGetComfortableChairsGreenPath2() {
		// goldilocks inputs
		int weight = 100;
		int maxTemperature = 120;
		
		//environment inputs
		int[] chairCapacities = {297, 66, 257, 276, 280, 163, 193, 153, 107, 137, 40, 127, 146, 197, 59, 124, 59, 54, 119, 121, 189, 108, 21, 18, 90, 52, 129, 181, 123, 132};
		int[] porridgeTemperatures = {90, 110, 113, 191, 129, 163, 193, 153, 107, 137, 40, 127, 146, 197, 59, 124, 59, 54, 119, 121, 189, 108, 21, 18, 90, 52, 129, 181, 123, 132};
		
		ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(1,3,9,19,22));
		ArrayList<Integer> actual = Goldilocks.getComfortableChairs(weight, maxTemperature, chairCapacities, porridgeTemperatures);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetComfortableChairsGreenPath3() {
		// goldilocks inputs
		int weight = 100;
		int maxTemperature = 120;
		int minLuminosity = 70;

		// environment inputs
		int[] chairCapacities = {297, 66, 257, 276, 280, 163, 193, 153, 107, 137, 40, 127, 146, 197, 59, 124, 59, 54, 119, 121, 189, 108, 21, 18, 90, 52, 129, 181, 123, 132};
		int[] porridgeTemperatures = {90, 110, 113, 191, 129, 163, 193, 153, 107, 137, 40, 127, 146, 197, 59, 124, 59, 54, 119, 121, 189, 108, 21, 18, 90, 52, 129, 181, 123, 132};
		int[] luminosities = {54, 78, 98, 12, 22, 12, 45, 65, 71, 87, 98, 45, 98, 10, 100, 12, 54, 98, 87, 32, 65, 97, 64, 31, 54, 65, 87, 98, 65, 21};
		
		ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(3,9,19,22));
		ArrayList<Integer> actual = Goldilocks.getComfortableChairs(weight, maxTemperature, minLuminosity, chairCapacities, porridgeTemperatures, luminosities);
		assertEquals(expected, actual);
	}
}
