public class Dolphin extends Animal implements Speakable, Swimable {
    public Dolphin(String nickname, int legs, String owner) {
        super(nickname, legs, owner);
    }

    @Override
    public String speak() {
        return "O-o-o";
    }

    @Override
    public int swimSpeed() {
        return 40;
    }

    @Override
    public String toString() {
        return "Dolphin" + super.toString();
    }
}
