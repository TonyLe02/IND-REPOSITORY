import java.util.Random;

public class Randomnum {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomInt = rand.nextInt(10) + 1; // Genererer et tilfeldig tall mellom 1 og 10
        System.out.println(randomInt); // Skriver ut det tilfeldige tallet til konsollen
    }
}