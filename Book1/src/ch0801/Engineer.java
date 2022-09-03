package ch0801;

class Employee{
	public String name;
	public String grade;
	public Employee(String name) {
		this.name = name;
	}
}


public class Engineer extends Employee{
	
	private String skillset;
	
	public Engineer(String name) {
		super(name);
	}
	
	public String getSkillSet() {
		return skillset;
	}
	
	public void setSkillSet(String skillset) {
		this.skillset = skillset;
	}
	
	
}
