package com.example.bubble;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Dog{
	String name;
}

public class LombokTest {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.setName("poppy");
		System.out.println(d.getName());
	}

}
