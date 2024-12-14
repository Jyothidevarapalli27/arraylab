import java.util.ArrayList;
import java.util.Collections;

public class HandsOnArrayListLab {

    ArrayList<String> studentNames = new ArrayList<>();
    public void names () {
        studentNames.add("John");
        studentNames.add("Jane");
        studentNames.add("Bob");
        studentNames.add("Mary");
        studentNames.add("Jack");
        System.out.println("Names: " + studentNames);

        studentNames.remove("John");
        System.out.println("after removing printed studentNames: " + studentNames);

        Collections.sort(studentNames);
        for (String name : studentNames) {
            System.out.println("sorting studentsNames: " + name);
        }

    }

}
