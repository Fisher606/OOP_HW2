import Interfaces.Flyable;
import Interfaces.Runable;
import Interfaces.Swimable;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Cat("Boris", 4, "Vadim"))
                .addAnimal(new Dog("Bobik", 4, "Ahmed"))
                .addAnimal(new Duck("Gus", 2, "Hidding"))
                .addAnimal(new Eagle("Petuh", 2, "Tamara"))
                .addAnimal(new Fish("Ponio", 0, "Utes"));
        System.out.println(zoo + "\n");
        System.out.println(zoo.talk() + "\n");

        System.out.println("Flyable animals speed: ");
        for (Flyable animal:zoo.getFlyable()) {
            System.out.println(animal.flySpeed());
        }

        System.out.println("Runable animals speed: ");
        for (Runable animal:zoo.getRunable()) {
            System.out.println(animal.runSpeed());
        }
        System.out.println("Champion speed: " + zoo.getChampionSpeed());

        System.out.println("Swimable animals speed: ");
        for (Swimable animal:zoo.getSwimable()) {
            System.out.println(animal.swimSpeed());
        }

        SaveManager saveManager = new SaveManager();
        saveManager.save(zoo.getAnimals());
    }
}