package com.yedam.classes.abstracts;

public class AnimalExe {
	public static void main(String[] args) {
		
		Animal animal = null; // new Animal(); 추상클래스는 인스턴스를 못받는다
		animal = new Bird("제비");
		animal.eat();
		animal.sleep();
		
		Bird bird = new Bird("참새");
		bird.eat();
		bird.sleep();
		
		Dog dog = new Dog();
		
		Bird[] birds = new Bird[5]; // 각자 방은 들어가지못하지만 단체방으로는 들어갈수있다
//		birds[0] = dog;
		
		Animal[] animals = new Animal[10];
		animals[0] = bird;
		animals[1] = dog;
		
	}
}
