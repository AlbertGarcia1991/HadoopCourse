import java.io.Serializable;

// To be able to serialize an object, the class must implement Serializable
public class Person implements Serializable {
    private transient int id;  // Keyword 'transient' removes the variable from the output serialized object
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString(){
        return "Person [id=" + id + ", name=" + name + "]";
    }
}
