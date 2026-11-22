public class Actor extends Person{
    private final int height;

    public Actor(int height, String name, String surname, Gender gender) {
        super(name, surname, gender);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
}
