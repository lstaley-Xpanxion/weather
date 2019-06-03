package com.weather.converter;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimestampFormatConverter {

	public TimestampFormatConverter() {
	}

	public static Timestamp convert(String formattedTimestamp) {
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm");
			Date parsedDate = dateFormat.parse(formattedTimestamp);
			return new java.sql.Timestamp(parsedDate.getTime());
		} catch (Exception e) { 
			e.printStackTrace();
			return null;
		}
	}

}
