package com.gavril.jerseymaven;

import java.util.ArrayList;

public class MyRepo {
	private ArrayList<Person> persons;

	public MyRepo() {
		this.persons = new ArrayList<Person>();
		Person person1 = new Person();
		person1.setName("George");
		person1.setAge(36);
		person1.setId(101);
		Person person2 = new Person();
		person2.setName("Andrei");
		person2.setAge(25);
		person2.setId(105);
		persons.add(person1);
		persons.add(person2);
	}
	public ArrayList<Person> getPersons () {
		return persons;
	}

	public Person getPerson(int id) {
		for (Person person : persons) {
			if (person.getId() == id) {
				return person;
			}
		}
		return null;
	}
	public void createPerson(Person person) {

		persons.add(person);

	}
}
