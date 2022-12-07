package com.xworkz.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.repository.AdobeRepo;
import com.xworkz.repository.AdobeRepoIMPL;
import com.xworkz.repository.AliensRepo;
import com.xworkz.repository.AliensRepoIMPL;
import com.xworkz.repository.AstrologyRepo;
import com.xworkz.repository.AstrologyRepoIMPL;
import com.xworkz.repository.FifaRepo;
import com.xworkz.repository.FifaRepoIMPL;
import com.xworkz.repository.HikeRepo;
import com.xworkz.repository.HikeRepoIMPL;
import com.xworkz.repository.ProKabaddiRepo;
import com.xworkz.repository.ProKabaddiRepoIMPL;
import com.xworkz.repository.SleepRepo;
import com.xworkz.repository.SleepRepoIMPL;
import com.xworkz.repository.SlipperRepo;
import com.xworkz.repository.SlipperRepoImpl;
import com.xworkz.repository.UfcRepo;
import com.xworkz.repository.UfcRepoIMPL;
import com.xworkz.repository.WeatherRepo;
import com.xworkz.repository.WeatherRepoIMPL;

@Configuration
@ComponentScan("com.xworkz")
public class SpringConfiguration {

	@Bean
	public AdobeRepo adobeRepo() {
		return new AdobeRepoIMPL();
	}

	@Bean
	public AliensRepo aliensRepo() {
		return new AliensRepoIMPL();
	}

	@Bean
	public AstrologyRepo astrologyRepo() {
		return new AstrologyRepoIMPL();
	}

	@Bean
	public FifaRepo fifaRepo() {
		return new FifaRepoIMPL();
	}

	@Bean
	public HikeRepo hikeRepo() {
		return new HikeRepoIMPL();
	}

	@Bean
	ProKabaddiRepo proKabaddiRepo() {
		return new ProKabaddiRepoIMPL();
	}

	@Bean
	public SleepRepo sleepRepo() {
		return new SleepRepoIMPL();
	}

	@Bean
	public SlipperRepo slipperRepo() {
		return new SlipperRepoImpl();
	}

	@Bean
	public UfcRepo ufcRepo() {
		return new UfcRepoIMPL();
	}

	@Bean
	public WeatherRepo weatherRepo() {
		return new WeatherRepoIMPL();
	}

}
