package com.revature.screenforce.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.revature.screenforce.beans.Candidate;

@FeignClient(name = "candidate", url = "http://localhost:8183/screening/candidate")
public interface feignCandidate {
    @RequestMapping(method = RequestMethod.GET)
    List<Candidate> getCandidate();
}
