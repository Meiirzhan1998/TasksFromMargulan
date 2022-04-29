package JsonStudents;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JsonSimpleParser implements DocumentParser{
    public Root parse() {
        Root root = new Root();
        JSONParser parser = new JSONParser();

        try (FileReader reader = new FileReader("students.json")) {

            JSONObject rootJsonObject = (JSONObject) parser.parse(reader);
            String firstName = (String) rootJsonObject.get("firstName");
            String lastName = (String) rootJsonObject.get("lastName");
            long age = (long) rootJsonObject.get("age");
            String speciality = (String) rootJsonObject.get("speciality");

            root.setfirstName(firstName);
            root.setlastName(lastName);
            root.setAge((int) age);
            root.setSpeciality(speciality);

            return root;
        } catch (ParseException | FileNotFoundException e) {
            System.out.println("Parsing error" + e.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
