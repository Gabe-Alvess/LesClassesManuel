package be.intecbrussel;

public class Person {
    String name; // -> Property
    int age; // -> Property

    public Person(String name) { // -> constructor
        setName(name);
    }

    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    public void presentYourself() {
        String sentence = buildPresentationSentence();
        System.out.println(sentence);
    }
    private String buildPresentationSentence() { // private hulpmethode
        String sentence = "I am " + name + " and I am " + age + " years old.";
        return sentence;
    }

    public String getName() {
        return name;
    }

//    void setAge(int age) {
//        age = age;
//    } -> probleem

//    void setAge(int ageToSet) {
//        age = ageToSet;
//    }  -> oplossing 1

//    void setAge(int age) {
//        this.age = age;
//    }  -> oplossing 2 this.age verwijst naar de property en niet naar de parameter

//        void setAge(int age) { // -> parameter
//        if (age >= 0) {
//            this.age = age;
//        } else {
//            this.age = -age;
//        }
//    }

//    void setAge(int age) { // -> parameter
//        if (age >= 0) {
//            this.age = age;
//        } else {
//            this.age = Math.abs(age); geen else if nodig
//        }
//    }
    public void setAge(int age) { // -> parameter
        this.age = Math.abs(age);
    } // -> beste oplossing!!!

    public void setName(String name) {
//        if (!name.isBlank() && name.length() > 0) {
//            this.name = name.trim();
//        } -> oplossing 1

//        if (name.trim().length() > 0) {
//            this.name = name.trim();
//        } -> oplossing 2

        String trimmedName = name.trim();
        if (trimmedName.length() > 0) {
            this.name = trimmedName;
        } else {
            this.name = "NO NAME";
        } // -> Dry -> Don't repeat yourself. Beste oplossing!!!!

    }
}
