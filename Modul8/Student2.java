// Eksempel på dårlig cohesion
public class Student2 { // definerer klassen "Student"
    private String name; // privat variabel for studentens navn
    private int age; // privat variabel for studentens alder
    private String address; // privat variabel for studentens adresse
    private int phoneNumber; // privat variabel for studentens telefonnummer
    private String email; // privat variabel for studentens e-postadresse

    public Student2(String name, int age, String address, int phoneNumber, String email) { // konstruktør for klassen, tar inn variablene og initialiserer dem
        this.name = name; 
        this.age = age; 
        this.address = address; 
        this.phoneNumber = phoneNumber; 
        this.email = email; 
    }

    public String getName() { // metode for å hente studentens navn
        return name; 
    }

    public void setName(String name) { // metode for å oppdatere studentens navn
        this.name = name; 
    }

    public int getAge() { // metode for å hente studentens alder
        return age; 
    }

    public void setAge(int age) { // metode for å oppdatere studentens alder
        this.age = age; 
    }

    public String getAddress() { // metode for å hente studentens adresse
        return address; 
    }

    public void setAddress(String address) { // metode for å oppdatere studentens adresse
        this.address = address; 
    }

    public int getPhoneNumber() { // metode for å hente studentens telefonnummer
        return phoneNumber; 
    }

    public void setPhoneNumber(int phoneNumber) { // metode for å oppdatere studentens telefonnummer
        this.phoneNumber = phoneNumber; 
    }

    public String getEmail() { // metode for å hente studentens e-postadresse
        return email; 
    }

    public void setEmail(String email) { // metode for å oppdatere studentens e-postadresse
        this.email = email; 
    }

    public void printInfo() { // metode for å skrive ut all informasjonen til en student
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Email: " + email);
    }
}
