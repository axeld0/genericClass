import java.util.ArrayList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {


        /**1**/
        System.out.println("\n/**1**/\n");
        Storage<Object> storage = new Storage<>();
        storage.addElement(12);
        storage.addElement("Yellow");
        System.out.println(storage.searchElement(13));


        /**2**/
        System.out.println("\n/**2**/\n");
        Pila<Object> pila = new Pila<>();
        System.out.println(pila.empty());
        pila.addElement(12);
        pila.addElement("Mariano Closs");
        int number = pila.getNumberOfElements();
        System.out.println(number);
        System.out.println(pila.empty());
        System.out.println(pila.searchElement("Mariano Closs"));

        /**3**/
        System.out.println("\n/**3**/\n");
        int num1 = 1;
        float num2 = 23.32F;
        MathOperation<Number> mo = new MathOperation<>();
        mo.setNumbers(num1, num2);
        System.out.println(mo.sum(num1,num2));
        System.out.println(mo.substraction(num1,num2));
        System.out.println(mo.multi(num1,num2));
        System.out.println(mo.div(num1,num2));


        /**4**/
        System.out.println("\n/**4**/\n");
        Set set = new Set();
        set.addElement(1);
        set.addElement(pila);
        set.addElement("Cada dia mas");
        set.removeElement("Cada dia mas");
        System.out.println(set.seachElement("Cada dia mas"));
        System.out.println(set.seachElement(pila));

        /**5**/
        System.out.println("\n/**5**/\n");
        OrderedList<Personas> ol = new OrderedList<>(true);
        Personas p1 = new Personas(1, "Axel", 31);
        Personas p2 = new Personas(2, "Carlos", 33);

        ol.addElement(p1);
        ol.addElement(p2);

        System.out.println(p1.compareTo(p2));
        try {
            System.out.println(ol.retrieveElement(0));
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}