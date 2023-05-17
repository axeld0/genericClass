import java.util.Objects;

public class Personas implements Comparable<Personas> {
    private int dni;
    private String name;
    private int age;

    public Personas(int dni, String name, int age) {
        this.dni = dni;
        this.name = name;
        this.age = age;
    }

    public Personas() {
        dni = 0;
        name = "";
        age = 0;
    }


    //getters

    private int getDni() {
        return dni;
    }

   private void setDni(int dni) {
        this.dni = dni;
    }

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personas personas = (Personas) o;
        return dni == personas.dni && age == personas.age && Objects.equals(name, personas.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni, name, age);
    }


 @Override
    public int compareTo(Personas o) {
        int compare = 0;
         if (o != null)
         {
             if( o instanceof  Personas)
             {
               Personas aux = (Personas) o;
               Integer thisDNI = getDni();
               Integer otherDNI = aux.getDni();
               compare = thisDNI.compareTo(otherDNI);
             }
         }
         return compare;
    }

    @Override
    public String toString() {
        return "Personas{" +
                "dni=" + dni +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}
