package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

    Properties pro;

    public ReadConfig() {

        File src = new File("./Configuration/config.properties");

        try {
            FileInputStream fis = new FileInputStream(src);
            pro = new Properties();
            pro.load(fis);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getApplicationURL() {
        String url = pro.getProperty("baseURL");
        return url;
    }

    public String getIntegrationURL() {
        String url = pro.getProperty("integrationURL");
        return url;
    }

    public String getProductServices() {
        String url = pro.getProperty("productServices");
        return url;
    }

    public String getChromePath() {
        String chromePath = pro.getProperty("chromepath");
        return chromePath;
    }

    public String getFireFoxPath() {
        String fireFoxPath = pro.getProperty("firefoxpath");
        return fireFoxPath;
    }

    public String getIEPath() {
        String iePath = pro.getProperty("iepath");
        return iePath;
    }

}
