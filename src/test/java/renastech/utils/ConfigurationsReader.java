package renastech.utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationsReader {

    private static Properties configFile;

    static { //everythime static block will run firstl, before everything

        try {
            FileInputStream fileInputStream = new FileInputStream("configuration.properties");//bunun icine nereden cagiracagini yaziyprsun, baska bir yerden de cagirmak isteseydin eklersin, configuration olmak zorunda degil
            configFile = new Properties();
            configFile.load(fileInputStream); //fileInputStream'de ne varsa load yapacak

            fileInputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }


    }

    public static String getProperty(String key){

        return configFile.getProperty(key);
    }



}