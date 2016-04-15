package test;

import java.net.URL;

import org.eclipse.jetty.xml.XmlConfiguration;



public class ConfigTest {
	public static void main(String[] args) throws Exception{
		URL url=ConfigTest.class.getClassLoader().getResource("configure.xml");
		XmlConfiguration configuration=new XmlConfiguration(url);
		TestObject testObject=(TestObject) configuration.configure();
		System.out.println(configuration.getIdMap());
	}
	
}
