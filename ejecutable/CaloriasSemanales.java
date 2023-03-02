package ejecutable;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class CaloriasSemanales {
    public static void main(String[] args) {

        // Declaración de variales

        int[] calorias;
        String[] semana = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" };

        int mayor = 0;
        float prom = 0, menor;
        String diaMayor = "", diaMenor = "";

        calorias = new int[7];

        for (int i = 0; i < calorias.length; i++) {
            calorias[i] = Integer
                    .parseInt(JOptionPane.showInputDialog("Ingrese las calorias del dia " + (i + 1) + ": "));
            prom = prom + calorias[i];

            if (calorias[i] > mayor) {
                mayor = calorias[i];
                diaMayor = semana[i];
            }
        }

        menor = mayor;
        for (int i = 0; i < calorias.length; i++) {
            if (calorias[i] < menor) {
                menor = calorias[i];
                diaMenor = semana[i];
            }
        }

        String caloriasSemanal = "Calorias semanal:\n";
        for (int i = 0; i < calorias.length; i++) {
            caloriasSemanal += semana[i] + ": " + calorias[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, caloriasSemanal);

        JOptionPane.showMessageDialog(null,
                "Datos extras:\n" +
                        "El promedio de calorias semanal es de " + (prom / 7) + " calorias\n" +
                        "El día con MAYOR calorias es el " + diaMayor + " con " + mayor + " calorias\n" +
                        "El día con MENOR calorias es el " + diaMenor + " con " + menor + " calorias");

        // Orden ascendente de calorias
        Arrays.sort(calorias);

        String caloriasAscendente = "Calorias en orden ascendente:\n";
        for (int i = 0; i < calorias.length; i++) {
            caloriasAscendente += semana[i] + ": " + calorias[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, caloriasAscendente);

        // Orden descendente de calorias
        String caloriasDescendente = "Calorias en orden descendente:\n";
        for (int i = calorias.length - 1; i >= 0; i--) {
            caloriasDescendente += semana[i] + ": " + calorias[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, caloriasDescendente);
    }
}