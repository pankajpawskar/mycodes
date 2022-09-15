package dtodaorider;

import com.xworkz.dto.AlcoholDTO;
import com.xworkz.dao.AlcoholDAO;
import com.xworkz.daoImpl.AlcoholDAOImpl;

public class AlcoholRider {
	AlcoholDTO dto = new AlcoholDTO();
	dto.setAcidic(true);
	dto.setAcoholTax(15);
	dto.setAlcoholcolor("Light chocolate");
	dto.setAlcoholContent(42.8);
	dto.setAlcoholInMl(180);
	dto.setAlcoholName("DSP Black");
	dto.setAlcoholPrice(150);
	dto.setType("Whisky");
	dto.setLiquid(true);
	dto.setMadeIn("India");
	dto.setOdour(true);
	dto.setPackedIn("Glass");
	dto.setpHValue(7.33);
	dto.setSolubleInWater(true);
	dto.setSweet(false);

	AlcoholDAO dao = new AlcoholDAOimpl();
	dao.create(dto);
}

}