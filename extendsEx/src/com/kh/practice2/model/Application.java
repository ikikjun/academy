package com.kh.practice2.model;

import com.kh.practice2.model.vo.Animal;
import com.kh.practice2.model.vo.Cat;
import com.kh.practice2.model.vo.Dog;

public class Application {
	
	public static void main(String[] args) {
		
		Animal[] animal = new Animal[5];
		
		for(int i=0;i<animal.length;i++) {
			double random = Math.random() * 5 + 1 ; 
			if(random < 5) {
				animal[i] = new Dog("복순이", "포메라니안", (int)(Math.random()*50));
			} else {
				animal[i] = new Cat("아프리카", "애쉬그레이");
			}
		}
		
		for(int i=0;i<animal.length;i++) {
			
			dog.speak();
			cat.speak();
		}
		
		while(true) {
			
		}
		
		
		
		
		
	}

}
