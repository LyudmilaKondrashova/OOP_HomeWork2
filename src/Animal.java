public abstract class Animal {
    private String nickname; // кличка животного
    private int legs; // количество лап
    private String owner; // владелец животного

    public String getNickname() {
        return nickname;
    }

    public int getLegs() {
        return legs;
    }

    public String getOwner() {
        return owner;
    }

    public Animal(String nickname, int legs, String owner) {
        this.nickname = nickname;
        this.legs = legs;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "{" +
                "nickname='" + nickname + '\'' +
                ", legs=" + legs +
                ", owner='" + owner + '\'' +
                '}';
    }
}
