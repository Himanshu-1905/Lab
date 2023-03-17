
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class MyRegex {
		  String pattern;

		    public MyRegex() {
		        // The regular expression for a valid IP address
		        pattern = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
		    }

		    public boolean isValidIP(String ipAddress) {
		        // Check if the given string matches the regular expression for a valid IP address
		        Pattern p = Pattern.compile(pattern);
		        Matcher m = p.matcher(ipAddress);
		        return m.matches();
		    }
		public static void main(String[] args) {
			MyRegex regex = new MyRegex(); //main method
			System.out.println(regex.isValidIP("000.12.12.034")); 
			System.out.println(regex.isValidIP("121.234.12.12"));  // true
			System.out.println(regex.isValidIP("23.45.12.56"));    // true
			System.out.println(regex.isValidIP("00.12.123.123123.123"));  // false
			System.out.println(regex.isValidIP("122.23"));         // false
			System.out.println(regex.isValidIP("Hello.IP")); 
		}

	}