package Assignment5;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

// Deserialization (reconverting the serialized byte stream to an object again)
public class DeserializationTest {
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream("src/Assignment5/Student.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        ArrayList<Student> list = (ArrayList<Student>) objectInputStream.readObject();

        if (list != null)
            for (Student student : list) {
                System.out.println(student);
            }
        fileInputStream.close();
        objectInputStream.close();
    }

}
