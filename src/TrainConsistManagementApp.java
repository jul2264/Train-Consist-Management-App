<<<<<<< HEAD
<<<<<<< HEAD
=======
package trainconsist;

>>>>>>> feature/UC8
import java.util.List;
import java.util.ArrayList;
=======
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
>>>>>>> feature/UC9

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("============================");
<<<<<<< HEAD
        System.out.println("Filter Bogies using Streams");
=======
        System.out.println("Group Bogies by Type");
>>>>>>> feature/UC9
        System.out.println("============================\n");

        List<Bogie> bogieList = new ArrayList<>();

        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 56));
<<<<<<< HEAD
        bogieList.add(new Bogie("First Class", 24));

        BogieService service = new BogieService();

        List<Bogie> filtered = service.filterByCapacity(bogieList, 60);

        System.out.println("Filtered Bogies (capacity > 60):\n");
        filtered.forEach(System.out::println);
=======
        bogieList.add(new Bogie("Sleeper", 70));
        bogieList.add(new Bogie("First Class", 24));
        bogieList.add(new Bogie("AC Chair", 58));

        BogieService service = new BogieService();

        Map<String, List<Bogie>> grouped = service.groupByType(bogieList);

        System.out.println("Grouped Bogies:\n");

        for (Map.Entry<String, List<Bogie>> entry : grouped.entrySet()) {
            System.out.println(entry.getKey() + ":");
            for (Bogie b : entry.getValue()) {
                System.out.println("  " + b);
            }
        }
>>>>>>> feature/UC9
    }
}