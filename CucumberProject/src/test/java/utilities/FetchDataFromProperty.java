package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import ConstantsData.ConstantsData;


public class FetchDataFromProperty 
{
	public static Properties getDataFromProperty() throws IOException
	{
		FileReader filereader =new FileReader(ConstantsData.proppath);
		Properties prop=new Properties();
		prop.load(filereader);
		
		return prop;
		
	}

}
