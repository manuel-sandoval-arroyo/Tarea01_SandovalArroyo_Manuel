import java.util.Scanner;

public class SolidCalculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(
                "Bienvenido a la prismdonator 3000. Porque siempre se necesita esa calculadora que calcule cosas relacionadas al prisma triangular y al toroide...");

        System.out.println("Empecemos con el prisma triangular, porque así está en las instrucciones...");
        System.out.print("Ingrese la base del triángulo: ");
        double triangleBase = scanner.nextDouble();
        System.out.print("Ingrese la altura del triángulo: ");
        double triangleHeight = scanner.nextDouble();
        System.out.print("Ingrese la altura del prisma: ");
        double prismHeight = scanner.nextDouble();

        System.out.println("Ahora vayamos con los datos del toroide...");
        System.out.print("Ingrese el radio mayor del toroide: ");
        double majorRadius = scanner.nextDouble();
        System.out.print("Ingrese el radio menor del toroide: ");
        double minorRadius = scanner.nextDouble();

        double prismSurfaceArea = (triangleBase * triangleHeight) + (triangleBase * prismHeight)
                + (2 * triangleHeight * prismHeight);
        double prismVolume = ((triangleBase * triangleHeight) / 2) * prismHeight;

        double torusSurfaceArea = 4 * Math.pow(Math.PI, 2) * majorRadius * minorRadius;
        double torusVolume = 2 * Math.pow(Math.PI, 2) * majorRadius * Math.pow(minorRadius, 2);

        System.out.println("***Área y volumen del prisma triangular***");

        System.out.println("El área superficial del prisma es: " + prismSurfaceArea + " cm²");
        System.out.println("El volumen del prisma es: " + prismVolume + " cm³");

        System.out.println("***Área y volumen del toroide***");
        System.out.println("El área superficial del toroide es: " + torusSurfaceArea + " cm²");
        System.out.println("El volumen del toroide es: " + torusVolume + " cm³");

        scanner.close();
    }
}
