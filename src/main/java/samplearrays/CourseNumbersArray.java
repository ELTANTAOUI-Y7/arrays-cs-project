package samplearrays;

public class CourseNumbersArray {

    public static void main(String[] args) {
        int[] registeredCourses = {1010, 1020, 2080, 2140, 2150, 2160};

        // Add a new course
        int[] updatedCourses = addCourse(registeredCourses, 2170);

        // Print the updated courses
        printContent(updatedCourses);

        // Check if a course exists
        boolean found = checkCourse(2080, updatedCourses);
        System.out.println("Course 2080 found? " + found);
    }

    public static int[] addCourse(int[] registeredCourses, int newCourse) {
        int[] updatedCourses = new int[registeredCourses.length + 1];
        for (int i = 0; i < registeredCourses.length; i++) {
            updatedCourses[i] = registeredCourses[i];
        }
        updatedCourses[registeredCourses.length] = newCourse;
        return updatedCourses;
    }

    public static boolean checkCourse(int courseNum, int[] updatedCourses) {
        for (int i = 0; i < updatedCourses.length; i++) {
            if (updatedCourses[i] == courseNum) {
                return true;
            }
        }
        return false;
    }

    public static void printContent(int[] updatedCourses) {
        System.out.println("Updated courses:");
        for (int i = 0; i < updatedCourses.length; i++) {
            System.out.println(updatedCourses[i]);
        }
    }
}
