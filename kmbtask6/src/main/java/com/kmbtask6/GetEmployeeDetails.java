package com.kmbtask6;



public class GetEmployeeDetails {

	String Name;
	String Type;
    int Id;
    int Salary;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	public GetEmployeeDetails(String Name,String Type,int Id,int Salary) {
		
		this.Name = Name;
		this.Type=Type;
		this.Id = Id;
		this.Salary =Salary;
		
		
	
	}
	@Override
	public String toString() {
		return " Name=" + Name + ", Type=" + Type + ",Id="+ Id +", Salary =" + Salary ;

}
	
}
