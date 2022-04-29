package JsonStudents;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JsonSimpleParser {
    public static void main(String[] args) throws IOException {
        JsonSimpleParser parser = new JsonSimpleParser();
        Root root = parser.parse();
        System.out.println(root.toString());
    }
    private static final String TAG_FIRST_NAME = "firstName";
    private static final String TAG_LAST_NAME = "lastName";
    private static final String TAG_AGE = "age";
    private static final String TAG_SPECIALITY = "speciality";

    public Root parse() throws IOException {
        Root root = new Root();
        JSONParser parser = new JSONParser();

        try (FileReader reader = new FileReader("students.json")) {

            JSONObject rootJsonObject = (JSONObject) parser.parse(reader);
            String firstName = (String) rootJsonObject.get(TAG_FIRST_NAME);
            String lastName = (String) rootJsonObject.get(TAG_LAST_NAME);
            long age = (long) rootJsonObject.get(TAG_AGE);
            String speciality = (String) rootJsonObject.get(TAG_SPECIALITY);

            root.setFirstName(firstName);
            root.setLastName(lastName);
            root.setAge((int) age);
            root.setSpeciality(speciality);

            return root;
        } catch (ParseException | FileNotFoundException e) {
            System.out.println("Parsing error" + e.toString());
        }
        return null;
    }
}
