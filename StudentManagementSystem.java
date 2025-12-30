public class StudentManagementSystem {

    public static void main(String[] args) {

        
        String[] names = {
            "Rohith", "Anil", "Suresh", "Kiran", "Manoj",
            "Vamsi", "Ravi", "Nikhil", "Arjun", "Teja"
        };

        int[] marks = {85, 72, 90, 67, 78, 88, 60, 95, 70, 80};

        int n = names.length;

        
        System.out.println("---- All Students ----");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i] + " - " + marks[i]);
        }

        
        String searchName = "Rohith";
        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (names[i].equals(searchName)) {
                System.out.println("\nStudent Found: " + names[i] + " scored " + marks[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nStudent not found");
        }

        
        int max = marks[0];
        int topperIndex = 0;

        for (int i = 1; i < n; i++) {
            if (marks[i] > max) {
                max = marks[i];
                topperIndex = i;
            }
        }

        System.out.println("\nTopper: " + names[topperIndex] + " with " + max + " marks");

        
        System.out.println("\nStudents with marks > 75:");
        for (int i = 0; i < n; i++) {
            if (marks[i] > 75) {
                System.out.println(names[i] + " - " + marks[i]);
            }
        }

        
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += marks[i];
        }

        double average = sum / (double) n;
        System.out.println("\nClass Average: " + average);

        
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (marks[i] < marks[j]) {

                    int tempMarks = marks[i];
                    marks[i] = marks[j];
                    marks[j] = tempMarks;

                    String tempName = names[i];
                    names[i] = names[j];
                    names[j] = tempName;
                }
            }
        }

        System.out.println("\n---- Sorted by Marks (High to Low) ----");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i] + " - " + marks[i]);
        }
    }
}