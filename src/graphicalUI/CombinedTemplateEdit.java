package graphicalUI;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import cvManager.BulletListItem;
import cvManager.CommonAttributes;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class CombinedTemplateEdit {

	private JFrame frame;
	private JTextField name;
	private JTextField skillField;
	private JTextField bullet;
	private JTextField address;
	private JTextField telephoneHome;
	private JTextField telephoneMobile;
	private JTextField email;
	private JTextField companyName;
	private JTextField jobTitle;
	private JTextField date;
	private JTextField course;
	private JTextField establishmentC;
	private JTextField locationC;
	private JTextField dateC;
	private JTextField qualification;
	private JTextField establishmentE;
	private JTextField locationE;
	private JTextField dateE;
	
	private int education=-1;
	private int courseNum=-1;
	private int careerNum=-1;

	
	private CommonAttributes functional;
	private ArrayList<CommonAttributes> arrayCv;
	
	//private Functional functional;
	public void run(){//cp run
		frame.setVisible(true);
	}
	
	

	/**
	 * Create the application.
	 * @param combinedResumes 
	 * @param chronologicallResumes 
	 * @param functionalResumes 
	 * @param functional2 
	 */
	public CombinedTemplateEdit(CommonAttributes functional,  ArrayList<CommonAttributes> arrayCv) {
		this.functional = functional;
		
		this.arrayCv=arrayCv;
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		JTextArea additionalInformation = new JTextArea(functional.getParagraph("Additional Information"));
		JTextArea interests = new JTextArea(functional.getParagraph("Interests"));
		
		frame = new JFrame();
		frame.setBounds(100, 100, 1033, 702);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblGeneralInformation = new JLabel("General Information");
		lblGeneralInformation.setBounds(50, 11, 135, 14);
		frame.getContentPane().add(lblGeneralInformation);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(36, 53, 46, 14);
		frame.getContentPane().add(lblName);
		
		name = new JTextField(functional.getName());
		name.setBounds(189, 50, 86, 20);
		frame.getContentPane().add(name);
		name.setColumns(10);
		
		JLabel lblProfessionProfile = new JLabel("Profession Profile");
		lblProfessionProfile.setBounds(36, 244, 200, 14);
		frame.getContentPane().add(lblProfessionProfile);
		
		JLabel lblSkillsAndExperience = new JLabel("Skills And Experience");
		lblSkillsAndExperience.setBounds(50, 269, 207, -23);
		frame.getContentPane().add(lblSkillsAndExperience);
		
		JLabel lblSkilName = new JLabel("Skil name");
		lblSkilName.setBounds(25, 397, 72, 14);
		frame.getContentPane().add(lblSkilName);
		
		skillField = new JTextField();
		skillField.setBounds(133, 394, 86, 20);
		frame.getContentPane().add(skillField);
		skillField.setColumns(10);
		
		JLabel lblBullet = new JLabel("Bullet");
		lblBullet.setBounds(25, 432, 46, 17);
		frame.getContentPane().add(lblBullet);
		
		bullet = new JTextField();
		bullet.setBounds(133, 425, 86, 20);
		frame.getContentPane().add(bullet);
		bullet.setColumns(10);
		
		JButton btnAddMore = new JButton("add More");
		btnAddMore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnAddMore.setBounds(266, 429, 89, 23);
		frame.getContentPane().add(btnAddMore);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(36, 94, 46, 14);
		frame.getContentPane().add(lblAddress);
		
		address = new JTextField(functional.getAddress());
		address.setBounds(189, 91, 86, 20);
		frame.getContentPane().add(address);
		address.setColumns(10);
		
		JLabel lblTelephonehome = new JLabel("Telephone (Home)");
		lblTelephonehome.setBounds(36, 140, 109, 14);
		frame.getContentPane().add(lblTelephonehome);
		
		telephoneHome = new JTextField(functional.getHomePhone());
		telephoneHome.setBounds(189, 137, 86, 20);
		frame.getContentPane().add(telephoneHome);
		telephoneHome.setColumns(10);
		
		JLabel lblMobile = new JLabel("Mobile");
		lblMobile.setBounds(309, 140, 46, 14);
		frame.getContentPane().add(lblMobile);
		
		telephoneMobile = new JTextField(functional.getMobilePhone());
		telephoneMobile.setBounds(363, 137, 86, 20);
		frame.getContentPane().add(telephoneMobile);
		telephoneMobile.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(36, 188, 46, 14);
		frame.getContentPane().add(lblEmail);
		
		email = new JTextField(functional.getEmail());
		email.setBounds(189, 185, 86, 20);
		frame.getContentPane().add(email);
		email.setColumns(10);
		
		JTextArea professionalProfile = new JTextArea(functional.getParagraph("Professional Profile"));
		professionalProfile.setBounds(36, 269, 224, 62);
		frame.getContentPane().add(professionalProfile);
		
		JLabel lblSkillsAndExperience_1 = new JLabel("Skills and Experience");
		lblSkillsAndExperience_1.setBounds(50, 359, 149, 14);
		frame.getContentPane().add(lblSkillsAndExperience_1);
		
		JButton btnAddSkill = new JButton("Add Skill");
		btnAddSkill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// skill = new SkillsAndExperience(skillField.getText().toString());
				 //functional.addSkill(skill);
			}
		});
		btnAddSkill.setBounds(266, 393, 89, 23);
		frame.getContentPane().add(btnAddSkill);
		
		JLabel lblCareerSummary = new JLabel("Career Summary");
		lblCareerSummary.setBounds(36, 503, 183, 14);
		frame.getContentPane().add(lblCareerSummary);
		
		JLabel lblCompanyName = new JLabel("Company Name");
		lblCompanyName.setBounds(36, 546, 86, 14);
		frame.getContentPane().add(lblCompanyName);
		
		companyName = new JTextField();
		companyName.setBounds(133, 543, 86, 20);
		frame.getContentPane().add(companyName);
		companyName.setColumns(10);
		
		JLabel lblJobTitle = new JLabel("Job Title");
		lblJobTitle.setBounds(36, 591, 46, 14);
		frame.getContentPane().add(lblJobTitle);
		
		jobTitle = new JTextField();
		jobTitle.setBounds(133, 588, 86, 20);
		frame.getContentPane().add(jobTitle);
		jobTitle.setColumns(10);
		
		date = new JTextField();
		date.setBounds(133, 635, 86, 20);
		frame.getContentPane().add(date);
		date.setColumns(10);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setBounds(36, 638, 46, 14);
		frame.getContentPane().add(lblDate);
		
		JButton btnAddCareer = new JButton("Add Career");
		btnAddCareer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CareerSummary(String companyName, String jobTitle, String date)
			//	CareerSummary careerSummary = new CareerSummary(companyName.getText(), jobTitle.getText().toString(),date.getText().toString());
				//functional.addCareerSummary(careerSummary);
				 
				String contents = companyName.getText()+"_"+ jobTitle.getText().toString();
				functional.addBulletListItem(contents, date.getText(), "Career Summary");
				
				companyName.setText("");
				jobTitle.setText("");
				date.setText("");
			}
		});
		btnAddCareer.setBounds(266, 634, 89, 23);
		frame.getContentPane().add(btnAddCareer);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//GeneralInformation generalInformation = new GeneralInformation(, , , , ); 
				//functional.setGeneralInformation(generalInformation);
				functional.setName(name.getText().toString());
				functional.setAddress(address.getText().toString());
				functional.setHomePhone(telephoneHome.getText().toString());
				functional.setMobilePhone(telephoneMobile.getText().toString());
				functional.setEmail(email.getText().toString());
				
				functional.addParagraph(additionalInformation.getText().toString(),"Additional Information");
				functional.addParagraph(interests.getText().toString(), "Interests");
				functional.addParagraph(professionalProfile.getText().toString(), "Professional Profile");
				frame.dispose();
				Main main = new Main(arrayCv);
				main.run();
			}
		});
		btnConfirm.setBounds(662, 634, 89, 23);
		frame.getContentPane().add(btnConfirm);
		
		JLabel lblEducatiomAdTraininig = new JLabel("Education and training");
		lblEducatiomAdTraininig.setBounds(628, 274, 123, 14);
		frame.getContentPane().add(lblEducatiomAdTraininig);
		
		JLabel lblQualification = new JLabel("Qualification");
		lblQualification.setBounds(565, 306, 79, 14);
		frame.getContentPane().add(lblQualification);
		
		JLabel lblEstablishment = new JLabel("Establishment");
		lblEstablishment.setBounds(565, 335, 79, 14);
		frame.getContentPane().add(lblEstablishment);
		
		JLabel lblLocation = new JLabel("Location");
		lblLocation.setBounds(565, 371, 46, 14);
		frame.getContentPane().add(lblLocation);
		
		JLabel lblData = new JLabel("Date");
		lblData.setBounds(565, 397, 46, 14);
		frame.getContentPane().add(lblData);
		
		JLabel lblFurtherCourses = new JLabel("Further Courses");
		lblFurtherCourses.setBounds(668, 433, 109, 14);
		frame.getContentPane().add(lblFurtherCourses);
		
		JLabel lblCourse = new JLabel("Course");
		lblCourse.setBounds(565, 471, 46, 14);
		frame.getContentPane().add(lblCourse);
		
		JLabel lblEsteblishment = new JLabel("Esteblishment");
		lblEsteblishment.setBounds(549, 503, 79, 14);
		frame.getContentPane().add(lblEsteblishment);
		
		JLabel lblLocation_1 = new JLabel("Location");
		lblLocation_1.setBounds(559, 528, 46, 14);
		frame.getContentPane().add(lblLocation_1);
		
		JLabel lblDate_1 = new JLabel("Date");
		lblDate_1.setBounds(549, 561, 46, 14);
		frame.getContentPane().add(lblDate_1);
		

		course = new JTextField();
	
		course.setBounds(691, 468, 86, 20);
		frame.getContentPane().add(course);
		course.setColumns(10);
		
		establishmentC = new JTextField();
		
		establishmentC.setBounds(691, 500, 86, 20);
		frame.getContentPane().add(establishmentC);
		establishmentC.setColumns(10);
		
		locationC = new JTextField();
		
		locationC.setBounds(691, 525, 86, 20);
		frame.getContentPane().add(locationC);
		locationC.setColumns(10);
		
		dateC = new JTextField();
		
		dateC.setBounds(691, 558, 86, 20);
		frame.getContentPane().add(dateC);
		dateC.setColumns(10);
		
		JButton btnAddCourse = new JButton("Add Course");
		btnAddCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 //FurtherCourses(String course, String establishment, String location, String date) 
				// FurtherCourses  furtherCourses = new FurtherCourses(course.getText().toString(),establishmentC.getText().toString(),locationC.getText().toString(), dateC.getText().toString()); 
				// functional.addFurtherCourses(furtherCourses);
				 
				String contents = course.getText().toString()+"_"+establishmentC.getText().toString()+"_"+locationC.getText().toString();
				functional.addBulletListItem(contents, dateC.getText(), "Further Courses");
				 course.setText("");
				 establishmentC.setText("");
				 locationC.setText("");
				 dateC.setText("");
			}
		});
		btnAddCourse.setBounds(839, 557, 89, 23);
		frame.getContentPane().add(btnAddCourse);
		
		
		qualification = new JTextField();
		
		qualification.setBounds(678, 299, 86, 20);
		frame.getContentPane().add(qualification);
		qualification.setColumns(10);
		
		establishmentE = new JTextField();
		
		establishmentE.setBounds(668, 332, 86, 20);
		frame.getContentPane().add(establishmentE);
		establishmentE.setColumns(10);
		
		locationE = new JTextField();
		
		locationE.setBounds(678, 368, 86, 20);
		frame.getContentPane().add(locationE);
		locationE.setColumns(10);
		
		dateE = new JTextField();
		
		dateE.setBounds(668, 394, 86, 20);
		frame.getContentPane().add(dateE);
		dateE.setColumns(10);
		
		JButton btnAddEducation = new JButton("Add Education");
		btnAddEducation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// EducationAndTraining  educationAndTraining = new  EducationAndTraining(qualification.getText().toString(),establishmentE.getText().toString(), locationE.getText().toString(), dateE.getText().toString());
				// functional.addEducationAndTraining(educationAndTraining);
				
				String contents = qualification.getText().toString()+"_"+establishmentE.getText().toString()+"_"+ locationE.getText().toString();
				functional.addBulletListItem(contents, dateE.getText(), "Education and Training");
				 qualification.setText("");
				 establishmentE.setText("");
				 locationE.setText("");
				 dateE.setText("");
			}
		});
		btnAddEducation.setBounds(816, 393, 123, 23);
		frame.getContentPane().add(btnAddEducation);
		
		JLabel lblAdditionalInformation = new JLabel("Additional Information");
		lblAdditionalInformation.setBounds(741, 33, 161, 14);
		frame.getContentPane().add(lblAdditionalInformation);
		
		
		additionalInformation.setBounds(662, 48, 232, 73);
		frame.getContentPane().add(additionalInformation);
		
		JLabel lblInterests = new JLabel("Interests");
		lblInterests.setBounds(751, 140, 46, 14);
		frame.getContentPane().add(lblInterests);
		
		
		interests.setBounds(662, 183, 239, 73);
		frame.getContentPane().add(interests);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(education>-1){
					ArrayList<BulletListItem> bulletList = functional.getSection("Education and Training").getBulletList().getBulletListItem();
					String contents = qualification.getText().toString()+"_"+establishmentE.getText().toString()+"_"+ locationE.getText().toString();
					Date newDate = Date.valueOf(dateE.getText());
					if(check(bulletList,newDate,education)){
						BulletListItem item = bulletList.get(education);
						item.setContents(contents);
						item.setDate(newDate);
					}
				}
			}
		});
		btnUpdate.setBounds(816, 302, 89, 23);
		frame.getContentPane().add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(education>-1){
					functional.getSection("Education and Training").getBulletList().removeBulletListItem(education);
					
				}
				ArrayList<BulletListItem> bulletList = functional.getSection("Education and Training").getBulletList().getBulletListItem();

				if(bulletList.size()==0){
					education=-1;
					qualification.setText("");
					 establishmentE.setText("");
					 locationE.setText("");
					 dateE.setText("");
					return;
				}
				if(education==bulletList.size())
					education--;
				
				String contents = bulletList.get(education).getContents();
				String[] tokens = contents.split("_");
				qualification.setText(tokens[0]);
				establishmentE.setText(tokens[1]);
				locationE.setText(tokens[2]);
				dateE.setText(bulletList.get(education).getDate().toString());

			}
		});
		btnDelete.setBounds(816, 331, 89, 23);
		frame.getContentPane().add(btnDelete);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<BulletListItem> bulletList = functional.getSection("Education and Training").getBulletList().getBulletListItem();
				if(bulletList.size()>0){
					education=(education+1)%bulletList.size();
					//EducationAndTraining educationAndTraining = functional.getEducationAndTraining().get(education);
					String contents = bulletList.get(education).getContents();
					String[] tokens = contents.split("_");
					qualification.setText(tokens[0]);
					establishmentE.setText(tokens[1]);
					locationE.setText(tokens[2]);
					dateE.setText(bulletList.get(education).getDate().toString());
				}
				else{
					 qualification.setText("");
					 establishmentE.setText("");
					 locationE.setText("");
					 dateE.setText("");
				}
			}
		});
		btnNext.setBounds(813, 367, 89, 23);
		frame.getContentPane().add(btnNext);
		
		JButton btnUpdate_1 = new JButton("Update");
		btnUpdate_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(courseNum>-1){
					ArrayList<BulletListItem> bulletList = functional.getSection("Further Courses").getBulletList().getBulletListItem();
					String contents = course.getText().toString()+"_"+establishmentC.getText().toString()+"_"+locationC.getText().toString();
					Date newDate = Date.valueOf(dateC.getText());
					if(check(bulletList,newDate,courseNum)){
						BulletListItem item = bulletList.get(courseNum);
						item.setContents(contents);
						item.setDate(newDate);
					}
					course.setText("");
					establishmentC.setText("");
					locationC.setText("");
					dateC.setText("");
					 
					
				}
			}

			
		});
		btnUpdate_1.setBounds(813, 467, 89, 23);
		frame.getContentPane().add(btnUpdate_1);
		
		JButton btnDelete_1 = new JButton("Delete");
		btnDelete_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(courseNum>-1){
					functional.getSection("Further Courses").getBulletList().removeBulletListItem(courseNum);
					
				}
				ArrayList<BulletListItem> bulletList = functional.getSection("Further Courses").getBulletList().getBulletListItem();

				if(bulletList.size()==0){
					courseNum=-1;
					 qualification.setText("");
					 establishmentE.setText("");
					 locationE.setText("");
					 dateE.setText("");
					return;
				}
				if(courseNum==bulletList.size())
					courseNum--;
				
				String contents = bulletList.get(courseNum).getContents();
				String[] tokens = contents.split("_");
				course.setText(tokens[0]);
				establishmentC.setText(tokens[1]);
				locationC.setText(tokens[2]);
				dateC.setText(bulletList.get(courseNum).getDate().toString());
			}
		});
		btnDelete_1.setBounds(813, 499, 89, 23);
		frame.getContentPane().add(btnDelete_1);
		
		JButton btnNext_1 = new JButton("Next");
		btnNext_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ArrayList<BulletListItem> bulletList = functional.getSection("Further Courses").getBulletList().getBulletListItem();
				System.out.println("size "+bulletList.size());
				if(bulletList.size()>0){
					
					courseNum=(courseNum+1)%bulletList.size();
					
					String contents = bulletList.get(courseNum).getContents();
					String[] tokens = contents.split("_");
					course.setText(tokens[0]);
					establishmentC.setText(tokens[1]);
					locationC.setText(tokens[2]);
					dateC.setText(bulletList.get(courseNum).getDate().toString());
				}
				else{
					 course.setText("");
					 establishmentC.setText("");
					 locationC.setText("");
					 dateC.setText("");
				}
			}
		});
		btnNext_1.setBounds(813, 524, 89, 23);
		frame.getContentPane().add(btnNext_1);
		
		JButton btnUpdate_2 = new JButton("Update");
		btnUpdate_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(careerNum>-1){
					ArrayList<BulletListItem> bulletList = functional.getSection("Career Summary").getBulletList().getBulletListItem();
					String contents = companyName.getText()+"_"+ jobTitle.getText().toString();
					Date newDate = Date.valueOf(dateC.getText());
					if(check(bulletList,newDate,careerNum)){
						BulletListItem item = bulletList.get(careerNum);
						item.setContents(contents);
						item.setDate(newDate);
					}
				}
			}
		});
		btnUpdate_2.setBounds(266, 542, 89, 23);
		frame.getContentPane().add(btnUpdate_2);
		
		JButton btnDelete_2 = new JButton("Delete");
		btnDelete_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(careerNum>-1){
					functional.getSection("Career Summary").getBulletList().removeBulletListItem(careerNum);
					
				}
				ArrayList<BulletListItem> bulletList = functional.getSection("Career Summary").getBulletList().getBulletListItem();
				if( bulletList.size()==0){
					careerNum=-1;
					 qualification.setText("");
					 establishmentE.setText("");
					 locationE.setText("");
					 dateE.setText("");
					return;
				}
				if(careerNum==bulletList.size())
					careerNum--;
				

				String contents = bulletList.get(careerNum).getContents();
				String[] tokens = contents.split("_");
				companyName.setText(tokens[0]);
				jobTitle.setText(tokens[1]);
				date.setText(bulletList.get(careerNum).getDate().toString());
			}
		});
		/*btnDelete_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(careerNum>-1){
					functional.getCareerSummary().remove(courseNum);
					
				}
				if(functional.getCareerSummary().size()==0){
					careerNum=-1;
					 companyName.setText("");
					 jobTitle.setText("");
					 date.setText("");
					return;
				}
				if(courseNum==functional.getFurtherCourses().size())
					courseNum--;
				CareerSummary careerSummary = functional.getCareerSummary().get(courseNum);
				companyName.setText(careerSummary.getCompanyName());
				jobTitle.setText(careerSummary.getJobTitle());
				date.setText(careerSummary.getDate());
			}
		});*/
		btnDelete_2.setBounds(266, 576, 89, 23);
		frame.getContentPane().add(btnDelete_2);
		
		JButton btnNext_2 = new JButton("Next");
		btnNext_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ArrayList<BulletListItem> bulletList = functional.getSection("Career Summary").getBulletList().getBulletListItem();
				
				if(bulletList.size()>0){
					
					careerNum=(careerNum+1)%bulletList.size();
					
					String contents = bulletList.get(careerNum).getContents();
					String[] tokens = contents.split("_");
					companyName.setText(tokens[0]);
					jobTitle.setText(tokens[1]);
					date.setText(bulletList.get(careerNum).getDate().toString());
				}
				else{
					companyName.setText("");
					jobTitle.setText("");
					date.setText("");
				}
			}
		});
		/*btnNext_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(functional.getCareerSummary().size()>0){
					careerNum=(careerNum+1)%functional.getCareerSummary().size();
					CareerSummary careerSummary = functional.getCareerSummary().get(courseNum);
					companyName.setText(careerSummary.getCompanyName());
					jobTitle.setText(careerSummary.getJobTitle());
					date.setText(careerSummary.getDate());
					
				}
				else{
					companyName.setText("");
					jobTitle.setText("");
					date.setText("");
					
				}
			}
		});*/
		btnNext_2.setBounds(266, 600, 89, 23);
		frame.getContentPane().add(btnNext_2);
	}
	private boolean check(ArrayList<BulletListItem> bulletList, Date newDate, int courseNum) {
		// TODO Auto-generated method stub
		if(bulletList.size()==1)
			return true;
		if(bulletList.size()==2){
			if(courseNum==0){
				if(newDate.after(bulletList.get(1).getDate()))
					return true;
				return false;
			}
			else{
				if(newDate.before(bulletList.get(1).getDate()))
					return true;
				return false;
			}
		}
		if(newDate.before(bulletList.get(courseNum-1).getDate()) && newDate.after(bulletList.get(courseNum+1).getDate()))
			return true;
		return false;
	}
}
