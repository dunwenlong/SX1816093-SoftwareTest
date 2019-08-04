package dun.junit;

//import junit.BaseUtil;
import junit.framework.TestCase;
import static org.mockito.Mockito.*;

public class BaseUtilTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	public void testTableNameToJava() {
		BaseUtil baseUtil = new BaseUtil();
		assertEquals("isSx1816093Dun", baseUtil.columnNameToJava("is_Sx1816093_Dun_"));
	}
	
	public void testSqlTypeToJava() {
		BaseUtil baseUtil = new BaseUtil();
		assertEquals("int", baseUtil.sqlTypeToJava("int"));
		assertEquals("boolean", baseUtil.sqlTypeToJava("bit"));
		assertEquals("String", baseUtil.sqlTypeToJava("varchar"));
		assertEquals("Date", baseUtil.sqlTypeToJava("datetime"));
		assertEquals("Date", baseUtil.sqlTypeToJava("timestamp"));
		assertEquals("double", baseUtil.sqlTypeToJava("double"));
		assertEquals("float", baseUtil.sqlTypeToJava("float"));
		assertEquals("char", baseUtil.sqlTypeToJava("char"));
		assertEquals("Object", baseUtil.sqlTypeToJava("else"));
	}
}