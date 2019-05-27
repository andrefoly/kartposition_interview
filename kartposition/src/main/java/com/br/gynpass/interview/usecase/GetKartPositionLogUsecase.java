/**
 * KartPositionEntity
 * Creation Date :: 23/05/2019
 * Author: Alcides Foly
 * Description: UseCase class to prepare data from log file before pass data provider
 */

package com.br.gynpass.interview.usecase;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import com.br.gympass.interview.domain.entity.KartPositionEntity;
import com.br.gympass.interview.exception.KartPositionIncorrectFileException;
import com.br.gympass.interview.mapper.KartPositionMapper;

public class GetKartPositionLogUsecase {

	public List<KartPositionEntity> readyLogKartPosition(String fileName) throws KartPositionIncorrectFileException {

		// -- KartPosition Mapper Object
		List<KartPositionEntity> kartPositionEntityMapper = null;

		// -- File resources
		ClassLoader classLoader = ClassLoader.getSystemClassLoader();
		File file = new File(classLoader.getResource(fileName).getFile());

		try {

			// -- Read file
			String fileContent = new String(Files.readAllBytes(file.toPath()));

			// -- Map result
			kartPositionEntityMapper = new KartPositionMapper().getKartPositionDataMapper(fileContent);

		} catch (IOException ioEx) {
			ioEx.printStackTrace();

		} catch (Exception ex) {
			throw new KartPositionIncorrectFileException(
					"Erro ao ler o arquivo de log.\nVerifique se o arquivo é válido. " + ex.toString());
		} finally {
			file = null;
		}

		return kartPositionEntityMapper;
	}

}
