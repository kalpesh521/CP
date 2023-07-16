package CollectionFramework;

import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesCode {
    public static void main(String[] args) throws Exception {
        Properties p = new Properties();
        p.setProperty("Name", "Lenovo");
        p.setProperty("Ram", "8GB");
        p.setProperty(("Processor"), "I5");

        p.store(new FileOutputStream("D:\\kp.txt"), "Laptop");
    }
}
