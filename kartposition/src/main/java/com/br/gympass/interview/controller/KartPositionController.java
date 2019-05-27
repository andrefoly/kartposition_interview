/**
 * KartPositionController
 * Creation Date :: 23/05/2019
 * Author: Alcides Foly
 * Description: Class that executes businnes logic to pass Kart result view
 */
package com.br.gympass.interview.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import com.br.gympass.interview.configuration.KartPositionConfiguration;
import com.br.gympass.interview.exception.KartPositionIncorrectFileException;
import com.br.gympass.interview.service.KartPositionService;

public class KartPositionController {

	public void showKartPositionResult() throws KartPositionIncorrectFileException, FileNotFoundException, IOException {

			new KartPositionService().getKartPositionResult(KartPositionConfiguration.getKartLogPathProperty());
	}

}
