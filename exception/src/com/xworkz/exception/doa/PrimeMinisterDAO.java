package com.xworkz.exception.doa;

import com.xworkz.exception.uncheckedexception.UnCheckedException;

public interface PrimeMinisterDAO {

	boolean save(String name) throws UnCheckedException;

	boolean checkName(String name);

}
