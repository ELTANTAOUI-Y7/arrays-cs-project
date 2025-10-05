package samplearrays;
import java.util.Arrays;
import java.util.Comparator;

public class ManageStudent {

    // 2) Find the Oldest Student
    public static Student findOldest(Student[] students) {
        Student oldest= null;
        for (Student s: students){
            if (s.getAge() > oldest.getAge()){
                oldest=s;
            }
        }
        return oldest;
    }

    // 3) Count Adult Students (age >= 18)
    public static int countAdults(Student[] students) {
        int CounterAdult= 0 ;
        for (Student s: students){
            if(s.isAdult()){
                CounterAdult++;
            }}
        return CounterAdult;

    }

    // 4) Average Grade (returns NaN if no students or grades)
    public static double averageGrade(Student[] students) {
        double sum =0;
        double gradeavg;
        for (Student s: students ){
            sum+=s.getGrade();
        }
        gradeavg = (double) sum / students.length;
        return  gradeavg;
    }

    // 5) Search by Name (case-sensitive; change to equalsIgnoreCase if desired)
    public static Student findStudentByName(Student[] students, String name) {
        for(Student s : students){
            if(s.getName()==name){
                return s;
            }
        }
        return null;
    }

    // 6) Sort Students by Grade (descending)
       public static void sortByGradeDesc(Student[] students) {
            // Simple Bubble Sort
            for (int i = 0; i < students.length - 1; i++) {
                for (int j = 0; j < students.length - i - 1; j++) {
                    if (students[j].getGrade() < students[j + 1].getGrade()) {
                        // swap
                        Student temp = students[j];
                        students[j] = students[j + 1];
                        students[j + 1] = temp;
                    }
                }
            }
        }


    // 7) Print High Achievers (grade >= 15)
    public static void printHighAchievers(Student[] students) {
        for(Student s : students ){
            if (s.getGrade() >= 15){
                System.out.println(s.getName() + " Has grade greater than 15. ");
            }
        }

    }

    // 8) Update Student Grade by id
    public static boolean updateGrade(Student[] students, int id, int newGrade) {
        for( Student s: students){
            if(s.getId()== id){
                s.setGrade(newGrade);
                return true;
            }
        }
        return false;

    }

    // 9) Find Duplicate Names
    public static boolean hasDuplicateNames(Student[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if (students[i].getName().equals(students[j].getName())) {
                    return true; // found a duplicate
                }
            }
        }
        return false; // no duplicates found
    }


    // 10) Expandable Array: return a new array with one more slot and append student
    public static Student[] appendStudent(Student[] students, Student newStudent) {
        // Create a new array with one extra slot
        Student[] newArray = new Student[students.length + 1];

        // Copy existing students to the new array
        for (int i = 0; i < students.length; i++) {
            newArray[i] = students[i];
        }

        // Add the new student at the last index
        newArray[students.length] = newStudent;

        return newArray; // return the new array
    }


    // 1) Create an Array of Students + demos for all tasks
    public static void main(String[] args) {
        // Create & initialize array of 5 students
        Student[] arr={new Student(1543,"Omar",22),new Student(2163, "Yahya"), new Student(2653,"Mohamed",23,14),new Student(2253, "Ayoub"),new Student(1533,"Hamza",24)};

        // Print all
        System.out.println("== All Students ==");
        for (Student s : arr) {
            System.out.println(s.toString());
        }
        System.out.println("Total created: " + Student.getNumStudent());

        // 2) Oldest


        // 3) Count adults


        // 4) Average grade


        // 5) Find by name


        // 6) Sort by grade desc
        // sort function
        System.out.println("\n== Sorted by grade (desc) ==");
        for (Student s : arr) System.out.println(s);

        // 7) High achievers >= 15
        System.out.println("\nHigh achievers:");
        printHighAchievers(arr);

        // 8) Update grade by id
        // function
        System.out.println("\nUpdated id=4? " + updated);
        System.out.println(findStudentByName(arr, "Dina"));

        // 9) Duplicate names


        // 10) Append new student

    }
}

