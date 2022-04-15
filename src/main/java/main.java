import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Dog fluffy = new Dog("Fluffy", "pomeranian");
        fluffy.printPetInfo();
        //Fluffy is a dog of breed pomeranian

        ArrayList<Pet> petList = new ArrayList<Pet>();
        var pet1 = new Pet("Floppy", "rabbit");
        var pet2 = new Dog("Arty", "pug");
        petList.add(pet1);
        petList.add(pet2);
        System.out.println(petList);

        System.out.println(
        );
        PetOwner owner1 = new PetOwner(pet1, "Jerry");
        owner1.printOwnerInfo();
        System.out.println();
        PetOwner owner2 = new PetOwner(pet2, "Kris");
        owner2.printOwnerInfo();


        Bus bus1 = new Bus(3);
        System.out.println(bus1.getCurrentStop());
        bus1.move();
        System.out.println(bus1.getCurrentStop());
        bus1.move();
        System.out.println(bus1.getCurrentStop());
        bus1.move();
        System.out.println(bus1.getCurrentStop());
        bus1.move();
        bus1.move();
        System.out.println(bus1.getCurrentStop());
        System.out.println(bus1.getCurrentStop());
        Bus bus2 = new Bus(5);
        System.out.println(bus1.getCurrentStop());
        System.out.println(bus1.getCurrentStop());
        System.out.println();
        var bus3 = new Bus(3);
        System.out.println(bus3.getCurrentStop());
        bus3.move();
        System.out.println(bus3.getCurrentStop());
        bus3.move();
        System.out.println(bus3.getCurrentStop());
        bus3.move();
        System.out.println(bus3.getCurrentStop());
        bus3.move();
        System.out.println(bus3.getCurrentStop());
        bus3.move();
        System.out.println(bus3.getCurrentStop());
        bus3.move();
        System.out.println(bus3.getCurrentStop());
        bus3.move();
        System.out.println(bus3.getCurrentStop());
        bus3.move();
        System.out.println(bus3.getCurrentStop());
        bus3.move();
    }
}
