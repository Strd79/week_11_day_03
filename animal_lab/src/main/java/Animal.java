public class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String eat(String food) {
        return String.format("I eat %s", food);
    }

    public String breathe() {
        return "I can breathe";
    }
}
