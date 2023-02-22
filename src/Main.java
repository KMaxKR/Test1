import Interface.Animal;
import Interface.Elephant;

public class Main extends Elephant {
    public static void main(String[] args) {
        Elephant animal = new Elephant();
        animal.getAnimal();
        animal.getAnimalName();
        animal.getAnimalKg();
        animal.getEatType();
        animal.Eat();
        animal.getEatGrass();
    }
}