package singeltonFileReading;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;
import java.util.HashMap;

public class Configuration {
	private static Configuration instance;
	private HashMap<String,String> config = new HashMap<String,String>();

	private Configuration(){
		try {
			File file = new File("config.properties");
			FileInputStream fileInput = new FileInputStream(file);
			Properties properties = new Properties();
			properties.load(fileInput);
			fileInput.close();

			Enumeration<Object> enuKeys = properties.keys();

			while (enuKeys.hasMoreElements()) {
				String key = (String) enuKeys.nextElement();
				String value = properties.getProperty(key);
				config.put(key,value);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String getValue(String key){
		String value = null;
		if(config.containsKey(key)){
			value = config.get(key);
		}
		return value;
	}
	
	public static Configuration getInstance(){
		if(instance == null)
			instance = new Configuration();
		return instance;
	}
}
