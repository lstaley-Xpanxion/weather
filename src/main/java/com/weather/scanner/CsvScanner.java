package com.weather.scanner;

import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.opencsv.CSVReader;
import com.weather.converter.ArraytoMeasurementConverter;
import com.weather.mapper.MeasurementMapper;
import com.weather.model.Measurement;

@Service
public class CsvScanner {

	@Autowired
	private MeasurementMapper measurementMapper;
	
	String csvFileLocation = "/Users/lstaley/Downloads/Beach_Weather_Stations_-_Automated_Sensors.csv";
	
	
	public void scan() {
		CSVReader reader = null;
		  try {
			reader =  new CSVReader(new FileReader(csvFileLocation));
	            String[] line;
	            reader.readNext(); //remove header line
	            while ((line = reader.readNext()) != null) {
	            	Measurement measurement = ArraytoMeasurementConverter.convert(line);
	            	measurementMapper.insertMeasurement(measurement);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}
}

