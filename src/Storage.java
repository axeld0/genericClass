import java.util.ArrayList;

/*
Crear una clase genérica llamada "Almacenamiento" que pueda almacenar cualquier tipo de objeto.
Debe tener métodos para agregar, eliminar, y buscar objetos en el almacenamiento.
Haz pruebas de tu clase con diferentes tipos de objetos.

Create a generic class called "Storage" that can store any type of object.
It should have methods for adding, removing, and searching for objects in the storage.
Test your class with different types of objects.

 */

public class Storage <T> {
    private ArrayList<T> obj;


    public Storage ()
    {
        obj = new ArrayList<>();
    }

    public Storage(ArrayList<T>obj){
        this.obj = new ArrayList<>();
    }

    public String classType()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("The Class type of the object is " + obj.getClass());
        return sb.toString();
    }

    public void addElement(T object)
    {
        obj.add(object);
    }

    public void removeElement(T object)
    {
        obj.remove(object);
    }

    public String searchElement (T object)
    {
        StringBuilder sb = new StringBuilder("sory, not Found.");
        for(T o  : obj)
        {
            if(o.toString().equals(object.toString()))
            {
               sb.delete(0,sb.length());
               sb.append("Found! : " + o.toString());
            }
        }
       return sb.toString();
    }


}
