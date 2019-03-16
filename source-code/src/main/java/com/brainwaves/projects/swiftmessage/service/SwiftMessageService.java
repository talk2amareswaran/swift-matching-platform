package com.brainwaves.projects.swiftmessage.service;

import java.util.List;

import com.brainwaves.projects.swiftmessage.model.Message;

public interface SwiftMessageService {

	public abstract List<Message> getMessages( String tradeFromDate, String tradeToDate, String settlementFromDate, String settlementToDate, String valueFromDate, String valueToDate, String currency, String status);

	public abstract List<Message> getCloseFit( String tradeFromDate, String tradeToDate, String settlementFromDate, String settlementToDate,  String valueFromDate, String valueToDate, String currency, String status);

	public abstract List<Message> getProposedQueue(String tradeFromDate, String tradeToDate, String settlementFromDate, String settlementToDate, String valueFromDate, String valueToDate, String currency, String status);
}
