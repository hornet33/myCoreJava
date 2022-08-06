package scratchPad;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropReader {
    public static void main(String[] args) {
        BufferedReader reader;
        Properties properties;
        String propertyFilePath = "src/scratchPad/resources/sample.properties";
        try {
            reader = new BufferedReader(new FileReader(propertyFilePath));
            properties = new Properties();
            try {
                properties.load(reader);
            } catch (IOException e) {
                throw new RuntimeException("Error loading properties file from " + propertyFilePath);
            } finally {
                reader.close();
            }
        } catch (IOException e) {
            throw new RuntimeException("Properties file not found at " + propertyFilePath);
        }

        //Iterating through all properties
        for (String key : properties.stringPropertyNames()) {
            String value = properties.getProperty(key);
            System.out.println(key + " => " + value);
        }
    }

}
