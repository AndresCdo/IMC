import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
public class Arrays {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>(20);
        System.out.println("Tamaño del arreglo: " + list1.size());

        for (int i = 0; i<10;i++){
            System.out.println("Ingrese el nombre " + i + ": ");
            list1.add(i,entrada.nextLine().toUpperCase());
        }
        for (int i = 0; i<10;i++){
            System.out.println(list1.get(i) + " ");
        }
        entrada.close();
    }
}
