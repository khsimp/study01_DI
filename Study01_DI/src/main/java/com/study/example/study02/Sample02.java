package com.study.example.study02;

public class Sample02 {
	private String id;
	private int num;
	
	
	public Sample02() {
	}
	
	public Sample02(String id, int num) {
		this.id = id;
		this.num = num;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "Sample [id=" + id + ", num=" + num + "]";
	}
	
	
	
}
