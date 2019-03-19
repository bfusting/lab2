package pkgGame;

import static org.junit.Assert.*;

public class SudokuTest {

	int[][] puzzle = {{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};
	
	@Test
	public void getRegion_test1()
	{
		Sudoku obj = new Sudoku(puzzle);
		int[] expectedValue = {1,2,1,2};
		int[] actualValue = obj.getRegion(0);
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	public void getRegion_test2()
	{
		Sudoku obj2 = new Sudoku(puzzle);
		int[] expectedValue = {1,2,1,2};
		int[] actualValue = obj.getRegion(0, 0);
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	public void isValidValue_test() {
		Sudoku obj3 = new Sudoku(puzzle);
		
		boolean expectedValue = false;
		boolean actualValue = obj3.isValidValue(0, 0, 3);
		
		assertEquals(expectedValue, actualValue);
	}
}
