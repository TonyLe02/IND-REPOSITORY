public class Student {
    private String navn; // Variabel for studentens navn
    private int alder; // Variabel for studentens alder
    private int studentId; // Variabel for studentens ID-nummer

    // Konstruktør for å initialisere variablene
    public Student(String navn, int alder, int studentId) {
        this.navn = navn; // Sett studentens navn
        this.alder = alder; // Sett studentens alder
        this.studentId = studentId; // Sett studentens ID-nummer
    }

    // Getter-metode for å hente studentens navn
    public String getNavn() {
        return navn;
    }

    // Setter-metode for å sette studentens navn
    public void setNavn(String navn) {
        this.navn = navn;
    }

    // Getter-metode for å hente studentens alder
    public int getAlder() {
        return alder;
    }

    // Setter-metode for å sette studentens alder
    public void setAlder(int alder) {
        this.alder = alder;
    }

    // Getter-metode for å hente studentens ID-nummer
    public int getStudentId() {
        return studentId;
    }

    // Setter-metode for å sette studentens ID-nummer
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    // Funksjon for å skrive ut studentinformasjon
    public void printInfo() {
        System.out.println("Navn: " + navn);
        System.out.println("Alder: " + alder);
        System.out.println("Student ID: " + studentId);
    }
}
