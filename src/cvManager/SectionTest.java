package cvManager;

import static org.junit.Assert.*;

import java.sql.Date;

import org.junit.Test;

public class SectionTest {

	@Test
	public void testAddBulletListItem() {
		Section section = new Section("career summary");
		assertEquals("Den douleyei ", 0, section.getBulletList().getBulletListItem().size());
		BulletListItem item = new BulletListItem(Date.valueOf("2010-01-01"),"item");
		section.addBulletListItem(item);
		
		assertEquals("Den douleyei ", 1, section.getBulletList().getBulletListItem().size());
	}

}
