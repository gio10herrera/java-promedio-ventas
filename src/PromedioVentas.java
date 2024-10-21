import java.util.Scanner;

public class PromedioVentas {
    static double promVentasAnuales = 0;
    static String[] nombresVendedores;
    static int n;
    static double[][] ventasTrismetresVendedores;
    static double[] promPorVendedor;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Numero de vendedores: ");
        n = input.nextInt();
        nombresVendedores = new String[n];
        ventasTrismetresVendedores = new double[n][4];
        promPorVendedor = new double[n];

    }
}
