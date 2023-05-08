package Demo;

import java.util.*;
public class innerClass {
	private String ms = "Welcome to the world of java";
	
	class Inner{
		void hello() {
			System.out.println(ms + ", lets start learning inner classses");
		}
	}
	public static void main(String[] args) {
		innerClass obj = new innerClass();
		innerClass.Inner in = obj.new Inner();
		in.hello();
	}
}

