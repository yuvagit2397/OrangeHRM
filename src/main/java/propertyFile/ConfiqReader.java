package propertyFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfiqReader {
	public ConfiqReader() {

	}

	public static Properties properties;

	static String s = "D:\\yuvasri_revision\\OrangeHRM\\src\\main\\java\\propertyFile\\Orange.properties";

	public static Properties getProperties() throws IOException {
		FileInputStream f = new FileInputStream(s);
		properties = new Properties();
		properties.load(f);
		return properties;
	}

	public String getUrl() throws IOException {
		getProperties();
       String url = properties.getProperty("url");
       return url;
	}
	public String getBrowser() throws IOException {
    getProperties();
    String browserName=properties.getProperty("browser");
    return browserName;
	}
}
