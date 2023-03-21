// Abstrakt klasse for former
public abstract class Shape {
    
    // Abstrakt metode for å beregne areal
    public abstract double calculateArea();
}

// Sirkel subklasse av Shape
public class Circle extends Shape {
    
    // Privat instansvariabel for radius
    private double radius;

    // Konstruktør for Circle som setter radiusen
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementasjon av calculateArea metoden for Circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Firkant subklasse av Shape
