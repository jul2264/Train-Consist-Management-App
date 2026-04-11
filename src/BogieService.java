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
import java.util.stream.Collectors;

public class BogieService {

    public List<Bogie> filterByCapacity(List<Bogie> bogies, int threshold) {
        return bogies.stream()
                .filter(b -> b.getCapacity() > threshold)
                .collect(Collectors.toList());
    }
<<<<<<< HEAD
=======

    public Map<String, List<Bogie>> groupByType(List<Bogie> bogies) {
        return bogies.stream()
                .collect(Collectors.groupingBy(Bogie::getName));
    }
>>>>>>> feature/UC9
}