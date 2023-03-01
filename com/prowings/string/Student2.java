package com.prowings.string;

public class Student2 {
	int rollNo;
	long mobNo;

	public Student2() {
		super();
	}

	public Student2(int rollNo, int mobNo) {

		super();
		this.rollNo = rollNo;
		this.mobNo = mobNo;

	}

	public String toString() {
		return "Student2[rollNo= " + rollNo + ",mobNo=" + mobNo + "]";
	}

	@Override
	public int hashCode() {
		int res = 1;

		res = (int) (rollNo * 31 + mobNo * 31);

		return res;
	}

	@Override
	public boolean equals(Object obj) {

		Student2 obj1 = (Student2) obj;
		boolean res = false;
		if (this.rollNo == obj1.rollNo) {
			if (this.mobNo == obj1.mobNo) {
				res = true;
			} else {
				return false;
			}

		}
		return res;
	}
}
