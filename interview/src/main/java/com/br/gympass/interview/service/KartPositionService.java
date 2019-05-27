/**
 * KartPositionService
 * Creation Date :: 23/05/2019
 * Author: Alcides Foly
 * Description: Service class to build business logic complement to pass controller class
 */
package com.br.gympass.interview.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.joda.time.LocalTime;

import com.br.gympass.interview.dataprovider.KartPositionDataProvider;
import com.br.gympass.interview.domain.entity.KartPositionEntity;
import com.br.gympass.interview.exception.KartPositionIncorrectFileException;

public class KartPositionService {

	List<KartPositionEntity> kartPositionEntityList;
	List<KartPositionEntity> kartPositionFinalResultList = new ArrayList<KartPositionEntity>();
	int position = 0;
	LocalTime totalTime;
	LocalTime totalTimeResult;
	List<LocalTime> localTimeListResult = new ArrayList<LocalTime>();

	public List<KartPositionEntity> getKartPositionResult(String logPath) throws KartPositionIncorrectFileException {

		kartPositionEntityList = new KartPositionDataProvider().getKartPostionLogFileData(logPath);
		showKartResultService();
		return null;
	}

	private void showKartResultService() {

		// -- General result -- //
		System.out.println("\n");
		System.out.println(
				"******************************** RESULTADO DA CORRIDA - GERAL ***********************************");
		System.out.println(
				"-------------------------------------------------------------------------------------------------");

		Collections.sort(kartPositionEntityList, Comparator.comparing(KartPositionEntity::getCodpiloto).thenComparing(
				KartPositionEntity::getTempovoltafilter, Comparator.nullsLast(Comparator.naturalOrder())));

		kartPositionEntityList.forEach((p) -> {
			if (p.getNumerovolta() == 4) {
				kartPositionFinalResultList.add(p);
			}
			System.out.println(" COD. PILOTO: " + p.getCodpiloto() + " - NOME PILOTO: " + p.getPiloto() + " - "
					+ "TEMPO PROVA: " + p.getTempoVolta() + " - " + "QTD. VOLTAS: " + p.getNumerovolta());

		});

		// -- Result who has completed circuit -- //
		System.out.println("\n");
		System.out.println(
				"******************************** RESULTADO DA CORRIDA - FINAL ***********************************");
		System.out.println(
				"-------------------------------------------------------------------------------------------------");

		Collections.sort(kartPositionFinalResultList, Comparator.comparing(KartPositionEntity::getTempovoltafilter,
				Comparator.nullsLast(Comparator.naturalOrder())));

		kartPositionFinalResultList.forEach((p) -> {
			position = position + 1;
			System.out.println("POSICAO: " + position + "º" + " - COD. PILOTO: " + p.getCodpiloto() + " - NOME PILOTO: "
					+ p.getPiloto() + " - " + "TEMPO PROVA: " + p.getTempoVolta() + " - " + "QTD. VOLTAS: "
					+ p.getNumerovolta());

		});

	}

}
