package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Calc;

class CalcTest {

	@Test
	void testAdd() {
		//fail("Not yet implemented");
		Calc cal = new Calc();
		int actual = cal.add(4,5);
		assertEquals(9,actual);
		
	}

	@Test
	void testSubtract() {
		//fail("Not yet implemented");
		Calc cal = new Calc();
		int actual = cal.subtract(4,5);
		assertEquals(-1,actual);
	}
	
	@Test
	void testMultiply() {
		//fail("Not yet implemented");
		Calc cal = new Calc();
		int actual = cal.multiply(4,5);
		assertEquals(20,actual);
		
	}
	
	@Test
	void testDivide()  {
		//fail("Not yet implemented");
		Calc cal = new Calc();
		int actual = cal.divide(4,2);
		assertEquals(2,actual);
		
	}

}
