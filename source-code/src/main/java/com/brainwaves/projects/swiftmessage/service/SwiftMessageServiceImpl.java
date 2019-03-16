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
	public List<Message> getMessages(String tradeFromDate, String tradeToDate, String settlementFromDate, String settlementToDate, String valueFromDate, String valueToDate, String currency, String status) {
		return swiftMessageServiceDAO.getMessages( tradeFromDate,  tradeToDate,  settlementFromDate,  settlementToDate,  valueFromDate,  valueToDate,  currency,  status);
	}

	@Override
	public List<Message> getCloseFit(String tradeFromDate, String tradeToDate, String settlementFromDate, String settlementToDate, String valueFromDate, String valueToDate, String currency, String status) {
		return swiftMessageServiceDAO.getCloseFit( tradeFromDate,  tradeToDate,  settlementFromDate,  settlementToDate,  valueFromDate,  valueToDate,  currency,  status);
	}

	@Override
	public List<Message> getProposedQueue(String tradeFromDate, String tradeToDate, String settlementFromDate, String settlementToDate, String valueFromDate, String valueToDate, String currency, String status) {
		return swiftMessageServiceDAO.getProposedQueue( tradeFromDate,  tradeToDate,  settlementFromDate,  settlementToDate,  valueFromDate,  valueToDate,  currency,  status);
	}

	@Override
	public List<Message> getClientAndSGData(String id) {
		return swiftMessageServiceDAO.getClientAndSGData(id);
	}

	@Override
	public void matchUpdate(String id) {
		swiftMessageServiceDAO.matchUpdate(id);
		
	}

}
