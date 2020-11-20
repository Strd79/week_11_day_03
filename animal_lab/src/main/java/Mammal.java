public class Mammal extends Animal {

    public Mammal(String name) {
        super(name);
    }

    public String talk(String animal) {
        return String.format("I am a %s", animal);
    }
}
