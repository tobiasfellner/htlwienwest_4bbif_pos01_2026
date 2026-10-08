public class WithoutObjects {
    public static void main(String[] args) {
//        String[] students = {"S1", "S2", "S3", "S4", "S5", "S6"};
//        int[] grades = {3,2,1,4,5};
//
//        System.out.printf("Student %s hat Note %d.%n", students[2], grades[2]);
//        System.out.printf("Student %s hat Note %d.%n", students[5], grades[5]);

        Student s1 = new Student("S1", 3);

        System.out.printf("Student %s hat Note %d.%n", s1.name, s1.grade);

        Student s2 = new Student("S2", 4);
        s2.grade = 5;

        System.out.printf("Student %s hat Note %d.%n", s2.name, s2.grade);

        Student s3 = new Student("S3", 3);
    }
}
