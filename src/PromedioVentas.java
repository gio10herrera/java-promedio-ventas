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
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el nombre del vendedor : ");
            nombresVendedores[i] = input.next();
            for (int j = 0; j < 4; j++) {
                System.out.println("Digite la venta del trimestre " + (j + 1) + ": ");
                ventasTrismetresVendedores[i][j] = input.nextDouble();
            }
        }
    }
}
