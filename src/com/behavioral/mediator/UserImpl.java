package com.behavioral.mediator;

public class UserImpl extends User{

	public UserImpl(ChatMediator chatMediator, String name) {
		super(chatMediator, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void send(String message) {
		// TODO Auto-generated method stub
		System.out.println(this.name+": Sending Message: "+message);
		chatMediator.sendMessage(message, this);
		
	}
  
	@Override
	public void receive(String message) {
		// TODO Auto-generated method stub
		System.out.println(this.name+": Received Message: "+message);
		
	}

}
