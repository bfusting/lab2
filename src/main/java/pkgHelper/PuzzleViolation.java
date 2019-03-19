package pkgHelper;

public class PuzzleViolation {
	
	private pkgEnum.ePuzzleViolation ePuzzleViolation;
	private int iValue;
	
	public PuzzleViolation(pkgEnum.ePuzzleViolation ePuzzleViolation, int iValue) {
		super();
		this.iValue = iValue;
		this.ePuzzleViolation = ePuzzleViolation;
	}

	public pkgEnum.ePuzzleViolation getePuzzleViolation(){
		return ePuzzleViolation;
	}
	
	public int getiValue() {
		return iValue;
	}
	
	
}
