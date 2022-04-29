package JsonStudentsArray;

public class Students {
    private String firstName;
    private String lastName;
    private int age;
    private String speciality;



    public Students(String firstName, String lastName, int age, String speciality) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.speciality = speciality;
    }

    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setlastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", speciality='" + speciality + '\'' +
                '}';
    }
}
