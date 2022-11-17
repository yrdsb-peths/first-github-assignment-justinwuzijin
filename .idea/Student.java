public class Student{
    private int grade;
    private String firstName;
    private String lastName;

    public Student(int grade, String firstName, String lastName){
        this.grade = grade;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public static String yea(){
        System.out.println(firstName + lastName + grade);
    }
}