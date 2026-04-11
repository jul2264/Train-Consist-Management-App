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
import java.util.List;
import java.util.ArrayList;
>>>>>>> feature/UC11

public class BogieServiceTest {

    private static BogieService service = new BogieService();

    public static void main(String[] args) {

<<<<<<< HEAD
<<<<<<< HEAD
        System.out.println("Running Test Cases...\n");

        testFilter_CapacityGreaterThanThreshold();
        testFilter_CapacityEqualToThreshold();
        testFilter_CapacityLessThanThreshold();
        testFilter_MultipleBogiesMatching();
        testFilter_NoBogiesMatching();
        testFilter_AllBogiesMatching();
        testFilter_EmptyBogieList();
        testFilter_OriginalListUnchanged();

        System.out.println("\nAll Tests Executed.");
=======
        System.out.println("Running UC9 Test Cases...\n");

        testGrouping_BogiesGroupedByType();
        testGrouping_MultipleBogiesInSameGroup();
        testGrouping_DifferentBogieTypes();
        testGrouping_EmptyBogieList();
        testGrouping_SingleBogieCategory();
        testGrouping_MapContainsCorrectKeys();
        testGrouping_GroupSizeValidation();
        testGrouping_OriginalListUnchanged();

        System.out.println("\nAll UC9 Tests Executed.");
>>>>>>> feature/UC9
=======
        System.out.println("Running UC10 Test Cases...\n");

        testReduce_TotalSeatCalculation();
        testReduce_MultipleBogiesAggregation();
        testReduce_SingleBogieCapacity();
        testReduce_EmptyBogieList();
        testReduce_CorrectCapacityExtraction();
        testReduce_AllBogiesIncluded();
        testReduce_OriginalListUnchanged();

        System.out.println("\nAll UC10 Tests Executed.");
>>>>>>> feature/UC11
    }

    private static List<Bogie> getSampleBogies() {
        List<Bogie> list = new ArrayList<>();
        list.add(new Bogie("Sleeper", 72));
        list.add(new Bogie("AC Chair", 56));
<<<<<<< HEAD
<<<<<<< HEAD
        list.add(new Bogie("First Class", 24));
        list.add(new Bogie("Luxury", 80));
        return list;
    }

<<<<<<< HEAD
    // ✅ Simple assertion helpers
=======
>>>>>>> feature/UC8
=======
        list.add(new Bogie("Sleeper", 70));
        list.add(new Bogie("First Class", 24));
        list.add(new Bogie("AC Chair", 58));
        return list;
    }

>>>>>>> feature/UC9
=======
        list.add(new Bogie("Sleeper", 70));
        list.add(new Bogie("First Class", 24));
        return list;
    }

    // Assertion helpers
>>>>>>> feature/UC11
    private static void assertTrue(boolean condition, String testName) {
        if (condition) {
            System.out.println("✔ PASS: " + testName);
        } else {
            System.out.println("✘ FAIL: " + testName);
        }
    }

    private static void assertEquals(int expected, int actual, String testName) {
        if (expected == actual) {
            System.out.println("✔ PASS: " + testName);
        } else {
            System.out.println("✘ FAIL: " + testName +
                    " | Expected: " + expected + " but got: " + actual);
        }
    }

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    // ✅ Test Cases

=======
>>>>>>> feature/UC8
    static void testFilter_CapacityGreaterThanThreshold() {
        List<Bogie> result = service.filterByCapacity(getSampleBogies(), 70);
        boolean condition = result.stream().allMatch(b -> b.getCapacity() > 70);
        assertTrue(condition, "Capacity > Threshold");
    }

    static void testFilter_CapacityEqualToThreshold() {
        List<Bogie> result = service.filterByCapacity(getSampleBogies(), 72);
        boolean condition = result.stream().noneMatch(b -> b.getCapacity() == 72);
        assertTrue(condition, "Capacity == Threshold excluded");
    }

    static void testFilter_CapacityLessThanThreshold() {
        List<Bogie> result = service.filterByCapacity(getSampleBogies(), 60);
        boolean condition = result.stream().noneMatch(b -> b.getCapacity() <= 60);
        assertTrue(condition, "Capacity < Threshold excluded");
    }

    static void testFilter_MultipleBogiesMatching() {
        List<Bogie> result = service.filterByCapacity(getSampleBogies(), 50);
<<<<<<< HEAD
        assertEquals(2, result.size(), "Multiple bogies matching");
=======
        assertEquals(3, result.size(), "Multiple bogies matching");
>>>>>>> feature/UC8
    }

    static void testFilter_NoBogiesMatching() {
        List<Bogie> result = service.filterByCapacity(getSampleBogies(), 100);
        assertTrue(result.isEmpty(), "No bogies matching");
    }

    static void testFilter_AllBogiesMatching() {
        List<Bogie> result = service.filterByCapacity(getSampleBogies(), 10);
        assertEquals(4, result.size(), "All bogies matching");
    }

    static void testFilter_EmptyBogieList() {
        List<Bogie> result = service.filterByCapacity(new ArrayList<>(), 50);
        assertTrue(result.isEmpty(), "Empty bogie list");
    }

    static void testFilter_OriginalListUnchanged() {
        List<Bogie> original = getSampleBogies();
        service.filterByCapacity(original, 60);
        assertEquals(4, original.size(), "Original list unchanged");
=======

    static void testGrouping_BogiesGroupedByType() {
        Map<String, List<Bogie>> result = service.groupByType(getSampleBogies());
        assertTrue(result.get("Sleeper").size() == 2, "Bogies grouped by type");
    }

    static void testGrouping_MultipleBogiesInSameGroup() {
        Map<String, List<Bogie>> result = service.groupByType(getSampleBogies());
        assertEquals(2, result.get("AC Chair").size(), "Multiple bogies in same group");
    }

    static void testGrouping_DifferentBogieTypes() {
        Map<String, List<Bogie>> result = service.groupByType(getSampleBogies());
        assertTrue(result.keySet().size() == 3, "Different bogie types grouped separately");
    }

    static void testGrouping_EmptyBogieList() {
        Map<String, List<Bogie>> result = service.groupByType(new ArrayList<>());
        assertTrue(result.isEmpty(), "Empty bogie list");
    }

    static void testGrouping_SingleBogieCategory() {
        List<Bogie> list = new ArrayList<>();
        list.add(new Bogie("Sleeper", 72));
        list.add(new Bogie("Sleeper", 70));

        Map<String, List<Bogie>> result = service.groupByType(list);
        assertEquals(1, result.keySet().size(), "Single bogie category");
    }

    static void testGrouping_MapContainsCorrectKeys() {
        Map<String, List<Bogie>> result = service.groupByType(getSampleBogies());
        boolean condition = result.containsKey("Sleeper") &&
                            result.containsKey("AC Chair") &&
                            result.containsKey("First Class");

        assertTrue(condition, "Map contains correct keys");
    }

    static void testGrouping_GroupSizeValidation() {
        Map<String, List<Bogie>> result = service.groupByType(getSampleBogies());
        assertEquals(2, result.get("Sleeper").size(), "Group size validation");
    }

    static void testGrouping_OriginalListUnchanged() {
        List<Bogie> original = getSampleBogies();
        service.groupByType(original);
        assertEquals(5, original.size(), "Original list unchanged");
>>>>>>> feature/UC9
=======

    static void testReduce_TotalSeatCalculation() {
        int total = service.getTotalCapacity(getSampleBogies());
        assertEquals(222, total, "Total seat calculation"); // 72+56+70+24
    }

    static void testReduce_MultipleBogiesAggregation() {
        int total = service.getTotalCapacity(getSampleBogies());
        assertTrue(total > 0, "Multiple bogies aggregation");
    }

    static void testReduce_SingleBogieCapacity() {
        List<Bogie> list = new ArrayList<>();
        list.add(new Bogie("Sleeper", 72));

        int total = service.getTotalCapacity(list);
        assertEquals(72, total, "Single bogie capacity");
    }

    static void testReduce_EmptyBogieList() {
        int total = service.getTotalCapacity(new ArrayList<>());
        assertEquals(0, total, "Empty bogie list");
    }

    static void testReduce_CorrectCapacityExtraction() {
        List<Bogie> list = getSampleBogies();
        int expected = 72 + 56 + 70 + 24;

        int actual = service.getTotalCapacity(list);
        assertEquals(expected, actual, "Correct capacity extraction");
    }

    static void testReduce_AllBogiesIncluded() {
        List<Bogie> list = getSampleBogies();
        int total = service.getTotalCapacity(list);

        assertTrue(total == 222, "All bogies included");
    }

    static void testReduce_OriginalListUnchanged() {
        List<Bogie> original = getSampleBogies();
        service.getTotalCapacity(original);

        assertEquals(4, original.size(), "Original list unchanged");
>>>>>>> feature/UC11
    }
}