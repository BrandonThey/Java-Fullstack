package S09.classes.InheritanceExercise;

import java.util.ArrayList;
import java.util.List;

import animal.Animal;
import animal.bird.Bird;
import animal.bird.Eagle;
import animal.fish.Eel;
import animal.fish.Fish;
import animal.reptile.Crocodile;
import animal.reptile.Reptile;

public class main {
	
	public static void main(String[] args) {
		//making a list to store animals
		List<Animal> animals = new ArrayList<>();
		
		//adding animals
		animals.add(new Animal());
		animals.add(new Reptile());
		animals.add(new Crocodile());
		animals.add(new Fish());
		animals.add(new Eel());
		animals.add(new Bird());
		animals.add(new Eagle());
		
		listAnimals(animals);
	}

	public static void listAnimals(List<Animal> animals) {
		//using an enhanced for loop to show all animals
		for(Animal animal: animals) {
			System.out.println(animal.showInfo());
		}
	}
}
