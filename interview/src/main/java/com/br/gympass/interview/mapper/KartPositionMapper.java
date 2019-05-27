
/**
 * KartPositionMapper
 * Creation Date :: 23/05/2019
 * Author: Alcides Foly
 * Description: Class to mapper correct kart position data from log file
 */
package com.br.gympass.interview.mapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Component;
import com.br.gympass.interview.domain.entity.KartPositionEntity;

@Component
public class KartPositionMapper {

	public List<KartPositionEntity> getKartPositionDataMapper(String kartPositionList) {

		// -- KartPosition objects
		KartPositionEntity kartPositionEntity = null;
		ArrayList<KartPositionEntity> kartPositionEntitiesList = new ArrayList<KartPositionEntity>();

		// -- Get result lines
		String line[] = kartPositionList.split("\n");

		// -- Line count
		int lineCount = 1;

		for (String item : line) {

			// -- condition to skip first line
			if (item.contains("Hora"))
				continue;

			// -- Split lines to array
			String lineItem[] = item.split("\\s");

			// -- Filter KartPosition result
			lineItem = Arrays.stream(lineItem).filter(s -> (s != null && s.length() > 0)).toArray(String[]::new);

			// -- New KartPosition object
			kartPositionEntity = new KartPositionEntity();

			// -- Set values
			kartPositionEntity.setLineid(lineCount);
			kartPositionEntity.setHora(lineItem[0]);
			kartPositionEntity.setCodpiloto(lineItem[1]);
			kartPositionEntity.setPiloto(lineItem[3]);
			kartPositionEntity.setNumerovolta(Integer.parseInt(lineItem[4].trim()));
			kartPositionEntity.setTempoVolta(lineItem[5]);
			kartPositionEntity.setTempovoltafilter(Integer.parseInt(lineItem[5].replace(":", "").replace(".", "")));
			kartPositionEntity.setVelocidademedia(lineItem[6]);

			// -- Add object to list
			kartPositionEntitiesList.add(kartPositionEntity);

			// -- Line count
			lineCount = +1;

		}

		return kartPositionEntitiesList;

	}

}
