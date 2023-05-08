package Demo;
import java.util.regex.*;

public class regularExpression {
	public static void main(String[] args) {
		
		String pattern = "[a-z]+";
		String status = "RegularExpression";
		Pattern p = Pattern.compile(pattern);
		Matcher c = p.matcher(status);
		
		while(c.find()) {
			System.out.println(status.substring(c.start(),c.end()));
		}
	}
}
