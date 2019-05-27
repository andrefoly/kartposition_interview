/**
 * KartPositionDataProvider
 * Creation Date :: 23/05/2019
 * Author: Alcides Foly
 * Description: Prepare data to pass controller layer
 */

package com.br.gympass.interview.dataprovider;

import java.util.List;

import com.br.gympass.interview.domain.entity.KartPositionEntity;
import com.br.gympass.interview.exception.KartPositionIncorrectFileException;
import com.br.gympass.interview.usecase.GetKartPositionLogUsecase;

public class KartPositionDataProvider {

	public List<KartPositionEntity> getKartPostionLogFileData(String logPath)
			throws KartPositionIncorrectFileException {
		return new GetKartPositionLogUsecase().readyLogKartPosition(logPath);
	}
}
