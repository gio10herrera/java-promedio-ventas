import java.util.Scanner;

public class PromedioVentas {
    static double promVentasAnuales = 0;
    static String[] nombresVendedores;
    static int n;
    static double[][] ventasTrismetresVendedores;
    static double[] promPorVendedor;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Numero de vendedores: ");
        n = input.nextInt();
        nombresVendedores = new String[n];
        ventasTrismetresVendedores = new double[n][4];
        promPorVendedor = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el nombre del vendedor : ");
            nombresVendedores[i] = input.next();
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite la venta del trimestre " + (j + 1) + ": ");
                ventasTrismetresVendedores[i][j] = input.nextDouble();
            }
            System.out.println();
        }
        calcularPromediosPorVendedor();
        calcularPromedioVentasAnuales();
        mostrarPromediosPorVendedor();
        mostrarPromedioVentasAnuales();
    }

    private static void mostrarPromedioVentasAnuales() {
        System.out.println("\nPromedio de ventas totales: " + promVentasAnuales);
    }

    private static void mostrarPromediosPorVendedor() {
        System.out.println("Promedio de vendedores:\n\n");
        for (int i = 0; i < n; i++) {
            System.out.print((i+1) + ". Nombre: " + nombresVendedores[i] + "\tPromedio: " + promPorVendedor[i] + "\n");
        }
    }

    private static void calcularPromedioVentasAnuales() {
        for (int i = 0; i < n; i++) {
            promVentasAnuales += promPorVendedor[i];
        }
        promVentasAnuales = promVentasAnuales / n;
    }

    private static void calcularPromediosPorVendedor() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                promPorVendedor[i] += ventasTrismetresVendedores[i][j];
            }
            promPorVendedor[i] = promPorVendedor[i] / 4;
        }
    }
}
