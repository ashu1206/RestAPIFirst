package utility;

import java.io.InputStream;
import java.util.Properties;
import java.util.Random;

public class BaseClass {
	
	protected String server = LoadProperties().getProperty("url");
	protected String accessToken = LoadProperties().getProperty("token");
	
	
public Properties LoadProperties() {
		
        Properties prop;
		try {
			InputStream inStream = getClass().getClassLoader().getResourceAsStream("config.properties");
			prop = new Properties();
			prop.load(inStream);
			return prop;
		} catch (Exception e) {
			System.out.println("File not found exception thrown for config.properties file.");
			return null;
		}
		
	}
	
	 public String GetRandomString(int n) {
			
			int lowerLimit = 97;
			int upperLimit = 122;
			
			Random random = new Random();
			
			StringBuffer r = new StringBuffer(n);
			
			for(int i=0;i<n;i++) {
				
				int nextRandomChar = lowerLimit + (int)(random.nextFloat() * (upperLimit - lowerLimit + 1));
				
				r.append((char)nextRandomChar);
						
			}
			return r.toString();
		} 


}
