package com.study.example.study03;

import java.util.List;

public class Sample03List {
	private String id;
	private int num;
	private List<String> lists;
	
	
	
	public Sample03List() {
	}
	
	public Sample03List(String id, int num, List<String> lists) {
		this.id = id;
		this.num = num;
		this.lists = lists;
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

	public List<String> getLists() {
		return lists;
	}

	public void setLists(List<String> lists) {
		this.lists = lists;
	}

	@Override
	public String toString() {
		return "Sample03 [id=" + id + ", num=" + num + ", lists=" + lists + "]";
	}

	
	
}
