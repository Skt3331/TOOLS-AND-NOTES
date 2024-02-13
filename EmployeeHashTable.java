import java.util.HashMap;
import java.util.Map;

public class EmployeeHashTable {

    public static void main(String[] args) {
        HashMap<String, Double> employeeMap = new HashMap<>();

        employeeMap.put("saurav", 50000.00);
        employeeMap.put("vivek", 45000.00);
        employeeMap.put("Smith", 60000.00);
        employeeMap.put("kumar", 40000.00);

        System.out.println("Employee Name\t\tSalary");
        System.out.println("------------\t\t-------");
        for (Map.Entry<String, Double> entry : employeeMap.entrySet()) {
            String name = entry.getKey();
            double salary = entry.getValue();
            System.out.printf("%-20s\t\t%.2f%n", name, salary);
        }
    }
}
