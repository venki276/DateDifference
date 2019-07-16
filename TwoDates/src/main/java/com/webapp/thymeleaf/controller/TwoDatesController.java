package com.webapp.thymeleaf.controller;

import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.webapp.thymeleaf.model.DateModel;

@Controller
public class TwoDatesController {
	@RequestMapping(value={"/", "/dates"}, method=RequestMethod.GET)
	public String getDatesPage(){
		return "dateDifference";
	}
	
	@RequestMapping(value={"/computeDifference"}, method=RequestMethod.POST)
	@ResponseBody
	public long computeDatesDifference(@Valid @RequestBody DateModel dates){
		LocalDate fromLocalDate = LocalDate.parse(dates.getFromDate());
		LocalDate toLocalDate = LocalDate.parse(dates.getToDate());
		return ChronoUnit.DAYS.between(fromLocalDate, toLocalDate);
	}
	
	
}
