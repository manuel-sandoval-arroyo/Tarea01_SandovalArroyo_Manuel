
/**
 * La clase FractionOperations representa un programa que realiza varias operaciones con fracciones.
 * utiliza métodos para sumar, restar, multiplicar, dividir y elevar fracciones.
 * La clase también usa un método para convertir una fracción en un valor decimal.
 */
public class FractionOperations {
    /**
     * El método principal del programa.
     * Crea instancias de la clase Fraccion y realiza operaciones matemáticas con ellas.
     * Imprime los resultados por consola.
     *
     * @param args Los argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        final Fraccion F1 = new Fraccion(1, 3, 2);
        final Fraccion F2 = new Fraccion(2300, 349);
        final Fraccion F3 = new Fraccion(2, 50);
        final Fraccion F4 = new Fraccion(300, 3);

        Fraccion addition = F1.sumar(F4);
        Fraccion difference = F4.restar(F1);
        Fraccion multiplication = F3.multiplicar(F1);
        Fraccion division = F1.dividir(F2);
        Fraccion elevation = F2.multiplicar(F2.dividir(F1).sumar(F3).restar(F4)).potencia(3);

        double transformedAddition = F4.dividir(F2).sumar(F3.multiplicar(F1)).aDecimal();

        Fraccion decimalToDecimal = new Fraccion().aFraccion((896 / 35) * 8);

        System.out.println("F1: " + F1);
        System.out.println("F2: " + F2);
        System.out.println("F3: " + F3);
        System.out.println("F4: " + F4);
        System.out.println("F1 + F4: " + addition);
        System.out.println("F4 - F1: " + difference);
        System.out.println("F3 * F1: " + multiplication);
        System.out.println("F1 / F2: " + division);
        System.out.println("(F2 * (F3 + (F2 / F1) - F4))^ 3: " + elevation);
        System.out.println("F4 / F2 + F3 * F1: " + transformedAddition);
        System.out.println("896 / 35 * 8: " + decimalToDecimal);
    }
}
