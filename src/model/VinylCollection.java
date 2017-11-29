package model;

/**
 * VinylCollection is an extension of MusicCollection. The VinylCollection holds
 * variables that are more specific to the Vinyl format.
 * 
 * @author Travis
 *
 */
public class VinylCollection extends MusicCollection {

	private String size;
	private String color;
	private String speed;

	//////// constructors ////////
	public VinylCollection() {
		super("", "0", "", "0");
		this.size = "";
		this.color = "";
		this.speed = "";
	}

	public VinylCollection(String artist, String year, String album, String runTime, String size, String color,
			String speed) {
		super(artist, year, album, runTime);
		this.size = size;
		this.color = color;
		this.speed = speed;

	}

	//////// getters and setters ////////
	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

}
