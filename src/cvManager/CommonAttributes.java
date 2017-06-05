package cvManager;

import java.awt.Component;
import java.sql.Date;
import java.util.ArrayList;


public class CommonAttributes {
	
	private String name;
	private String address;
	private String homePhone;
	private String mobilePhone;
	private String email;
	private String typeCV;
	private ArrayList<Section> sections = new ArrayList<Section>();
	
	
	public CommonAttributes(String name, String address, String homePhone, String mobilePhone, String email,
			String typeCV) {
		super();
		this.name = name;
		this.address = address;
		this.homePhone = homePhone;
		this.mobilePhone = mobilePhone;
		this.email = email;
		this.typeCV = typeCV;
	}
	public void addSection(String title){
		Section section = new Section(title);
		sections.add(section);
	}
	
	public Section getSection(String title){
		//to psaxnw
		for(int i=0;i<sections.size();i++){
			if(sections.get(i).getTitle().equals(title)){
				//ean to vrw to epistrefw
				return sections.get(i);
			}
		}
		//alliws to vazw ( mpainei sto telos)
		addSection(title);
		
		int last = sections.size()-1;
		//epistrefw to teleytaiao dld to neo
		return sections.get(last);
	}
	
	public void addParagraph(String contents, String title){
		Paragraph paragraph = new Paragraph(contents);
		Section section = getSection(title);
		section.setParagraph(paragraph);
	}
	
	public void addBulletListItem(String contents, String date, String title){
		System.out.println(date);
		try{
			Date date1 = Date.valueOf(date);
			BulletListItem item = new BulletListItem( date1,contents);
			Section section = getSection(title);
			section.addBulletListItem(item);
		}
		catch(IllegalArgumentException exception){
			System.out.println("To date reeeee");
		}
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTypeCV() {
		return typeCV;
	}

	public void setTypeCV(String typeCV) {
		this.typeCV = typeCV;
	}

	public ArrayList<Section> getSections() {
		return sections;
	}

	public void setSections(ArrayList<Section> sections) {
		this.sections = sections;
	}
	
	public CommonAttributes(String typeCV){
		
		
		this.typeCV=typeCV;
	}

	

	public String getParagraph(String title){
		Section section = getSection(title);
		if(section==null)
			return "";
		
		return section.getParagraph().getContents();
	}
	


	

	

	
	public String toString(){
		return name;
	}

	

	public Component getCareerSummary() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
