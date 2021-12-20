package Assignment3;

import java.io.*;
import java.util.Scanner;


public class Main {

    // Add Employee
    public static void addNewEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the id of Employee : ");
        int id = scanner.nextInt();

        System.out.println("Enter the Name : ");
        String name = scanner.next();

        System.out.println("Enter the Email : ");
        String email = scanner.next();

        System.out.println("Enter the Age : ");
        int age = scanner.nextInt();

        System.out.println("Enter the Date Of Birth : ");
        String dob = scanner.next();

        Employee emp = new Employee(id, name, email, age, dob);

        try (FileWriter fileWriter = new FileWriter("src/Assignment3/employees.txt", true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(emp.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Delete Employee
//    public static void DeleteEmployee() throws IOException {
//        Scanner scan = new Scanner(System.in);
//        int id = scan.nextInt();
//        File file = new File("src/Assignment3/employees.txt");
//
//        FileWriter fileWriter = new FileWriter("file");
//        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//
//        try(FileReader filereader = new FileReader(file);
//        BufferedReader bufferedReader = new BufferedReader(filereader)){
//
//            String line;
//            while ((line = bufferedReader.readLine())!=null){
//                if(line.contains(String.valueOf(id))){
//                    continue;
//                }
//                bufferedReader.close();
//                file.delete();
//                System.out.println("Deleted Record");
//            }
//        }catch (IOException e){
//            System.out.println("id Not found");
//        }
//
//    }




    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int number;
        while (true) {
            System.out.println("1.Add");
            System.out.println("2.Delete");
            System.out.println("3.Search");
            System.out.println("4.Display");
            System.out.println("5.Exit");
            System.out.println("Enter Options : ");
            number = scan.nextInt();
            switch (number) {
                case 1:
                  addNewEmployee();
                  break;

                case 2:
                    //DeleteEmployee();

            }
        }
    }
}
