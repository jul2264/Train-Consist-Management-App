<<<<<<< HEAD
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
=======
import java.util.Scanner;
>>>>>>> feature/UC11

public class TrainConsistManagementApp {

    public static void main(String[] args) {

<<<<<<< HEAD
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
=======
        Scanner scanner = new Scanner(System.in);
        ValidationService validator = new ValidationService();

        System.out.println("============================");
        System.out.println("Train ID & Cargo Validation");
        System.out.println("============================\n");

        // Input
        System.out.print("Enter Train ID: ");
        String trainId = scanner.nextLine();

        System.out.print("Enter Cargo Code: ");
        String cargoCode = scanner.nextLine();

        // Validation
        boolean isTrainValid = validator.isValidTrainId(trainId);
        boolean isCargoValid = validator.isValidCargoCode(cargoCode);

        System.out.println("\nValidation Results:\n");

        if (isTrainValid) {
            System.out.println("Train ID is VALID");
        } else {
            System.out.println("Train ID is INVALID");
        }

        if (isCargoValid) {
            System.out.println("Cargo Code is VALID");
        } else {
            System.out.println("Cargo Code is INVALID");
        }

        scanner.close();
>>>>>>> feature/UC11
    }
}