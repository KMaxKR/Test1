package Interface;

public interface Animal{
    String anim = "Elephant";
    void getAnimalKg();
    void getAnimalName();
    default void getAnimal(){
        System.out.println("Animal ...");
    }

    static void getTypes() {
        System.out.println("Erbivor");
    }
    default void getEatType(){
        getTypes();
    }
}
