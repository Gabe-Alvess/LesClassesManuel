package be.intecbrussel;

public class PersonApp {
    public static void main(String[] args) {
        Person person = new Person("Jos");
        person.presentYourself();


        person.setName("   ");
        person.setAge(20);

        Person importantPersson = new Person("Alfred", 30);
        importantPersson.setName("Tom");
        importantPersson.setAge(25);

        System.out.println(person.getName() + "\n" + person.getAge());
        System.out.println(importantPersson.getName() + "\n" + importantPersson.getAge());

        person.presentYourself();
        importantPersson.presentYourself();

        String personsName = person.getName();
        System.out.println(personsName);

        person.setAge(-30);
        person.setName("             Jean            Pierre         ");



        person.setAge(-9);
        person.setName("  ");

        person.presentYourself();
    }
}
