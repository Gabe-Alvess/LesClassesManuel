package be.intecbrussel;

public class Person {
    /*
    Access Modifiers:
    * Public -> Overal toegankelijk, vanuit elke klas, package of buiten de package.
    * Private -> Toegankelijk binnen de klassen waar deze gedefinieerd is. Niet toegankelijk van buiten uit de klas.
    * Protected -> Alleen toegankelijk voor klassen binnen het huidige pakket en buiten de package door subclasses.
    * Default or Package -> Alleen toegankelijk binnenin de package. Wanneer er geen access modifiers is opgegeven is dit de standaard.
     */

    private String name; // -> Property. Private = Access Modifier
    private int age; // -> Property

    // Constructors

    // No-args constructor
    public Person() {
    }

    // Constructor met 1 parameter
    public Person(String name) {
        setName(name);
    }

    // All-args constructor
    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    // Methods
    // Void is een return type maar, het geeft niks terug. Void betekent gewoon dat dit gaat een waarde vragen en dan opslagen of een functie uitvoeren.
    // Dat is het. Hij gaat die waarde niet terug geven aan iets anders. Hij gaat gewoon zijn taak doen.
    // Het gaat dit waarde niet terug geven. VB: setter.
    public void presentYourself() {
        String sentence = buildPresentationSentence();
        System.out.println(sentence);
    }
    private String buildPresentationSentence() { // private hulpmethode
        return "I am " + name + " and I am " + age + " years old.";
    }

    // Getters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    // Setters
//    public void setAge(int age) {
//        age = age;
//    } -> probleem

//    public void setAge(int ageToSet) {
//        age = ageToSet;
//    }  -> oplossing 1

//    public void setAge(int age) { // -> parameter
//        this.age = age;
//    }  -> oplossing 2 -> this.age verwijst naar de property van de class en niet naar de parameter van de setter

//    public void setAge(int age) { // -> parameter
//       if (age >= 0) {
//           this.age = age;
//       } else {
//           this.age = -age;
//       }
//   }

//    public void setAge(int age) { // -> parameter
//        if (age >= 0) {
//            this.age = age;
//        } else {
//            this.age = Math.abs(age); geen else if nodig
//        }
//    }

    // Setter
    public void setAge(int age) { // -> parameter
        this.age = Math.abs(age);
    } // -> beste oplossing!!!

    // Setter
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

    // Static methodes

        /*
        Het verschil tussen static methodes en instance methodes
          INSTANCE METHODES:
            * Heeft een object van een klas nodig.
            * Heeft toegang tot alle fields in een klas.
            * De methode is alleen maar toegankelijk door een object referentie.
            * Syntax: ObjectName.methodName()

          STATIC METHODES:
            * Heeft geen object van een klas nodig.
            * Heeft alleen toegang tot alle static fields in een klas.
            * De methode is alleen toegankelijk door de klas naam.
            * Syntax: className.methodName()
         */

    // Een non-static method
    public void messageNonStatic() {
        System.out.println("Hi, from non-static method");
    }

    // Een static method
    public static void messageStatic() {
        System.out.println("Hi, from static method");
    }
}
