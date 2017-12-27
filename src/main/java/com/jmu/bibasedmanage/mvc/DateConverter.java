package com.jmu.bibasedmanage.mvc;

import org.springframework.core.convert.converter.Converter;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by ljc on 2017/12/24.
 */
public class DateConverter implements Converter<String, Date> {
    private String[] datePatterns = { "yyyyMMddHHmmss", "yyyyMMdd", "yyyy/MM/dd HH:mm:ss", "yyyy/MM/dd",
            "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd" };


    public Date convert(String source) {
        for (String pattern : datePatterns) {
            SimpleDateFormat sdf = new SimpleDateFormat(pattern);
            sdf.setLenient(true);
            try {
                return sdf.parse(source);
            } catch (Exception e) {
            }
        }
        try {
            return new Date(Long.parseLong(source));
        } catch (NumberFormatException e) {
        }

        return null;
    }
}
