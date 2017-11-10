package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Different tools used for Collectibase. Writing to file, reading form file,
 * and various sorting methods
 * 
 * Updated 11/7/17
 * 
 * @author Travis
 *
 */
public class Tools {
	/**
	 * writeFileVHS() will write information to a specific .txt depending on the type of collection.
	 * Currently the write file only will write minimal information such as 
	 * 		- movie title
	 * 		- media format
	 * 		- sleeve condition
	 * 
	 * TODO: add the information for the other variables from the VHSCollection
	 * 
	 */
	public static void writeFileVHS() {
		try (PrintWriter out = new PrintWriter("vhs.txt")) {
			if (Storage.vhs.size() > 0) {
				for (int i = 0; i < Storage.vhs.size(); i++) {
					out.printf("%s,%s,%s,%s,%s", Storage.vhs.get(i).getName(), Storage.vhs.get(i).getDirector(),Storage.vhs.get(i).getFormat().trim(),
							Storage.vhs.get(i).getSleeveCondition(), Storage.vhs.get(i).getHomeRecording());
					out.println("");
				}
				out.close();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * writeFileDVD() will write information to a specific .txt depending on the type of collection.
	 * Currently the write file only will write minimal information such as 
	 * 		- movie title
	 * 		- media format
	 * 
	 * TODO: add the information for the other variables from the DVDCollection
	 * 
	 */
	public static void writeFileDVD() {
		try (PrintWriter out = new PrintWriter("dvd.txt")) {
			if (Storage.dvd.size() > 0) {
				for (int i = 0; i < Storage.dvd.size(); i++) {
					out.printf("%s,%s", Storage.dvd.get(i).getName(), Storage.dvd.get(i).getFormat().trim());
					out.println("");
				}
				out.close();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * writeFileVHS() will write information to a specific .txt depending on the type of collection.
	 * Currently the write file only will write minimal information such as 
	 * 		- movie title
	 * 		- media format
	 * 		- sleeve condition
	 * 
	 * TODO: add the information for the other variables to the VHSCollection
	 * 
	 */
	public static void writeFileLD() {
		try (PrintWriter out = new PrintWriter("laserdisc.txt")) {
			if (Storage.ld.size() > 0) {
				for (int i = 0; i < Storage.ld.size(); i++) {
					out.printf("%s,%s", Storage.ld.get(i).getName(), Storage.ld.get(i).getFormat().trim());
					out.println("");
				}
				out.close();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * readInFile() will write information to a specific .txt depending on the type
	 * of collection. Currently the teadInFile will only read vhs.txt and dvd.txt
	 * with minimal information such as - movie title - media format - sleeve
	 * condition (for vhs only)
	 * 
	 * TODO: add the information for the other variables to the VHSCollection and
	 * DVDCollection TODO: add the logic/algorithm for each type of collection.
	 * 
	 */
	public static void readInFileVHS() {
		Scanner in = null;
		VHSCollection vhs;
		String format, title, sleeve, director, homeVideo;
		try {
			in = new Scanner(new File("vhs.txt"));
			while (in.hasNextLine()) {
				String line = in.nextLine();
				String[] tokens = line.split(",");
				title = tokens[0];
				director = tokens[1];
				format = tokens[2];
				sleeve = tokens[3];
				homeVideo = tokens[4];
				vhs = new VHSCollection(title);
				vhs.setFormat(format);
				vhs.setDirector(director);
				vhs.setSleeveCondition(sleeve);
				vhs.setHomeRecording(homeVideo);
				Storage.vhs.add(vhs);
			}
			in.close();
		} catch (FileNotFoundException exception) {
			throw new RuntimeException("failed to open vhs.txt");
		}

		
	}
	
	public static void readInFileDVD() {
		Scanner in = null;
		DVDCollection dvd;
		String format, title;
		try {
			in = new Scanner(new File("dvd.txt"));
			while (in.hasNextLine()) {
				String line = in.nextLine();
				String[] tokens = line.split(",");
				title = tokens[0];
				format = tokens[1];
				dvd = new DVDCollection(title);
				dvd.setFormat(format);
				Storage.dvd.add(dvd);
			}
			in.close();
		} catch (FileNotFoundException exception) {
			throw new RuntimeException("failed to open dvd.txt");
		}
	}
	
	public static void readInFileLD() {
		Scanner in = null;
		LaserDiscCollection ld;
		String format, title;
		try {
			in = new Scanner(new File("laserdisc.txt"));
			while (in.hasNextLine()) {
				String line = in.nextLine();
				String[] tokens = line.split(",");
				title = tokens[0];
				format = tokens[1];
				ld = new LaserDiscCollection(title);
				ld.setFormat(format);
				Storage.ld.add(ld);
			}
			in.close();
		} catch (FileNotFoundException exception) {
			throw new RuntimeException("failed to open ld.txt");
		}
	}
}
