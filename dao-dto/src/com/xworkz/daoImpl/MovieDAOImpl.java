package com.xworkz.daoImpl;

import com.xworkz.dao.MoiveDAO;
import com.xworkz.dto.MovieDTO;

public class MovieDAOImpl implements MoiveDAO {
	private MovieDTO[] movies = new MovieDTO[15];
	private int index = 0;

	@Override
	public boolean create(MovieDTO dto) {
		this.movies[index] = dto;
		this.index++;
		System.out.println("movie is saved"+dto+" "+"int index"+this.index);
		return true;
	}
}
