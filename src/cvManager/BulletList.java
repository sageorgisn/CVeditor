package cvManager;

import java.util.Date;
import java.util.ArrayList;

public class BulletList {
	private ArrayList<BulletListItem> bulletListItem;

	public BulletList() {
		super();
		bulletListItem = new ArrayList<BulletListItem>();
	}

	public void addBulletListItem(BulletListItem item) {
		// TODO Auto-generated method stub
		if(check(item.getDate()))
		this.bulletListItem.add(item);
	}

	public ArrayList<BulletListItem> getBulletListItem() {
		return bulletListItem;
	}

	public void setBulletListItem(ArrayList<BulletListItem> bulletListItem) {
		this.bulletListItem = bulletListItem;
	}

	public void removeBulletListItem(int courseNum) {
		// TODO Auto-generated method stub
		this.bulletListItem.remove(courseNum);
	}
	
	public boolean check(Date newDate) {
		// TODO Auto-generated method stub
		if(bulletListItem.size()<1)
			return true;
		if(newDate.before(bulletListItem.get(bulletListItem.size()-1).getDate()))
			return true;
		return false;
	}
	
	public String toString(){
		String str="";
		for(int i=0;i<bulletListItem.size();i++){
			str=str+bulletListItem.get(i).toString()+"\n";
		}
		return str;
	}
}
