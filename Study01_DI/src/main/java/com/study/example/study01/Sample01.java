package com.study.example.study01;

public class Sample01 {
	private String id;
	private int num;
	
	public Sample01() {
		System.out.println("===========> 생성자 시작");
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
