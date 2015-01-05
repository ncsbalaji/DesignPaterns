package com.behavioral.memento;

public class TestMementoPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Originator originator = new Originator();
		CareTaker careTaker = new CareTaker();
		
		originator.setState("State #1");
		
		originator.setState("State #2");
		careTaker.add(originator.saveStateToMemento());
		
		originator.setState("State #4");
		careTaker.add(originator.saveStateToMemento());
		
		originator.setState("State #5");
		
		System.out.println("current state: "+originator.getState());
		
		originator.getStateFromMemento(careTaker.get(0));
		System.out.println("initial state: "+ originator.getState());

		originator.getStateFromMemento(careTaker.get(1));
		System.out.println("final state: "+ originator.getState());
	}

}
