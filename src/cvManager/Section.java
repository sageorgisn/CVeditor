package cvManager;

public class Section {
	
	private String title;
	private Paragraph paragraph;
	private BulletList bulletList;
	
	public Section(String title) {
		// TODO Auto-generated constructor stub
		this.title=title;
		this.paragraph = new Paragraph();
		this.bulletList = new BulletList();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Paragraph getParagraph() {
		return paragraph;
	}

	public void setParagraph(Paragraph paragraph) {
		this.paragraph = paragraph;
	}

	public BulletList getBulletList() {
		return bulletList;
	}

	public void setBulletList(BulletList bulletList) {
		this.bulletList = bulletList;
	}

	public void addBulletListItem(BulletListItem item) {
		// TODO Auto-generated method stub
		this.bulletList.addBulletListItem(item);
	}

	
}
