package com.inheritance;

class Animal {
    String name;
    String habitat;
    
    public void displayHabitat() {
        System.out.println("Habitat: " + habitat);
    }
}

class Mammal extends Animal {
    boolean isWarmBlooded;
    
    public Mammal(String name, String habitat, boolean isWarmBlooded) {
    	this.name=name;
    	this.habitat=habitat;
        this.isWarmBlooded = isWarmBlooded;
    }
    
    public void displayMammalInfo() {
        System.out.println("Is Warm Blooded: " + isWarmBlooded);
    }
}

class Bird extends Animal {
    boolean canFly;
    
    public Bird(String name, String habitat, boolean canFly) {
    	this.name=name;
    	this.habitat=habitat;
        this.canFly = canFly;
    }
    
    public void displayBirdInfo() {
        System.out.println("Can Fly: " + canFly);
    }
}

class Reptile extends Animal {
    boolean isColdBlooded;
    
    public Reptile(String name, String habitat, boolean isColdBlooded) {
    	this.name=name;
    	this.habitat=habitat;
        this.isColdBlooded = isColdBlooded;
    }
    
    public void displayReptileInfo() {
        System.out.println("Is Cold Blooded: " + isColdBlooded);
    }
}

public class AnimalMain {
	public static void main(String[] args) {
		Animal mammal = new Mammal("Lion", "Savannah", true);
		mammal.displayHabitat(); 
		((Mammal) mammal).displayMammalInfo();
		System.out.println();
		Animal bird = new Bird("Eagle", "Forest", true);
		bird.displayHabitat(); 
		((Bird) bird).displayBirdInfo(); 
		System.out.println();
		Animal reptile = new Reptile("Snake", "Desert", true);
		reptile.displayHabitat(); 
		((Reptile) reptile).displayReptileInfo();
	}
}
