package utilities;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private Properties prop;

    public Properties init_reader() throws IOException {
        prop = new Properties();
        FileInputStream ip = new FileInputStream("C:\\Users\\Dipal\\IdeaProjects\\Opencart_Demo_Hybridge\\src\\test\\resources\\dataset\\config.properties");
        prop.load(ip);
        return prop;
    }
}
