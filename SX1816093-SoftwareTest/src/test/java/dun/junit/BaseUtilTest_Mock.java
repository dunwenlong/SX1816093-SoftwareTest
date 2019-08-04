package dun.junit;

import junit.framework.TestCase;
import static org.mockito.Mockito.*;

public class BaseUtilTest_Mock extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	public void testTableNameToJava() {
		BaseUtil baseUtil = mock(BaseUtil.class);
		when(baseUtil.columnNameToJava("is_Sx1816093_Dun_")).thenReturn("isSx1816093Dun");
		assertEquals("isSx1816093Dun", baseUtil.columnNameToJava("is_Sx1816093_Dun_"));
	}
	
	public void testSqlTypeToJava() {
		BaseUtil baseUtil = mock(BaseUtil.class);
		when(baseUtil.sqlTypeToJava("int")).thenReturn("testmock");
		assertEquals("testmock", baseUtil.sqlTypeToJava("int"));
	}
}