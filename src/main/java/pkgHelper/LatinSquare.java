package pkgHelper;

import java.util.Arrays;

import org.apache.commons.lang.ArrayUtils;

public class LatinSquare {

	private int[][] LatinSquare;
	private java.util.ArrayList<PuzzleViolation> PV;
	private boolean bIgnoreZero = false;
	
	public LatinSquare() {
		super();
	}
	
	public LatinSquare(int[][] puzzle) {
		super();
		LatinSquare = puzzle;
	}
	
	public int[][] getLatinSquare() {
		return LatinSquare;
	}
	
	public void setLatinSquare(int[][] latinSquare) {
		LatinSquare = latinSquare;
	}
	
	public static boolean doesElementExist(int[] arr, int iValue)
	{
		for (int i: arr)
		{
			if (i == iValue)
			{
				return true;
			}
		}
		return false;
	}
	
	public static boolean hasAllValues(int[] arr1,int[] arr2)
	{
		boolean hasAllValues = true;
		for (int i = 0; i < arr2.length; i++) {
			boolean bFound = false;
			for(int j = 0; j < arr1.length;j++) {
				if(arr2[i]==arr1[j]) {
					bFound = true;
					break;
				}
			}
			if(!bFound) {
				hasAllValues = false;
				break;
				
			}
		}
		return hasAllValues;
	}
	
	public boolean ContainsZero() 
	{
		for (int iRow = 0; iRow < this.LatinSquare.length; iRow++)
		{
		for(int iCol = 0; iCol <this.LatinSquare.length; iCol++)
		{
			if (this.LatinSquare[iRow][iCol] == 0)
			{
				return true;
			}
		} 
		}
		
		return false;
	}
	
	public static boolean hasDuplicates(int[] arr)
	{
		int[] sortedArray = Arrays.copyOf(arr, arr.length);
		Arrays.sort(sortedArray);
		for(int i = 0; i < arr.length-1; i++)
		{
			if (sortedArray[i] == sortedArray[i+1])
			{
				return true;
			}
		}
		
		return false;
	}
	
	public int[] getColumn(int iCol) {
		int[] colValues = new int[this.LatinSquare.length];
		for (int iRow = 0; iRow < this.LatinSquare.length; iRow++) {
			colValues[iRow] = this.LatinSquare[iRow][iCol];
		}
		return colValues;
	}
	
	public int[] getRow(int iRow) {
	int[] rowValues = new int[this.LatinSquare.length];
	for (int iCol = 0; iCol < this.LatinSquare.length; iCol++) {
		rowValues[iCol] = this.LatinSquare[iRow][iCol];
	}
	return rowValues;
	}
	
	public boolean isLatinSquare() {
		for (int iRow = 0; iRow < this.LatinSquare.length; iRow++) {
			if(hasDuplicates(getRow(iRow))) {
				return false;
			}}
		for (int iCol = 0; iCol < this.LatinSquare.length; iCol++) {
				if(hasDuplicates(getColumn(iCol))) {
					return false;
				}	
		}
		for (int iRow = 0; iRow < this.LatinSquare.length; iRow++) {
			if(hasAllValues(getRow(iRow), getRow(0))) {
			}
			else return false;}
		for (int iCol = 0; iCol < this.LatinSquare.length; iCol++) {
			if(hasAllValues(getColumn(iCol), getColumn(0))) {
			}
			else return false;}
		return true;
	}
	protected void AddPuzzleViolation(PuzzleViolation pv) {
		PV.add(pv);
	}
	
	protected void ClearPuzzleViolation() {
		PV.clear();
	}
	
	protected java.util.ArrayList<PuzzleViolation> getPV(){
		return PV;
	}
	
	public boolean isbIgnoreZero() {
		return bIgnoreZero;
	}
	
	protected void setbIgnoreZero(boolean bIgnoreZero) {
	this.bIgnoreZero = bIgnoreZero;
	}
	
	private int[] RemoveZeros(int[] arr) {
		while(ArrayUtils.contains(arr, 0)) {
			arr = ArrayUtils.removeElement(arr, 0);
		}
		return arr;
		
		
		
		}
	}


