/**
 * KartPositionConfiguration
 * Creation Date :: 23/05/2019
 * Author: Alcides Foly
 * Description: Class that ready properties from application.properties
 */
package com.br.gympass.interview.configuration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class KartPositionConfiguration  {

	public static String getKartLogPathProperty() throws FileNotFoundException, IOException {
		
		Properties appProp = new Properties();
		String resourceRootPathFolder = Thread.currentThread().getContextClassLoader().getResource("").getPath();
		appProp.load(new FileInputStream(resourceRootPathFolder + "application.properties"));
		return appProp.getProperty("kartpositionlogpath");
		
	}
	
	// -- ...Another Property
	// -- ...

	
	
}
