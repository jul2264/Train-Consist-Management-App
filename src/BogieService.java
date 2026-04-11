<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
package trainconsist;

>>>>>>> feature/UC8
import java.util.List;
=======
import java.util.List;
import java.util.Map;
>>>>>>> feature/UC9
=======
import java.util.List;
import java.util.Map;
>>>>>>> feature/UC11
import java.util.stream.Collectors;

public class BogieService {

<<<<<<< HEAD
=======
    // UC8
>>>>>>> feature/UC11
    public List<Bogie> filterByCapacity(List<Bogie> bogies, int threshold) {
        return bogies.stream()
                .filter(b -> b.getCapacity() > threshold)
                .collect(Collectors.toList());
    }
<<<<<<< HEAD
<<<<<<< HEAD
=======

=======

    // UC9
>>>>>>> feature/UC11
    public Map<String, List<Bogie>> groupByType(List<Bogie> bogies) {
        return bogies.stream()
                .collect(Collectors.groupingBy(Bogie::getName));
    }
<<<<<<< HEAD
>>>>>>> feature/UC9
=======
    //uc10
    public int getTotalCapacity(List<Bogie> bogies) {
        return bogies.stream()
                .map(Bogie::getCapacity)      // extract capacity
                .reduce(0, Integer::sum);     // aggregate
    }
>>>>>>> feature/UC11
}