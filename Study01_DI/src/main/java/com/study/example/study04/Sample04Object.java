package com.study.example.study04;

import com.study.example.vo.TestVo;


public class Sample04Object {
	private String id;
	private int num;
	private TestVo vo;
	
	public Sample04Object() {
	}
	
	public Sample04Object(String id, int num, TestVo vo) {
		this.id = id;
		this.num = num;
		this.vo = vo;
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

	public TestVo getVo() {
		return vo;
	}

	public void setVo(TestVo vo) {
		this.vo = vo;
	}

	@Override
	public String toString() {
		return "Sample04 [id=" + id + ", num=" + num + ", vo=" + vo.getMsg() + "]";
	}

	
}
