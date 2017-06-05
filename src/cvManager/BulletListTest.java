package cvManager;

import static org.junit.Assert.*;

import java.sql.Date;

import org.junit.Test;

public class BulletListTest {

	@Test
	public void testAddBulletListItem() {
		BulletList list = new BulletList();
		BulletListItem item = new BulletListItem(Date.valueOf("2010-01-01"),"UOI_student");
		list.addBulletListItem(item);
		assertEquals("Den mphke sto array ",1,list.getBulletListItem().size());
		
		item = new BulletListItem(Date.valueOf("2011-01-01"),"UOI_student");
		list.addBulletListItem(item);
		
		assertEquals("Mphke sto array ",1,list.getBulletListItem().size());
		
		
		item = new BulletListItem(Date.valueOf("2009-01-01"),"UOI_student");
		list.addBulletListItem(item);
		
		assertEquals("Mphke sto array ",2,list.getBulletListItem().size());
	}

	
	@Test
	public void testRemoveBulletListItem() {
		BulletList list = new BulletList();
		BulletListItem item = new BulletListItem(Date.valueOf("2010-01-01"),"UOI_student");
		list.addBulletListItem(item);
		
		item = new BulletListItem(Date.valueOf("2009-01-01"),"UOI_student");
		list.addBulletListItem(item);
		
		
		list.removeBulletListItem(1);
		
		assertEquals("Den afairethike ",1,list.getBulletListItem().size());
		
		item = new BulletListItem(Date.valueOf("2009-01-01"),"UOI_student");
		list.addBulletListItem(item);
		list.removeBulletListItem(1);
		
		assertEquals("Den afairethike ",1,list.getBulletListItem().size());
		list.removeBulletListItem(0);
		
		assertEquals("Den afairethike ",0,list.getBulletListItem().size());
	}
	
	@Test
	public void testCheck() {
		BulletList list = new BulletList();
		
		assertEquals("Den einai swsto ",true,list.check(Date.valueOf("2010-01-01")));
		
		BulletListItem item = new BulletListItem(Date.valueOf("2010-01-01"),"UOI_student");
		list.addBulletListItem(item);
		
		assertEquals("Den einai swsto ",false,list.check(Date.valueOf("2011-01-01")));
		assertEquals("Den einai swsto ",true,list.check(Date.valueOf("2008-01-01")));
		
		item = new BulletListItem(Date.valueOf("2008-01-01"),"UOI_student");
		list.addBulletListItem(item);
		
		assertEquals("Den einai swsto ",false,list.check(Date.valueOf("2009-01-01")));
		assertEquals("Den einai swsto ",true,list.check(Date.valueOf("2007-01-01")));
		
		

	}
}
