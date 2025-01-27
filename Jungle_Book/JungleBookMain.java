package Jungle_Book;

public class JungleBookMain {
	public static void main(String[] args) {
		
		Snake kaa = new Snake();
		kaa.name = "kaa";
		kaa.eat();
		kaa.drink();
		
		Monkey monk = new Monkey();
		monk.name = "monk";
		monk.drink();
		monk.run();
		monk.sleep();
		
		Dog tommy = new Dog();
		tommy.name = "tommy";
		tommy.eat();
		tommy.run();
		tommy.drink();
	}

}


/*
 ==> From This above Inheritance code we have to understand following things!
 1) * We use inheritance for common off the common methods and variables from each class to reuse them and not to define every time
 2) * We didn't write run as a common method because the snake and crocodile cannot run they have their own properties 
 3) * hence while making common methods we have to understand the properties of the objects
 */
 