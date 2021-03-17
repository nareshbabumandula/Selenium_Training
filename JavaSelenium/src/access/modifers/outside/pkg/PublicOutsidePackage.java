package access.modifers.outside.pkg;

import com.access.modifiers.PublicTest;

public class PublicOutsidePackage {

	public static void main(String[] args) {
		System.out.println("Accessing public members from a different package");
		PublicTest pt = new PublicTest();
		System.out.println(pt.URL);
		System.out.println(pt.USERNAME);
		pt.accessSite();
		System.out.println(pt.PASSWORD);
		pt.login();

	}

}
