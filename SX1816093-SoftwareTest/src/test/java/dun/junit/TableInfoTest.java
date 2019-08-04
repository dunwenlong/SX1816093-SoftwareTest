package dun.junit;
import junit.framework.TestCase;

public class TableInfoTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testGetName() {
		TableInfo tableInfo = new TableInfo();
		tableInfo.setName("xiaoming");
		assertEquals("xiaoming", tableInfo.getName());
	}

	public void testSetName() {
		TableInfo tableInfo = new TableInfo();
		tableInfo.setName("xiaoming");
		assertEquals("xiaoming", tableInfo.getName());
	}

	public void testGetType() {
		TableInfo tableInfo = new TableInfo();
		tableInfo.setType("Future");
		assertEquals("Future", tableInfo.getType());
	}

	public void testSetType() {
		TableInfo tableInfo = new TableInfo();
		tableInfo.setType("Future");
		assertEquals("Future", tableInfo.getType());
	}

	public void testGetDesc() {
		TableInfo tableInfo = new TableInfo();
		tableInfo.setDesc("Good");
		assertEquals("Good", tableInfo.getDesc());
	}

	public void testSetDesc() {
		TableInfo tableInfo = new TableInfo();
		tableInfo.setDesc("Good");
		assertEquals("Good", tableInfo.getDesc());
	}

	public void testIsPrimary() {
		TableInfo tableInfo = new TableInfo();
		tableInfo.setPrimary(false);
		assertEquals(false, tableInfo.isPrimary());
	}

	public void testSetPrimary() {
		TableInfo tableInfo = new TableInfo();
		tableInfo.setPrimary(false);
		assertEquals(false, tableInfo.isPrimary());
	}

}
