package outputCV;

import java.io.File;
import java.io.PrintWriter;

import cvManager.CommonAttributes;

public class LatexFormat extends Format {

	public LatexFormat(File outFile,CommonAttributes cv) {
		super(outFile, cv);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void writeFile() {
		// TODO Auto-generated method stub
		PrintWriter printWriter = getPrintWriter();
		CommonAttributes cv = getCv();
		
		writeFileStart();
		if(cv.getTypeCV().equals("functional")){
			printWriter.println("3. SKILLS AND EXPERIENCE");
			printWriter.println(cv.getSection("Skills and Experience").getBulletList());
			printWriter.println("4. CAREER SUMMARY");
			printWriter.println(cv.getSection("Career Summary").getBulletList());

		}
		else if(cv.getTypeCV().equals("chronological")){
			printWriter.println("3. CORE STRENGTHS");
			printWriter.println(cv.getParagraph("Core Strengths"));
			printWriter.println("4. PROFESSIONAL PROFILE");
			printWriter.println(cv.getSection("Career Summary").getBulletList());
		}
		else if(cv.getTypeCV().equals("combined")){
			printWriter.println("3. SKILLS AND EXPERIENCE");
			printWriter.println(cv.getSection("Skills and Experience").getBulletList());
			printWriter.println("4. PROFESSIONAL PROFILE");
			printWriter.println(cv.getSection("Career Summary").getBulletList());
		}
		
		writeFileEnd();
		
		printWriter.close();
	}
	public void writeFileStart() {
		PrintWriter printWriter = getPrintWriter();
		CommonAttributes cv = getCv();
		
		printWriter.println("1. GENERAL INFORMATION");
		printWriter.println("Name " +cv.getName());
		printWriter.println("Address " +cv.getAddress());
		printWriter.println("Telephone (Home) "+cv.getHomePhone()+" (Mobile) "+cv.getMobilePhone());
		printWriter.println("Email " +cv.getEmail());
		printWriter.println();
		
		printWriter.println("2. PROFESSIONAL PROFILE");
		printWriter.println(cv.getParagraph("Professional Profile"));
		printWriter.println();
		
		
	}
	
	public void writeFileEnd() {
		// TODO Auto-generated method stub
		PrintWriter printWriter = getPrintWriter();
		CommonAttributes cv = getCv();
		
		printWriter.println("5. EDUCATION AND TRAINING");
		printWriter.println(cv.getSection("Education and Training").getBulletList());
		printWriter.println();
		printWriter.println("6. FURTHER COURSES");
		printWriter.println(cv.getSection("Further Courses").getBulletList());
		printWriter.println("7. ADDITIONAL INFORMATION");
		printWriter.println(cv.getParagraph("Additional Information"));
		printWriter.println("8. INTERESTS");
		printWriter.println(cv.getParagraph("Interests"));

	}
	
}
