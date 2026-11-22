public class Theatre {

    public static void main(String[] args) {
        System.out.println("Поехали!");

        Actor a1 = new Actor(180, "Brad", "Pitt", Gender.MALE);
        Actor a2 = new Actor(183, "Leonardo", "DiCaprio", Gender.MALE);
        Actor a3 = new Actor(180, "George", "Clooney", Gender.MALE);

        Director d1 = new Director("Quentin", "Tarantino", Gender.MALE, 9);
        Director d2 = new Director("Christopher", "Nolan", Gender.MALE, 13);

        Person comp = new Person("Ludovico", "Einaudi", Gender.MALE);
        Person chor = new Person("Jiri", "Kylian", Gender.MALE);

        Show show = new Show("Гамлет", 120, d1);
        Opera opera = new Opera("Кармен", 150, d2, comp,
                "История Кармен и Хозе.", 30);
        Ballet ballet = new Ballet("Жизель", 110, d1, comp,
                "История Жизели и Альберта.", chor);

        show.addActor(a1);
        show.addActor(a2);
        opera.addActor(a2);
        opera.addActor(a3);
        ballet.addActor(a1);
        ballet.addActor(a3);

        System.out.println("Актёры спектакля «Гамлет»");
        show.printActors();
        System.out.println("Актёры оперы «Кармен»");
        opera.printActors();
        System.out.println("Актёры балета «Жизель»");
        ballet.printActors();

        show.replaceActor(a3, a1.getSurname());
        System.out.println("Актёры спектакля «Гамлет» после замены");
        show.printActors();

        System.out.println("Попытка заменить отсутствующего актёра в опере «Кармен»");
        opera.replaceActor(a1, a1.getSurname());

        System.out.println("Либретто оперы «Кармен»");
        opera.printLibretto();
        System.out.println("Либретто балета «Жизель»");
        ballet.printLibretto();
    }
}
