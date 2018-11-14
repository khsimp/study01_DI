package com.study.example.study05;

import com.study.example.vo.TestVo;


public class Sample05 {
	private String id;
	private int num;
	private TestVo vo;
	
	public Sample05() {
	}
	
	public Sample05(String id) {
		this.id = id;
	}
	public Sample05(String id, int num) {
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
