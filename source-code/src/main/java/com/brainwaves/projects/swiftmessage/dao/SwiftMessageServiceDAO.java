package com.brainwaves.projects.swiftmessage.dao;

import java.util.List;

import com.brainwaves.projects.swiftmessage.model.Message;

public interface SwiftMessageServiceDAO {

	public abstract  List<Message> getMessages();

}
