package com.weather.converter;

import org.apache.commons.lang3.StringUtils;

import com.weather.model.Measurement;

public class ArraytoMeasurementConverter {

	public ArraytoMeasurementConverter() {
	}

	public static Measurement convert(String[] line) {
		Measurement measurement = new Measurement();
		measurement.setStationName(line[0]);
		if (!StringUtils.isEmpty(line[1])) {
			measurement.setMeasurementTimestamp(TimestampFormatConverter.convert(line[1]));
		}
		if (!StringUtils.isEmpty(line[2])) {
			measurement.setAirTemp(Double.valueOf(line[2]));
		}
		if (!StringUtils.isEmpty(line[3])) {
			measurement.setWetBulbTemp(Double.valueOf(line[3]));
		}
		if (!StringUtils.isEmpty(line[4])) {
			measurement.setHumidity(Double.valueOf(line[4]));
		}
		if (!StringUtils.isEmpty(line[5])) {
			measurement.setRainIntensity(Double.valueOf(line[5]));
		}
		if (!StringUtils.isEmpty(line[6])) {
			measurement.setIntervalRain(Double.valueOf(line[6]));
		}
		if (!StringUtils.isEmpty(line[7])) {
			measurement.setTotalRain(Double.valueOf(line[7]));
		}
		if (!StringUtils.isEmpty(line[8])) {
			measurement.setPrecipitaionType(Double.valueOf(line[8]));
		}
		if (!StringUtils.isEmpty(line[9])) {
			measurement.setWindDirection(Double.valueOf(line[9]));
		}
		if (!StringUtils.isEmpty(line[10])) {
			measurement.setWindSpeed(Double.valueOf(line[10]));
		}
		if (!StringUtils.isEmpty(line[11])) {
			measurement.setMaxWindSpeed(Double.valueOf(line[11]));
		}
		if (!StringUtils.isEmpty(line[12])) {
			measurement.setBarometricPressure(Double.valueOf(line[12]));
		}
		if (!StringUtils.isEmpty(line[13])) {
			measurement.setSolarRadiation(Double.valueOf(line[13]));
		}
		if (!StringUtils.isEmpty(line[14])) {
			measurement.setHeading(Double.valueOf(line[14]));
		}
		if (!StringUtils.isEmpty(line[15])) {
			measurement.setBatteryLife(Double.valueOf(line[15]));
		}
		return measurement;
	}

}
