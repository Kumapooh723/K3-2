package snakecamel;

import static org.junit.Assert.*;

import org.junit.Test;

public class SnakecamelUnitTest {

	@Test
	public void test1() {
		SnakeCamelUtil SCU=new SnakeCamelUtil();
		String a,b;
		a="AbcDefGhi";
		b=SCU.snakeToCamelcase("abc_def_ghi");
		assertEquals(a,b);
		
		
		//fail("Not yet implemented");
	}
	public void test2() {
		SnakeCamelUtil SCU=new SnakeCamelUtil();
		String a="abc_def_ghi";
		String b=SCU.snakeToCamelcase("AbcDefGhi");
		assertEquals(a,b);
		
		
		//fail("Not yet implemented");
	}


}
