package com.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {
	
	public List<User> users;
	
	public ChatMediatorImpl() {
		this.users = new ArrayList<User>();
	}

	@Override
	public void sendMessage(String message, User user) {
		// TODO Auto-generated method stub
		for(User tempUser: this.users){
			if(tempUser!=user){
				tempUser.receive(message);
			}
		}
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		this.users.add(user);
	}

}
