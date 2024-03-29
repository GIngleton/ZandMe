package com.revature.screenforce.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.screenforce.services.ReportsService;
import com.revature.screenforce.beans.Bucket;
import com.revature.screenforce.client.ScreenforceFeignClient;

@RestController
@CrossOrigin
public class ReportsController {
	private ScreenforceFeignClient fc;
	private ReportsService reportsService;

	@Autowired
	public void getFeignClient(ScreenforceFeignClient fc) {
		this.fc = fc;
	}

	@Autowired
	public ReportsController(ReportsService reportsService) {
		this.reportsService = reportsService;
	}
//
//	@Autowired ReportsService reportsService;
//	@GetMapping(value="/report", produces= MediaType.APPLICATION_JSON_VALUE)
//	public @ResponseBody List<Bucket> getAllBucket(){
//		return this.reportsService.testGetAllBuckets();
//	}

//	@GetMapping(value="/email", produces= MediaType.APPLICATION_JSON_VALUE)
//	public @ResponseBody List<String> getAllEmails(@RequestParam(value = "email") String email){
//		List<String> emails = this.reportsService.getAllEmails(email);
//		return emails;
//	}
//
//	@GetMapping(value = "/data", produces = MediaType.APPLICATION_JSON_VALUE)
//	public String getReports(
//			@RequestParam(name="weeks")
//			String weeks,
//			@RequestParam(name="email", required=false)
//			String email) {
//		return reportsService.getReport(email, weeks);
//	}
}
