package com.prowings.string;

public class EmployeeMethod {
	
	int id ;
	String name;
	long salary;

	public EmployeeMethod() {
		super();
	}

	public EmployeeMethod(int id, String name, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public String toString() {
		return "EmployeeMethod [id =" + id + ", name =" + name + ", salary ="+ salary +"]"; 
	}

	@Override
	public int hashCode() {
		
		int res = 1;
		res =(int) (id*31 + name.hashCode()*31 + salary*31);
		return res;
	}

	@Override
	public boolean equals(Object obj) {
		
		EmployeeMethod obj1 = (EmployeeMethod) obj;
		
		boolean res = false;
		
		if(this.id == obj1.id)
		{
			if(this.name.equals(obj1.name))
			{
				if(this.salary == obj1.salary)
					
					res = true;
			}
		}
		else
		{
			res = false;
		}
		
		return res;
	}
}

		
