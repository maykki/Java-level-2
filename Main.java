
public class Main {


    public static void main(String[] args) {


        Course course = new Course(new Cross(10), new Wall(5), new Water(20));
        Team team = new Team("Первая команда", new Human("Вова"), new Cat("Лупа"), new Dog("Пупа"), new Human("Алеша"));


        course.doIt(team);
        team.showResults();

    }
}
