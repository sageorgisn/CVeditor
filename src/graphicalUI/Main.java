package graphicalUI;

import cvManager.CommonAttributes;
import outputCV.TxtFormat;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frame;
	
	private ArrayList<CommonAttributes> allCv = new ArrayList<CommonAttributes>();
	private ArrayList<CommonAttributes> functionalResumes = new ArrayList<CommonAttributes>();
	private ArrayList<CommonAttributes> chronologicalResumes = new ArrayList<CommonAttributes>();
	private ArrayList<CommonAttributes> combinedResumes = new ArrayList<CommonAttributes>();
	public void run(){//cp run
		frame.setVisible(true);
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main(new ArrayList<CommonAttributes>());
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	
	public Main( ArrayList<CommonAttributes> allCv) {
		
		this.allCv=allCv;
		for(int i=0;i<allCv.size();i++){
			if(allCv.get(i).getTypeCV().equals("functional"))
				this.functionalResumes.add(allCv.get(i));
			else if(allCv.get(i).getTypeCV().equals("chronological"))
				this.chronologicalResumes.add(allCv.get(i));
			else if(allCv.get(i).getTypeCV().equals("combined"))
				this.combinedResumes.add(allCv.get(i));
		}
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 434, 21);
		frame.getContentPane().add(menuBar, BorderLayout.NORTH);
		
		JMenu mnCreateCv = new JMenu("Create CV");
		menuBar.add(mnCreateCv);
		
		JMenuItem mntmFunctionalCvTemplate = new JMenuItem("Functional CV Template");
		mntmFunctionalCvTemplate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CommonAttributes commonAttributes = new CommonAttributes("functional");
				allCv.add( commonAttributes);
				FunctionalTemplateEdit functionalTemplate = new FunctionalTemplateEdit(commonAttributes,allCv);
				functionalTemplate.run();
				frame.dispose();
			}
		});
		mnCreateCv.add(mntmFunctionalCvTemplate);
		
		JMenuItem mntmChronologicalCvTemplate = new JMenuItem("Chronological CV Template");
		mntmChronologicalCvTemplate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("esfsdfsfe");
				CommonAttributes commonAttributes = new CommonAttributes("chronological");
				allCv.add( commonAttributes);
				ChronologicalTemplateEdit template = new ChronologicalTemplateEdit(commonAttributes,allCv);
				template.run();
				frame.dispose();
			}
		});
		mnCreateCv.add(mntmChronologicalCvTemplate);
		
		JMenuItem mntmCombinedCvTemplate = new JMenuItem("Combined CV Template");
		mntmCombinedCvTemplate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CommonAttributes commonAttributes = new CommonAttributes("combined");
				allCv.add( commonAttributes);
				CombinedTemplateEdit template = new CombinedTemplateEdit(commonAttributes,allCv);
				template.run();
				frame.dispose();
			}
		});
		mnCreateCv.add(mntmCombinedCvTemplate);
		
		JMenu mnEditCv = new JMenu("Edit CV");
		menuBar.add(mnEditCv);
		JList list = new JList(functionalResumes.toArray());
		list.setBounds(30, 63, 138, 156);
		frame.getContentPane().add(list);
		
		JList list_1 = new JList(chronologicalResumes.toArray());
		list_1.setBounds(201, 60, 94, 159);
		frame.getContentPane().add(list_1);
		
		JList list_2 = new JList(combinedResumes.toArray());
		list_2.setBounds(324, 63, 100, 156);
		frame.getContentPane().add(list_2);
		
		JMenuItem mntmFunctional = new JMenuItem("Functional");
		mntmFunctional.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CommonAttributes cv = functionalResumes.get(list.getSelectedIndex());
				FunctionalTemplateEdit fte = new FunctionalTemplateEdit(cv,allCv);
				fte.run();
				frame.dispose();
			}
		});
		mnEditCv.add(mntmFunctional);
		
		JMenuItem mntmChronological = new JMenuItem("Chronological");
		mntmChronological.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CommonAttributes cv = chronologicalResumes.get(list_1.getSelectedIndex());
				ChronologicalTemplateEdit fte = new ChronologicalTemplateEdit(cv,allCv);
				fte.run();
				frame.dispose();
			}
		});
		mnEditCv.add(mntmChronological);
		
		JMenuItem mntmCombined = new JMenuItem("Combined");
		mntmCombined.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CommonAttributes cv = combinedResumes.get(list_2.getSelectedIndex());
				CombinedTemplateEdit fte = new CombinedTemplateEdit(cv,allCv);
				fte.run();
				frame.dispose();
			}
		});
		mnEditCv.add(mntmCombined);
		
		JMenu mnSaveCv = new JMenu("Save CV");
		menuBar.add(mnSaveCv);
		
		JMenuItem mntmTxtFormat = new JMenuItem("Txt format");
		mntmTxtFormat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser fileChooser = new JFileChooser();
				int choice = fileChooser.showSaveDialog(null);
				System.out.println(choice);
				if(choice==JFileChooser.APPROVE_OPTION){
					CommonAttributes cv = null;
					
					if(list.isSelectionEmpty()==false)
						cv = functionalResumes.get(list.getSelectedIndex());
					else if(list_1.isSelectionEmpty()==false)
						cv = chronologicalResumes.get(list_1.getSelectedIndex());
					else if(list_2.isSelectionEmpty()==false)
						cv = combinedResumes.get(list_2.getSelectedIndex());
					
					TxtFormat txtFormat = new TxtFormat(fileChooser.getSelectedFile(),cv);
					txtFormat.writeFile();
				}
				
			}
		});
		mnSaveCv.add(mntmTxtFormat);
		
		JMenuItem mntmLatexFormat = new JMenuItem("Latex format");
		mnSaveCv.add(mntmLatexFormat);
		
		
		
		JLabel lblFunctionalCv = new JLabel("Functional CV");
		lblFunctionalCv.setBounds(46, 32, 94, 14);
		frame.getContentPane().add(lblFunctionalCv);
		
		JLabel lblChronologicalCv = new JLabel("Chronological CV ");
		lblChronologicalCv.setBounds(215, 32, 100, 14);
		frame.getContentPane().add(lblChronologicalCv);
		
		JLabel lblCombinedCv = new JLabel("Combined CV");
		lblCombinedCv.setBounds(342, 32, 70, 14);
		frame.getContentPane().add(lblCombinedCv);
	}
}
