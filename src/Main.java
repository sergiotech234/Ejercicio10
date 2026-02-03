import java.util.Map;
import java.util.HashMap;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> estudiantes = new HashMap<>();

        estudiantes.put("Vinicius", 26);
        estudiantes.put("Courtois", 35);
        estudiantes.put("Alaba", 33);
        estudiantes.put("Mbappe", 22);
        estudiantes.put("Carvajal", 30);

        // Convertir el HashMap a lista
        List<Map.Entry<String, Integer>> lista =
                new ArrayList<>(estudiantes.entrySet());

        // Ordenar por nombre
        Collections.sort(lista, Comparator.comparing(Map.Entry::getKey));

        System.out.println("Ordenados por nombre:");
        for (Map.Entry<String, Integer> item : lista) {
            System.out.println(item.getKey() + " - " + item.getValue() + " años");
        }

        // Ordenar por edad
        Collections.sort(lista, Comparator.comparingInt(Map.Entry::getValue));

        System.out.println("\nOrdenados por edad:");
        for (Map.Entry<String, Integer> item : lista) {
            System.out.println(item.getKey() + " - " + item.getValue() + " años");
        }
    }
}
