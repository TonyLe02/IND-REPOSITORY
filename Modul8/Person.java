// Eksempel på Encapsulation
public class Person {
    private String name;   // Privat variabel for personens navn
    private int age;       // Privat variabel for personens alder

    public Person(String name, int age) {  // Konstruktør for å opprette en Person-instans med navn og alder
        this.name = name;  // Sett navnet til det som ble gitt som argument
        this.age = age;    // Sett alderen til det som ble gitt som argument
    }

    public String getName() {   // Offentlig metode for å hente navnet på personen
        return name;            // Returner navnet
    }

    public void setName(String name) {  // Offentlig metode for å endre navnet på personen
        this.name = name;               // Sett navnet til det som ble gitt som argument
    }

    public int getAge() {   // Offentlig metode for å hente alderen på personen
        return age;         // Returner alderen
    }

    public void setAge(int age) {  // Offentlig metode for å endre alderen på personen
        this.age = age;            // Sett alderen til det som ble gitt som argument
    }
}
