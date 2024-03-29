package com.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.weather.scanner.CsvScanner;

@RestController
public class WeatherController {

	@Autowired
	private CsvScanner scanner;
	
	@CrossOrigin
	@GetMapping(value = "/data")
	public void importData(@RequestParam(required = false) String filePath) {
		scanner.scan();
	}
	
}
