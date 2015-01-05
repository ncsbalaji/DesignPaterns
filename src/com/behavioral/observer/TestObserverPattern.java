package com.behavioral.observer;

import com.behavioral.observer.MyModel.Person;

public class TestObserverPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyModel model = new MyModel();
		MyObserver observer = new MyObserver(model);
		
		for(Person person: model.getPersons()){
			person.setFirstName(person.getFirstName()+"1");
		}
		
		for(Person person: model.getPersons()){
			person.setLastName(person.getLastName()+"3");
		}
		
	}

}
