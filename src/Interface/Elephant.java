package Interface;

public class Elephant extends Erbivor implements Animal{


    @Override
    public void getAnimalKg() {
        System.out.println(anim + " weight 1200kg");
    }

    @Override
    public void getAnimalName() {
        System.out.println("Animal type " + anim);
    }

    @Override
    public void Eat() {
        System.out.println(anim + " eat grass");
    }

}
