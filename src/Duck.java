public class Duck extends Animal implements Speakable, Runable, Flyable, Swimable {
    public Duck(String nickname, int legs, String owner) {
        super(nickname, legs, owner);
    }

    @Override
    public int flySpeed() {
        return 10;
    }

    @Override
    public Integer runSpeed() {
        return 2;
    }

    @Override
    public String speak() {
        return "Krya";
    }

    @Override
    public String toString() {
        return "Duck" + super.toString();
    }

    @Override
    public int swimSpeed() {
        return 3;
    }
}
