package com.trading.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class AdderTest {
	@Mock
	private AddingValidator validator;
	private Adder adder;
	public AdderTest(){
		MockitoAnnotations.openMocks(this);
		adder = new Adder(validator);
	}
	@Test
	public void addPositiveNumbers() {
		//Given
			int input1 = 2;
			int input2 = 3;
			Mockito.when(validator.validate()).thenReturn(true);
		//When
			int sum = adder.add(input1, input2);
		//Then
			assertEquals(5, sum);
	}

	@Test
	public void addNegativeNumbers(){
		//Given
			int input1 = -2;
			int input2 = -3;
			Mockito.when(validator.validate()).thenReturn(true);
		//When
			int sum = adder.add(input1, input2);
		//Then
			assertEquals(-5, sum);
	}

	@Test
	public void addPositiveNumbers_whenValidationReturnsFalse(){
		//Given
		int input1 = 2;
		int input2 = 3;
		Mockito.when(validator.validate()).thenReturn(false);
	//When
		int sum = adder.add(input1, input2);
	//Then
		assertEquals(0, sum);
	}
}
// class MockingAddingValidator implements AddingValidator{

// 	@Override
// 	public boolean validate() {
// 		return true;
// 	}
	
// }