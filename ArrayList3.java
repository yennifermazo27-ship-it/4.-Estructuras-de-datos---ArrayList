import java.util.ArrayList;

public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>();

        frutas.add("Manzana");
        frutas.add("Mango");
        frutas.add("Banano");

        for (String fruta : frutas) {
            System.out.println(fruta);
        }
    }
}
