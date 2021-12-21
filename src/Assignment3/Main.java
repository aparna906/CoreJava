package Assignment3;

import java.io.*;
import java.util.Scanner;


public class Main {

    // Add Employee details
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

        try (FileWriter fileWriter = new FileWriter("src/Assignment3/employees.txt", true); BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(emp.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Search Employee
    public static void searchEmployee() throws IOException {
        File file = new File("src/Assignment3/employees.txt");
        try (FileReader filereader = new FileReader(file); BufferedReader bufferedReader = new BufferedReader(filereader)) {
            System.out.println("Enter Employee id to Search:");
            Scanner scan = new Scanner(System.in);
            int id = scan.nextInt();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains(String.valueOf(id))) {
                    System.out.println(line);
                }
            }
            System.out.println("Id not found");
        }
    }


    //Display Employee Details
    public static void displayEmployee() {
        try (FileReader fileReader = new FileReader("src/Assignment3/employees.txt"); BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Delete employee
    public static void deleteEmployee() throws IOException {
        Scanner scan = new Scanner(System.in);
        int id = scan.nextInt();
        File file = new File("src/Assignment3/employees.txt");
        File temp = new File("src/Assignment3/text.txt");

        FileWriter fileWriter = new FileWriter(temp);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        try (FileReader filereader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(filereader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains(String.valueOf(id))) {
                    System.out.println("Deleted Record");
                    continue;
                }
                bufferedWriter.write(line);
            }
            bufferedWriter.close();
            file.delete();
            temp.renameTo(file);
        } catch (IOException e) {
            System.out.println("Unsuccessful...Try again");
        }
    }


    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int number;
        while (true) {
            System.out.println("1.Add");
            System.out.println("2.Search");
            System.out.println("3.Display");
            System.out.println("4.Delete");
            System.out.println("5.Exit");
            System.out.println("Enter Options : ");
            number = scan.nextInt();
            switch (number) {
                case 1:
                    addNewEmployee();
                    break;

                case 2:
                    searchEmployee();
                    break;

                case 3:
                    displayEmployee();
                    break;
                case 4:
                    deleteEmployee();
                    break;
                case 5:
                    System.exit(0);

            }
        }
    }
}
