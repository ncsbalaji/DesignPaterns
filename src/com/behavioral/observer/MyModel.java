package com.behavioral.observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public class MyModel {
	
	public static final String firstName = "FirstName";
	public static final String lastName = "LastName";
	
	private List<Person> persons = new ArrayList<Person>();
	private List<PropertyChangeListener> listener = new ArrayList<PropertyChangeListener>();

	public MyModel() {
		persons.add(new Person("firstName1", "lastName1"));
		persons.add(new Person("firstName2", "lastName2"));
	}

	public void notifyListenerss(Object object, String property, String oldValue, String newValue){
		
		for(PropertyChangeListener name: listener){
			name.propertyChange(new PropertyChangeEvent(this, property, oldValue, newValue));
		}
		
	}
	
	public void addChangeListener(PropertyChangeListener newListener){
		listener.add(newListener);
	}
	
	
	public class Person {

		private String firstName;
		private String lastName;
		
		public Person(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}
		
		
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			notifyListenerss(this, MyModel.firstName, this.firstName, this.firstName = firstName);
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			notifyListenerss(this, MyModel.lastName, this.lastName, this.lastName = lastName);
		}
		
		
	}
	
	public List<Person> getPersons() {
		return persons;
	}
	

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}

}

