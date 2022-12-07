package com.xworkz.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.config.SpringConfiguration;

import com.xworkz.service.AdobeService;
import com.xworkz.service.AliensService;
import com.xworkz.service.AstrologyService;
import com.xworkz.service.FifaService;
import com.xworkz.service.HikeService;
import com.xworkz.service.ProKabaddiService;
import com.xworkz.service.SleepSercive;
import com.xworkz.service.SlipperService;
import com.xworkz.service.UfcService;
import com.xworkz.service.WeatherService;

public class SpringBoot {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		AdobeService bean = context.getBean(AdobeService.class);
		System.out.println(bean.validateAndSave(null));

		AliensService bean1 = context.getBean(AliensService.class);
		System.out.println(bean.validateAndSave(null));

		AstrologyService bean2 = context.getBean(AstrologyService.class);
		System.out.println(bean.validateAndSave(null));

		FifaService bean3 = context.getBean(FifaService.class);
		System.out.println(bean.validateAndSave(null));

		HikeService bean4 = context.getBean(HikeService.class);
		System.out.println(bean.validateAndSave(null));

		ProKabaddiService bean5 = context.getBean(ProKabaddiService.class);
		System.out.println(bean.validateAndSave(null));

		SleepSercive bean6 = context.getBean(SleepSercive.class);
		System.out.println(bean.validateAndSave(null));

		SlipperService bean7 = context.getBean(SlipperService.class);
		System.out.println(bean.validateAndSave(null));

		UfcService bean8 = context.getBean(UfcService.class);
		System.out.println(bean.validateAndSave(null));

		WeatherService bean9 = context.getBean(WeatherService.class);
		System.out.println(bean.validateAndSave(null));

	}
}