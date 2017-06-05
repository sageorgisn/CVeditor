package outputCV;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import cvManager.CommonAttributes;

public abstract class Format {
	private File outFile;
	private PrintWriter printWriter;
	private CommonAttributes cv;
	
	public File getOutFile() {
		return outFile;
	}

	public void setOutFile(File outFile) {
		this.outFile = outFile;
	}

	public Format(File outFile, CommonAttributes cv) {
		super();
		this.outFile = outFile;
		try {
			this.printWriter = new PrintWriter(outFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.cv = cv;
	}

	public CommonAttributes getCv() {
		return cv;
	}

	public void setCv(CommonAttributes cv) {
		this.cv = cv;
	}

	public PrintWriter getPrintWriter() {
		return printWriter;
	}

	public void setPrintWriter(PrintWriter printWriter) {
		this.printWriter = printWriter;
	}
	public abstract void writeFile();
}
