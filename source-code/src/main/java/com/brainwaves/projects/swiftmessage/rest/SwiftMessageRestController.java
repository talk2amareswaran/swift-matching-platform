package com.brainwaves.projects.swiftmessage.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.brainwaves.projects.swiftmessage.service.SwiftMessageService;

@RestController
public class SwiftMessageRestController {

	@Autowired
	SwiftMessageService swiftMessageService;

	@RequestMapping(value = "/messages", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Object> getMessages() {
		return new ResponseEntity<>(swiftMessageService.getMessages(), HttpStatus.OK);
	}
}
