package com.brainwaves.projects.swiftmessage.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.brainwaves.projects.swiftmessage.service.SwiftMessageService;

@RestController
public class SwiftMessageRestController {

	@Autowired
	SwiftMessageService swiftMessageService;
			
	@RequestMapping(value = "/messages", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Object> getMessages(@RequestParam(value="datatype", required=false, defaultValue="all") String datatype,
			@RequestParam(value="tradeFromDate", required=false) String tradeFromDate,
			@RequestParam(value="tradeToDate", required=false) String tradeToDate,
			@RequestParam(value="settlementFromDate", required=false) String settlementFromDate,
			@RequestParam(value="settlementToDate", required=false) String settlementToDate,
			@RequestParam(value="valueFromDate", required=false) String valueFromDate,
			@RequestParam(value="valueToDate", required=false) String valueToDate,
			@RequestParam(value="currency", required=false) String currency,
			@RequestParam(value="status", required=false) String status) {
		
		
			if("closefit".equalsIgnoreCase(datatype))
					return getCloseFit(datatype, tradeFromDate, tradeToDate,settlementFromDate, settlementToDate,  valueFromDate, valueToDate,currency, status );
		
			if("unmatched".equalsIgnoreCase(datatype)) 
				return getProposedQueue(datatype, tradeFromDate, tradeToDate,settlementFromDate, settlementToDate,  valueFromDate, valueToDate,currency, status);
			
		return new ResponseEntity<>(swiftMessageService.getMessages(tradeFromDate, tradeToDate,settlementFromDate, settlementToDate,  valueFromDate, valueToDate,currency, status), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/closefit", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Object> getCloseFit(@RequestParam(value="datatype", required=false, defaultValue="all") String datatype,
			@RequestParam(value="tradeFromDate", required=false) String tradeFromDate,
			@RequestParam(value="tradeToDate", required=false) String tradeToDate,
			@RequestParam(value="settlementFromDate", required=false) String settlementFromDate,
			@RequestParam(value="settlementToDate", required=false) String settlementToDate,
			@RequestParam(value="valueFromDate", required=false) String valueFromDate,
			@RequestParam(value="valueToDate", required=false) String valueToDate,
			@RequestParam(value="currency", required=false) String currency,
			@RequestParam(value="status", required=false) String status) {
		return new ResponseEntity<>(swiftMessageService.getCloseFit( tradeFromDate, tradeToDate,settlementFromDate, settlementToDate,  valueFromDate, valueToDate,currency, status), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/proposequeue", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Object> getProposedQueue(@RequestParam(value="datatype", required=false, defaultValue="all") String datatype,
			@RequestParam(value="tradeFromDate", required=false) String tradeFromDate,
			@RequestParam(value="tradeToDate", required=false) String tradeToDate,
			@RequestParam(value="settlementFromDate", required=false) String settlementFromDate,
			@RequestParam(value="settlementToDate", required=false) String settlementToDate,
			@RequestParam(value="valueFromDate", required=false) String valueFromDate,
			@RequestParam(value="valueToDate", required=false) String valueToDate,
			@RequestParam(value="currency", required=false) String currency,
			@RequestParam(value="status", required=false) String status) {
		return new ResponseEntity<>(swiftMessageService.getProposedQueue( tradeFromDate, tradeToDate,settlementFromDate, settlementToDate,  valueFromDate, valueToDate,currency, status), HttpStatus.OK);
	}
	
	
}
