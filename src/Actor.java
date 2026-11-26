import java.util.Objects;

public class Actor extends Person {
    private final int height;

    public Actor(int height, String name, String surname, Gender gender) {
        super(name, surname, gender);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Actor)) {
            return false;
        }
        Actor actor = (Actor) other;
        return height == actor.height
                && Objects.equals(getName(), actor.getName())
                && Objects.equals(getSurname(), actor.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), height);
    }
}
