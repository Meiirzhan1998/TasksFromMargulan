package Students3;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonSimpleParser implements DocumentParser {
    public Root parse() {
        Root root = new Root();
        JSONParser parser = new JSONParser();

        try (FileReader reader = new FileReader("students3.json")) {

            JSONObject rootJsonObject = (JSONObject) parser.parse(reader);
            JSONArray studentsJsonArray = (JSONArray) rootJsonObject.get("students");
            List<Students> studentsList = new ArrayList<>();

            for (Object it : studentsJsonArray) {
                JSONObject studentsJsonObject = (JSONObject) it;

                String firstName = (String) studentsJsonObject.get("firstName");
                String lastName = (String) studentsJsonObject.get("lastName");
                long age = (long) studentsJsonObject.get("age");
                String speciality = (String) studentsJsonObject.get("speciality");
                List<Courses> courses = (List<Courses>) studentsJsonObject.get("courses");

                Students student = new Students(firstName, lastName, (int) age, speciality, courses);
                studentsList.add(student);
            }


            root.setStudent(studentsList);


            return root;
        } catch (ParseException | FileNotFoundException e) {
            System.out.println("Parsing error" + e.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
