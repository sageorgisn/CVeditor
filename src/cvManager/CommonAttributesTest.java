package cvManager;

import static org.junit.Assert.*;
import org.junit.Test;

public class CommonAttributesTest {

	@Test
	public void testAddSection() {
		CommonAttributes commonAttributes = new CommonAttributes("");
		commonAttributes.addSection("title");
		
		assertEquals("Den mphke swsta ",1,commonAttributes.getSections().size());
	}

	@Test
	public void testGetSection() {
		CommonAttributes commonAttributes = new CommonAttributes("");
		commonAttributes.addSection("title");
		
		assertNotEquals("Den mphke swsta ",null,commonAttributes.getSection("title"));
		assertNotEquals("Den mphke swsta ",null,commonAttributes.getSection("section"));
	}

	@Test
	public void testAddParagraph() {
		CommonAttributes commonAttributes = new CommonAttributes("");
		commonAttributes.addParagraph("paragraph", "title");
		
		Section section = commonAttributes.getSection("title");
		assertEquals("den mphke swsta ","paragraph",section.getParagraph().getContents());
	}

	@Test
	public void testAddBulletListItem() {
		CommonAttributes commonAttributes = new CommonAttributes("");
		commonAttributes.addBulletListItem("list item","2015-01-01", "title");
		
		Section section = commonAttributes.getSection("title");
		assertEquals("den mphke swsta ",1,section.getBulletList().getBulletListItem().size());
		assertEquals("den mphke swsta ","list item",section.getBulletList().getBulletListItem().get(0).getContents());
	}

	@Test
	public void testGetParagraph() {
		CommonAttributes commonAttributes = new CommonAttributes("");
		commonAttributes.addParagraph("paragraph", "title");
		
		assertEquals("den mphke swsta","paragraph",commonAttributes.getParagraph("title"));
	}

}
