public class Eagl extends Animal implements Speakable, Runable, Flyable {
    public Eagl(String nickname, int legs, String owner) {
        super(nickname, legs, owner);
    }

    @Override
    public int flySpeed() {
        return 25;
    }

    @Override
    public Integer runSpeed() {
        return 1;
    }

    @Override
    public String speak() {
        return "Ai-i-i";
    }

    @Override
    public String toString() {
        return "Eagl" + super.toString();
    }
}
