package Practice_Questions;

public class HighSchool {
    static class Student
    {
        String name;
        int age;
    }
    String gender;
    String bloodGroup;
}
class Teacher extends HighSchool
{
    int salary;
    String subject;
}

class CollegeStudent extends HighSchool.Student
{
    int year;
    String branch;
}

class Test
{
    public static void main(String[] args) {

    }
}