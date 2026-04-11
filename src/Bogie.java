<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
package trainconsist;

>>>>>>> feature/UC8
=======
>>>>>>> feature/UC9
=======
>>>>>>> feature/UC11
public class Bogie {
    private String name;
    private int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return name + " -> " + capacity;
    }
}