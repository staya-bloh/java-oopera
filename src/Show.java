import java.util.ArrayList;

public class Show {
    private final String title;
    private final int duration;
    private final Director director;
    private final ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        listOfActors = new ArrayList<>();
    }

    public void printDirector() {
        System.out.println(director.getName() + " " + director.getSurname());
    }

    public void printActors() {
        for (Actor actor : listOfActors) {
            System.out.println(actor.getName() + " " + actor.getSurname() + " (" + actor.getHeight() + ")");
        }
    }

    public void addActor(Actor newActor) {
        if (listOfActors.contains(newActor)) {
            System.out.println("Такой актер уже присутствует!");
            return;
        }
        listOfActors.add(newActor);
    }

    public void replaceActor(Actor newActor, String surname) {
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(surname)) {
                listOfActors.set(i, newActor);
                return;
            }
        }
        System.out.println("Такой актер не найден!");
    }
}
