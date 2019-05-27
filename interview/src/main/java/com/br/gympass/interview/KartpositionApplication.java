package com.br.gympass.interview;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.br.gympass.interview.controller.KartPositionController;
import com.br.gympass.interview.exception.KartPositionIncorrectFileException;

@SpringBootApplication
public class KartpositionApplication {

	public static void main(String[] args) throws KartPositionIncorrectFileException, FileNotFoundException, IOException {
		SpringApplication.run(KartpositionApplication.class, args);
		
		// -- Show Kart Result -- //
		new KartPositionController().showKartPositionResult();
	}

}
