package pkgHelper;


import org.junit.Test;

public class LatinSquareTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
	}

	@Test
	public void DoesElementExist_Test1()
	{
		int[] array1 = {1,2,3,4,5};
		int iValue = 2;
		boolean bExpectedCondition = true;
		boolean bActualCondition = LatinSquare.doesElementExist(array1, iValue);
		
		assertEquals(bExpectedCondition,bActualCondition);
		
	}
	
	@Test
	public void DoesElementExist_Test2()
	{
		int[] array1 = {1,2,3,4,5};
		int iValue = 7;
		boolean bExpectedCondition = false;
		boolean bActualCondition = LatinSquare.doesElementExist(array1, iValue);
		
		assertEquals(bExpectedCondition,bActualCondition);
	}
	
	@Test
	public void HasAllValues_Test1()
	{
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {1,2};
		boolean bExpected = true;
		boolean bActual = LatinSquare.hasAllValues(arr1,arr2);
		
		assertEquals(bExpected, bActual);
		
		}
	
	@Test
	public void HasAllValues_Test2()
	{
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {1,2,5};
		boolean bExpected = false;
		boolean bActual = LatinSquare.hasAllValues(arr1,arr2);
		
		assertEquals(bExpected, bActual);
		
		}
	
	@Test
	public void ContainsZero_Test1()
	{
		
		int[][] puzzle = {{1,2,3}, {2,3,1}, {3,1,2} };
		LatinSquare ls = new LatinSquare(puzzle);
		boolean bExpected = false;
		boolean bActual = ls.ContainsZero();
		
		assertEquals(bExpected, bActual);
	}
	@Test
	public void ContainsZero_Test2()
	{
		
		int[][] puzzle = {{1,2,3}, {2,0,1}, {3,1,2} };
		LatinSquare ls = new LatinSquare(puzzle);
		boolean bExpected = true;
		boolean bActual = ls.ContainsZero();
		
		assertEquals(bExpected, bActual);
	}
	
	@Test
	public void hasDuplicates_test1()
	{
		int[] arr = {1,2,3,4};
		boolean bExpected = false;
		assertEquals(bExpected, LatinSquare.hasDuplicates(arr));
		
	}
	
	@Test
	public void hasDuplicates_test2()
	{
		int[] arr = {1,8,5,4};
		boolean bExpected = false;
		assertEquals(bExpected, LatinSquare.hasDuplicates(arr));
		
	}
	
	@Test
	public void hasDuplicates_test3()
	{
		int[] arr = {1,2,3,3};
		boolean bExpected = true;
		assertEquals(bExpected, LatinSquare.hasDuplicates(arr));
		
	}
	
	@Test
	public void getColumn_test() {
		int[][] example = {{0,1,2,3}, {1,2,3,4}, {3,4,1,2}, {4,1,3,2} };
		LatinSquare ls = new LatinSquare(example);
		int[] aExpected = {1,2,4,1};
		int[] aActual = ls.getColumn(1);
		assertArrayEquals(aExpected, aActual);
	}
	@Test
	public void getColumn_test2() {
		int[][] example = {{0,1,2,3}, {1,2,3,4}, {3,4,1,2}, {4,1,3,2} };
		LatinSquare ls = new LatinSquare(example);
		int[] aExpected = {3,4,2,2};
		int[] aActual = ls.getColumn(3);
		assertArrayEquals(aExpected, aActual);
	}
	@Test
	public void getRow_test() {
		int[][] example = {{0,1,2,3}, {1,2,3,4}, {3,4,1,2}, {4,1,3,2} };
		LatinSquare ls = new LatinSquare(example);
		int[] aExpected = {1,2,3,4};
		int[] aActual = ls.getRow(1);
		assertArrayEquals(aExpected, aActual);
	}
	@Test
	public void getRow_test2() {
		int[][] example = {{0,1,2,3}, {1,2,3,4}, {3,4,1,2}, {4,1,3,2} };
		LatinSquare ls = new LatinSquare(example);
		int[] aExpected = {0,1,2,3};
		int[] aActual = ls.getRow(0);
		assertArrayEquals(aExpected, aActual);
	}
	
	@Test
	public void isLatinSquare_test() {
		int[][] example = {{4,1,2,3}, {1,2,3,4}, {3,4,1,2}, {2,3,4,1} };
		LatinSquare ls = new LatinSquare(example);
		boolean bExpected = true;
		boolean bActual = ls.isLatinSquare();
		assertEquals(bExpected, bActual);
	}
	@Test
	public void isLatinSquare_test2() {
		int[][] example = {{4,1,2,3}, {4,2,3,4}, {3,4,1,2}, {2,3,4,1} };
		LatinSquare ls = new LatinSquare(example);
		boolean bExpected = false;
		boolean bActual = ls.isLatinSquare();
		assertEquals(bExpected, bActual);
	}
	@Test
	public void isLatinSquare_test3() {
		int[][] example = {{0,1,2,3}, {1,2,3,4}, {3,4,1,2}, {2,3,4,1} };
		LatinSquare ls = new LatinSquare(example);
		boolean bExpected = false;
		boolean bActual = ls.isLatinSquare();
		assertEquals(bExpected, bActual);
	}
	@Test
	public void isLatinSquare_test4() {
		int[][] example = {{4,1,2,3}, {1,2,3,4}, {3,4,0,2}, {2,3,4,1} };
		LatinSquare ls = new LatinSquare(example);
		boolean bExpected = false;
		boolean bActual = ls.isLatinSquare();
		assertEquals(bExpected, bActual);
	}
	@Test
	public void isLatinSquare_test5() {
		int[][] example = {{4,1,2,3}, {4,2,3,1}, {3,4,1,2}, {2,3,4,1} };
		LatinSquare ls = new LatinSquare(example);
		boolean bExpected = false;
		boolean bActual = ls.isLatinSquare();
		assertEquals(bExpected, bActual);
	}
	}
		
	
