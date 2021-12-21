package Assignment5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializationTest {
    public static void main(String[] args) throws IOException {

        //constructs four different Student objects
        Address address1 = new Address("Betul","MadhyaPradesh",460110,"India");
        Student student1 = new Student("Aparna","28/08/1998", address1);

        Address address2 = new Address("Ujjain","MadhyaPradesh",470220,"India");
        Student student2 = new Student("Arya","03/02/1995",address2);

        Address address3 = new Address("Indore","MadhyaPradesh",260118,"India");
        Student student3 = new Student("Adarsh","21/01/1996",address3);

        Address address4 = new Address("Bhopal","MadhyaPradesh",602398,"India");
        Student student4 = new Student("Neha","01/10/1994",address4);

        // Student records added in list
        ArrayList<Student> list= new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);

        //Serialization
        FileOutputStream fileOutputStream = new FileOutputStream("Student.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(list);

        fileOutputStream.close();
        objectOutputStream.close();

    }
}
