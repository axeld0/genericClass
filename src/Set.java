import java.util.HashMap;
import java.util.HashSet;

public class Set <E> {
    //Crear una clase genérica llamada "Conjunto" que pueda almacenar elementos únicos de cualquier tipo.
    // Debe tener métodos para agregar y eliminar elementos,
    // y para verificar si un elemento está en el conjunto. Haz pruebas de tu clase con diferentes tipos de elementos.

private  HashSet <E> set;

public Set()
{
    set = new HashSet<>();
}

public void addElement(E element)
{
    set.add(element);
}

public boolean removeElement (E element){
    return set.remove(element);
}

public String seachElement (E element){
    StringBuilder sb = new StringBuilder("It is not here, mostri.");
    if(set.contains(element)){
        sb.delete(0,sb.length());
        sb.append("It is really here!");
    }
    return sb.toString();
}




}
