import java.util.Stack;

public class Pila <T> {

    /*
    Crear una clase genérica llamada "Pila" que funcione como una pila de objetos.
    Debe tener métodos para agregar y quitar elementos de la pila, así como para verificar si está vacía y para obtener el número de elementos en la pila.
    Haz pruebas de tu clase con diferentes tipos de objetos.


    Create a generic class called "Stack" that works as a stack of objects. It should have methods for adding and removing elements from the stack,
    as well as for checking if it is empty and for getting the number of elements in the stack.
    Test your class with different types of objects.
     */

   private Stack<T> pila;

   public Pila ()
   {
       pila = new Stack<>();
   }

   public void addElement(T obj)
   {
       pila.push(obj);
   }

   public void removeElement ()
   {
       pila.pop();
   }

   public String searchElement(T obj)
   {
       StringBuilder sb = new StringBuilder("Sorry, not found.");
       if(pila.search(obj) != -1)
       {
           sb.delete(0,sb.length());
           sb.append("It's on the Stack, " + pila.search(obj) + "  places away from the top." );
       }
       return sb.toString();
   }

   public String empty ()
   {

       StringBuilder sb = new StringBuilder("It's not empty");
       if (pila.empty() == true)
       {
           sb.delete(0,sb.length());
           sb.append("It is empty.");
       }
       return sb.toString();
   }

   public int getNumberOfElements()
   {
       return pila.size();
   }


}
