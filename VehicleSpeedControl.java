package com.example;
	class Vehicle {
	    protected int speed;

	    public Vehicle() {
	        this.speed = 0;
	    }

	    public void increaseSpeed() {
	        speed += 0;
	    }

	    public int getSpeed() {
	        return speed;
	    }
	}

	class Car extends Vehicle {
	    @Override
	    public void increaseSpeed() {
	        speed += 10;
	    }
	}

	class Bike extends Vehicle {
	    @Override
	    public void increaseSpeed() {
	        speed += 5;
	    }
	}

	public class VehicleSpeedControl {
	    public static void main(String[] args) {
	        Vehicle[] vehicles = { new Car(), new Bike() };

	        for (Vehicle v : vehicles) {
	            v.increaseSpeed();
	            v.increaseSpeed(); // Increase speed multiple times
	            System.out.println(v.getClass().getSimpleName() + " speed: " + v.getSpeed());
	        }
	    }
	}

