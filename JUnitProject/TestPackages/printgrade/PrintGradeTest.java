package printgrade;

import static org.junit.Assert.*;

import org.junit.Test;


public class PrintGradeTest {

	@Test
	public void test() {
		String expected="You got an A.";
		PrintGrade pg = new PrintGrade();
		String result = pg.print(95);
		assertEquals(expected, result);
		
		String expected1="You got an B.";
		result = pg.print(82);
		assertEquals(expected1, result);
		
		String expected2="You got an C.";
		result = pg.print(73);
		assertEquals(expected2, result);
		
		String expected3="You need to study.";
		result = pg.print(50);
		assertEquals(expected3, result);
	}

}
