package com.brainwaves.projects.swiftmessage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brainwaves.projects.swiftmessage.dao.SwiftMessageServiceDAO;
import com.brainwaves.projects.swiftmessage.model.Message;

@Service
public class SwiftMessageServiceImpl implements SwiftMessageService {

	@Autowired
	SwiftMessageServiceDAO swiftMessageServiceDAO;
	
	@Override
	public List<Message> getMessages() {
		return swiftMessageServiceDAO.getMessages();
	}

}
