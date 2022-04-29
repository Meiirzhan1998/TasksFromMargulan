package JsonStudentsArray;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        JsonSimpleParser parser = new JsonSimpleParser();
        Root root = parser.parse();
        System.out.println(root.toString());
    }
}