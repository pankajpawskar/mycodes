package dtodaorider;

import com.xworkz.dto.ApartmentDTO;
import com.xworkz.dao.ApartmentDAO;
import com.xworkz.daoImpl.ApartmentDAOimpl;

public class ApartmentRider {

	public static void main(String[] args) {
		ApartmentDTO dto = new ApartmentDTO();
		dto.setApartmentLength(60);
		dto.setApartmentName("HARI OHM");
		dto.setApartmentWidth(40);
		dto.setCamera(true);
		dto.setCostPerFlat(12);
		dto.setGarden(true);
		dto.setLifeSpan(60);
		dto.setLift(true);
		dto.setNoOfFlats(22);
		dto.setNoOfFloors(4);
		dto.setParking(true);
		dto.setSecurity(true);
		dto.setSolar(true);
		dto.setSwimmingPool(false);

		ApartmentDAO dao = new ApartmentDAOimpl();
		dao.create(dto);

	}

}
