package com.brainwaves.projects.swiftmessage.service;

import java.util.List;

import com.brainwaves.projects.swiftmessage.model.Message;

public interface SwiftMessageService {

	public abstract List<Message> getMessages();
}
