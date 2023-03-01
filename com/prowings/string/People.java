package com.prowings.string;

public class People {

	long adhaarNo;
	String name;
	
	public People() {
		super();
	}

	public People(long adhaarNo, String name) {
		super();
		this.adhaarNo = adhaarNo;
		this.name = name;
	}

	@Override
	public String toString() {
		return "People [adhaarNo=" + adhaarNo + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		
		int  res =1 ;
		res =  (int) (this.adhaarNo*31 + name.hashCode()*31);
		return res;
		
	}

	@Override
	public boolean equals(Object obj) {
		People obj1 = (People)obj;
		
		boolean res = false;
		
		if (this.adhaarNo == obj1.adhaarNo)
		{
			if(this.name.equals(name))
				res = true;
		}
		else
		{
			res = false;
		}
		
		return res;
		
	}
	
	
	
	
	

}
