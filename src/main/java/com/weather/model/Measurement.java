package com.weather.model;

import java.io.Serializable;
import java.sql.Timestamp;

public class Measurement implements Serializable {

	private static final long serialVersionUID = 3871780932807472878L;

	private Long measurementId;

	private String stationName;

	private Timestamp measurementTimestamp;

	private Double airTemp;

	private Double wetBulbTemp;

	private Double humidity;

	private Double intervalRain;

	private Double rainIntensity;

	private Double totalRain;

	private Double precipitaionType;

	private Double windDirection;

	private Double windSpeed;

	private Double maxWindSpeed;

	private Double barometricPressure;

	private Double solarRadiation;

	private Double heading;

	private Double batteryLife;

	public Long getMeasurementId() {
		return measurementId;
	}

	public void setMeasurementId(Long measurementId) {
		this.measurementId = measurementId;
	}

	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public Timestamp getMeasurementTimestamp() {
		return measurementTimestamp;
	}

	public void setMeasurementTimestamp(Timestamp measurementTimestamp) {
		this.measurementTimestamp = measurementTimestamp;
	}

	public Double getAirTemp() {
		return airTemp;
	}

	public void setAirTemp(Double airTemp) {
		this.airTemp = airTemp;
	}

	public Double getWetBulbTemp() {
		return wetBulbTemp;
	}

	public void setWetBulbTemp(Double wetBulbTemp) {
		this.wetBulbTemp = wetBulbTemp;
	}

	public Double getHumidity() {
		return humidity;
	}

	public void setHumidity(Double humidity) {
		this.humidity = humidity;
	}

	public Double getIntervalRain() {
		return intervalRain;
	}

	public void setIntervalRain(Double intervalRain) {
		this.intervalRain = intervalRain;
	}

	public Double getRainIntensity() {
		return rainIntensity;
	}

	public void setRainIntensity(Double rainIntensity) {
		this.rainIntensity = rainIntensity;
	}

	public Double getTotalRain() {
		return totalRain;
	}

	public void setTotalRain(Double totalRain) {
		this.totalRain = totalRain;
	}

	public Double getPrecipitaionType() {
		return precipitaionType;
	}

	public void setPrecipitaionType(Double precipitaionType) {
		this.precipitaionType = precipitaionType;
	}

	public Double getWindDirection() {
		return windDirection;
	}

	public void setWindDirection(Double windDirection) {
		this.windDirection = windDirection;
	}

	public Double getWindSpeed() {
		return windSpeed;
	}

	public void setWindSpeed(Double windSpeed) {
		this.windSpeed = windSpeed;
	}

	public Double getMaxWindSpeed() {
		return maxWindSpeed;
	}

	public void setMaxWindSpeed(Double maxWindSpeed) {
		this.maxWindSpeed = maxWindSpeed;
	}

	public Double getBarometricPressure() {
		return barometricPressure;
	}

	public void setBarometricPressure(Double barometricPressure) {
		this.barometricPressure = barometricPressure;
	}

	public Double getSolarRadiation() {
		return solarRadiation;
	}

	public void setSolarRadiation(Double solarRadiation) {
		this.solarRadiation = solarRadiation;
	}

	public Double getHeading() {
		return heading;
	}

	public void setHeading(Double heading) {
		this.heading = heading;
	}

	public Double getBatteryLife() {
		return batteryLife;
	}

	public void setBatteryLife(Double batteryLife) {
		this.batteryLife = batteryLife;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((measurementId == null) ? 0 : measurementId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Measurement other = (Measurement) obj;
		if (measurementId == null) {
			if (other.measurementId != null)
				return false;
		} else if (!measurementId.equals(other.measurementId))
			return false;
		return true;
	}

}
