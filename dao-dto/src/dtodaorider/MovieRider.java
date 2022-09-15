package dtodaorider;

import com.xworkz.dto.MovieDTO;
import com.xworkz.daoImpl.*;
import com.xworkz.dao.*;
public class MovieRider {

	public static void main(String[] args) {


		MovieDTO dto = new MovieDTO();
		String[] actors = { "Sudeep", "Neetha Ashok", "Jacqueline fernadez", "Nirup bhandari", "Ravishankargowda" };
		dto.setActorsNames(actors);
		dto.setBudget(95);
		dto.setCollection(210);
		dto.setFanIndiaMovie(true);
		dto.setHeroineName("Neetha Ashok");
		dto.setHeroName("Sudeep");
		dto.setId(1);
		dto.setKannadaMovie(true);
		dto.setMovieName("Vikranth Rona");
		dto.setNoOfActors(12);
		dto.setNoOfsongs(6);
		String[] producers = { "Jack manju", "Alankar Pandian", "Shalini Manjunath" };
		dto.setProducerNames(producers);
		dto.setProductionHouse("Kichha creations");
		dto.setDirectorName("Anup Bhandari");
		dto.setRating(7.8);

		MoiveDAO dao = new MovieDAOImpl();
		dao.create(dto);

	}

}
