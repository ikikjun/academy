package com.kh.practice2.model.vo;

public abstract class Animal {
	
	private String name;
	private String kinds;
	
	protected Animal() {
		
	}
	
	
	
protected Animal(String name, String kinds) {
		super();
		this.name = name;
		this.kinds = kinds;
	}

	
	public String toString() {
		String a = ("저의 이름은" + name + "이고,"
						+ "종류는 " + kinds + "입니다.");
		
		return a;
	}
	
	public abstract void speak();
	

}
