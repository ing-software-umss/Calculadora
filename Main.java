
public class Main
{
    public static void main(String[] args)
    {
        Calculadora cal = new Calculadora();
        System.out.println(cal.suma(2, 3));
        System.out.println(cal.resta(2, 3));
        System.out.println(cal.mult(2, 3));
        System.out.println(cal.division(2, 3));
        System.out.println(cal.residuo(2, 3));
    }
}
