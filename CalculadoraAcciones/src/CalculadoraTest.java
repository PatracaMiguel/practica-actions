public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int pruebasPasadas = 0;
        int pruebasTotales = 4;
        
        if (calc.sumar(5, 3) == 8) pruebasPasadas++;
        if (calc.sumar(-2, 7) == 5) pruebasPasadas++;
        if (calc.restar(10, 4) == 6) pruebasPasadas++;
        if (calc.restar(5, -3) == 8) pruebasPasadas++;
        if (calc.multiplicar(2, 3) == 6) pruebasPasadas++;
        if (calc.multiplicar(5, -2) == 10) pruebasPasadas++;
        
        if (pruebasPasadas == pruebasTotales) {
            System.exit(0);
        } else {
            System.exit(1);
        }
    }
}