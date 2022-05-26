import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        Vector<String> lista = new Vector<String>();
        lista.add("Tesla");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }

}