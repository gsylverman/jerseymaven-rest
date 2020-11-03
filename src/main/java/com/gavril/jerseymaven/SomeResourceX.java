package com.gavril.jerseymaven;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("persons")
public class SomeResourceX {
	private MyRepo myRepo =  new MyRepo();
	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public ArrayList<Person> getAnimals () {

		return myRepo.getPersons();
	}

	@GET
	@Path("person/{id}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Person getPerson(@javax.ws.rs.PathParam("id") int id) {
		return myRepo.getPerson(id);
	}

	@POST
	@Path("person")
	@Consumes(MediaType.APPLICATION_JSON)
	public Person createPerson (Person person) {
		System.out.println(person.getName());
		myRepo.createPerson(person);
		return person;
	}
}
