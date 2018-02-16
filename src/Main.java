import java.util.ArrayList;

public class Main {
    public static void main (String[] args){

        System.out.println("\t\t Welcome to School Apple! \n");

        //Array of Teachers
        ArrayList<Teacher> teachers = new ArrayList();
        teachers.add(new Teacher("Radov","Sergey","Chisinau",20,"English",7500,1));
        teachers.add(new Teacher("Vladimir","Asus","Chisinau",24,"France",9000,2));
        teachers.add(new Teacher("Evghenii","Dell","Chisinau",30,"Deutech",13000,3));

        //Array of Student
        ArrayList<Student> students = new ArrayList<Student>();
//        students.add(new Student("Alex"));

        System.out.println("______________________________________________________________________________________");
        teachers.forEach((d) -> {
            System.out.println(d);
            d.speak(" ");
            d.help(" ");
            System.out.println("_________________________________________________________________________________________");
        });

        System.out.println("_______________________________________________________________________________________");

        students.forEach((Student d) -> {
            System.out.println(d);
//            d.pain();
//            d.state();

        });

    }
}
