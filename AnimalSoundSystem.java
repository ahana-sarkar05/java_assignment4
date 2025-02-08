package com.example;
	class Animal {
	    public void makeSound() {
	        System.out.println("Animal makes sound");
	    }
	}

	class Dog extends Animal {
	    @Override
	    public void makeSound() {
	        System.out.println("Animal makes sound: Woof!");
	    }
	}

	class Cat extends Animal {
	    @Override
	    public void makeSound() {
	        System.out.println("Animal makes sound: Meow!");
	    }
	}

	public class AnimalSoundSystem {
	    public static void main(String[] args) {
	        Animal[] animals = { new Dog(), new Cat() };
	        
	        for (Animal animal : animals) {
	            animal.makeSound();
	        }
	    }
	}
