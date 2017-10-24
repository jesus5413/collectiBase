package model;

public class DVDCollection extends MoviesCollection {

	//TODO: add variables to the constructor
	private String discRot;
	private String caseType; //cardboard, plastic, jewel case, paper sleeve, generic.
	private String specialFeatDisc; //is a special features disc included. change to type boolean?
	private boolean criterion; // is the DVD part of the Criterion collection
	private String spineNumber; // if  Criterion, the film will have a spine number
	
	/***** Constructor *****/
	public DVDCollection(String title, String year, String discRot, String specialFeatDisc, boolean criterion, String spineNumber) {
		super(title, year);
		this.discRot = discRot;
		this.specialFeatDisc = specialFeatDisc;
		this.criterion = criterion;
		this.spineNumber = spineNumber;		
	}

	public String getDiscRot() {
		return discRot;
	}

	public void setDiscRot(String discRot) {
		this.discRot = discRot;
	}

	public String getCaseType() {
		return caseType;
	}

	public void setCaseType(String caseType) {
		this.caseType = caseType;
	}

	public String getSpecialFeatDisc() {
		return specialFeatDisc;
	}

	public void setSpecialFeatDisc(String specialFeatDisc) {
		this.specialFeatDisc = specialFeatDisc;
	}

	public Boolean getCriterion() {
		return criterion;
	}

	public void setCriterion(Boolean criterion) {
		this.criterion = criterion;
	}

	public String getSpineNumber() {
		return spineNumber;
	}

	public void setSpineNumber(String spineNumber) {
		this.spineNumber = spineNumber;
	}

}
