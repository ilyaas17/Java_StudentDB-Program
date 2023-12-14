public class Student {

    int rollnum;
    String name;
    int age;
    float marks;

    public Student(int rollnum, String name, int age, float marks){
        this.rollnum=rollnum;
        this.name=name;
        this.age=age;
        this.marks=marks;
    }
    public void view(){
        System.out.println("Name : "+name);
        System.out.println("Roll Number :"+rollnum);
        System.out.println("Age : "+age);
        System.out.println("Marks : "+marks);
    }




}
