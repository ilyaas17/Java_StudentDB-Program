import java.util.HashMap;
import java.util.Scanner;


//import Student;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Student> Data = new HashMap<>();


        while(true){
            System.out.println("1. Add Student : ");
            System.out.println("2. View Database : ");
            System.out.println("3. Search Student (Input roll number) : ");
            System.out.println("4. Calculate Average Marks : ");
            System.out.println("5. Exit Loop");

            System.out.println("Enter your choice : ");
            int choice = sc.nextInt();

            switch(choice){
                case 1 :
                    System.out.println("Enter student name : ");
                    String name = sc.next();
                    sc.next();
                    System.out.println("Enter roll number : ");
                    int rollnum = sc.nextInt();
                    System.out.println("Enter age : ");
                    int age = sc.nextInt();
                    System.out.println("Enter marks");
                    float marks = sc.nextFloat();
                    Student dbs = new Student(rollnum, name, age, marks);

                    Student db = new Student(rollnum,name, age, marks);
                    Data.put(rollnum,db);

                    System.out.println("Student added successfully!");
                    break;
                case 2:
                    System.out.println("************LIST************");
                    for(Student i : Data.values()) {
                        i.view();
                    }
                    break;
                case 3:
                    System.out.println("Enter roll number : ");
                    int req = sc.nextInt();
//                    System.out.println(Data.get(req));
                    for(int i : Data.keySet()){
                        if(i==req){
                            System.out.println(Data.get(i).toString());
                        }
                    }
                    System.out.println("*****************************");
                    break;
                case 4:
                    float sum = 0;
                    float count=0;
                    for(int i: Data.keySet()){
                        sum= sum + Data.get(i).marks;
                        count++;
                    }
                    System.out.println("Average marks is "+sum/count);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please enter valid number.");

            }
        }
    }
}