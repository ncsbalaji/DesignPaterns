package com.behavioral.mediator;

public class TestMediatorPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChatMediator mediator = new ChatMediatorImpl();
		
		User user1 = new UserImpl(mediator, "User1");
		User user2 = new UserImpl(mediator, "User2");
		User user3 = new UserImpl(mediator, "User3");
		User user4 = new UserImpl(mediator, "User4");
		User user5 = new UserImpl(mediator, "User5");
		
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);
		mediator.addUser(user5);
		
		user1.send("Hi All");
		//mediator.sendMessage("Hi ALL" , user1);

	}

}
