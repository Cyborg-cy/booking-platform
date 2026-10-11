package io.github.cyborgcy.booking;

import org.springframework.boot.SpringApplication;

public class TestBookingPlatformApplication {

	public static void main(String[] args) {
		SpringApplication.from(BookingPlatformApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
