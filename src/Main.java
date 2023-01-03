public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        zoo.addAnimal(new Cat("Dimka", 4, "Oleg"))
                .addAnimal(new Dog("Tuzik", 4, "Petya"))
                .addAnimal(new Duck("Donald", 2, "Roma"))
                .addAnimal(new Eagl("Trut", 2, "Jack"))
                .addAnimal(new Dolphin("Leon", 0, "Anna"));
        System.out.println(zoo.toString());
        System.out.println(zoo.talk());
        System.out.println("Run speed:");
        for (Runable i: zoo.getRunable()) {
            System.out.println(i.runSpeed());
        }
        System.out.println("Max run speed: " + zoo.getChampionSpeed());
        System.out.println();
        System.out.println("Fly speed:");
        for (Flyable i: zoo.getFlyable()) {
            System.out.println(i.flySpeed());
        }
        System.out.println("Max fly speed: " + zoo.getChampionFlySpeed());
        System.out.println();
        System.out.println("Swim speed:");
        for (Swimable i: zoo.getSwimable()) {
            System.out.println(i.swimSpeed());
        }
        System.out.println("Max swim speed: " + zoo.getChampionSwimSpeed());

        SaveManagerAnimals saveManagerAnimals = new SaveManagerAnimals();
        saveManagerAnimals.save(zoo.getAnimals());
    }
}