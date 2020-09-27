package tech.pucci.mars.marsweather.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import tech.pucci.mars.marsweather.usecase.SolUseCase;
import tech.pucci.mars.marsweather.usecase.SolUseCaseImpl;

@Configuration
public class AppConfig {

	@Bean
	public SolUseCase useCase() {
		return new SolUseCaseImpl();
	}

}
