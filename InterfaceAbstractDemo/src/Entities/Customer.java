package Entities;


import Abstract.Entity;

public  class Customer implements Entity {

	int id;
	String firsName;
	String lastName;
	String birthDate;
	String nationalityId;
	
	public Customer( String firstName, String lastName,String birthDate,String nationalityId) {
		
		this.firsName=firstName;
		this.lastName=lastName;
		this.birthDate=birthDate;
		this.nationalityId=nationalityId;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirsName() {
		return firsName;
	}
	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}





	
}
