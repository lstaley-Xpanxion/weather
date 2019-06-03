package com.weather.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.weather.model.Measurement;

@Mapper
public interface MeasurementMapper {
	
	public void insertMeasurement(Measurement measurement);
	
}
