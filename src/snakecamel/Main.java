package snakecamel;

public class Main {

	public static void main(String[] args) {
		SnakeCamelUtil SCU= new SnakeCamelUtil();
		System.out.println(SCU.capitalize(""));
		System.out.println(SCU.capitalize("a"));
		System.out.println(SCU.capitalize("xyz"));
		System.out.println(SCU.uncapitalize(""));
		System.out.println(SCU.uncapitalize("A"));
		System.out.println(SCU.uncapitalize("Xyz"));
		System.out.println(SCU.snakeToCamelcase("abc"));
		System.out.println(SCU.snakeToCamelcase("abc_def"));
		System.out.println(SCU.snakeToCamelcase("abc_def_gh"));
		System.out.println(SCU.snakeToCamelcase("abc__def__gh"));
		System.out.println(SCU.snakeToCamelcase("_abc_def__"));
		System.out.println(SCU.camelToSnakecase("abc"));
		System.out.println(SCU.camelToSnakecase("AbcDef"));
		System.out.println(SCU.camelToSnakecase("AbcDefGh"));
		// TODO Auto-generated method stub

	}

}
