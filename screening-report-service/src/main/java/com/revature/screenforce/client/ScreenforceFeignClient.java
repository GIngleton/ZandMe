package com.revature.screenforce.client;
import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.revature.screenforce.models.FullReportModel;


@FeignClient(name = "report", url = "http://localhost:8185/report/test")
public interface ScreenforceFeignClient {
    @RequestMapping(method = RequestMethod.GET)
    ResponseEntity<List<FullReportModel>> getAllBucket();
}
