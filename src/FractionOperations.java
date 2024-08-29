
public class FractionOperations {
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

        double transformedAddition = F4.dividir(F2).sumar(F3.multiply(F1)).aDecimal();

        Fraccion decimalToDecimal = new Fraccion().aFraccion((896 / 35) * 8);
    }
}
