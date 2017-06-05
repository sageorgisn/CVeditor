package cvManager;

import java.util.Date;

public class BulletListItem {
	private Date date;
	private String contents;
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public BulletListItem(Date date, String contents) {
		super();
		this.date = date;
		this.contents = contents;
	}
	
	public String toString(){
		String[] tokens = contents.split("_");
		String str = tokens[0];
		for(int i=1;i<tokens.length;i++){
			str = str +", "+tokens[i];
		}
		
		if(date==null){
			return str;
		}
		return str+", "+date;
	}
	
}
