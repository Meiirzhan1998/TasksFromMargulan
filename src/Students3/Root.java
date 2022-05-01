package Students3;

import java.util.List;

public class Root {
    public Root() {

    }

    private List<Students> student;

    public Root(List<Students> student) {
        this.student = student;
    }

    public List<Students> getStudent() {
        return student;
    }

    public void setStudent(List<Students> student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Root{" +
                "students:" + student +
                '}';
    }
}

