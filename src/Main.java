import com.sun.tools.internal.xjc.reader.xmlschema.parser.SchemaConstraintChecker;

import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {

        System.out.println("\t\t Welcome to School Apple! \n");

        //Array of Teachers
        Teacher teacher = new Teacher ("Name","L","C",45,"France",342,3);
        Teacher teacher1 = new Teacher ("Name","L","C",35,"English",345,2);
        Teacher teacher2 = new Teacher ("Name","L","C",23,"Russian",357,1);



        //Array of Student
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("Alex", "Zgurschi", "Chisinau", 20, "English"));
        students.add(new Student("Vova", "Ibrahimov", "Chisinau", 20, "France"));
        students.add(new Student("Rodion", "Ronaldo", "Chisinau", 20, "English"));
        students.add(new Student("Artem", "Toshiba", "Chisinau", 20, "France"));
        students.add(new Student("Evghenii", "Alabamov", "Chisinau", 20, "Russian"));

        System.out.println("__________________________________________________________________________________________");

        System.out.println("__________________________________________________________________________________________");
    }
}