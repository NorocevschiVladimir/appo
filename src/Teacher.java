public class Teacher extends People{

    private String nameobject;
    private int salary;
    private int clas;

    Teacher(String name, String lastname, String city, int age, String nameobject, int salary, int clas) {
        super(name, lastname, city, age);
        this.nameobject = nameobject;
        this.salary = salary;
        this.clas = clas;
    }


    public String getNameobject() {
        return nameobject;
    }

    public void setNameobject(String nameobject) {
        this.nameobject = nameobject;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getClas() {
        return clas;
    }

    public void setClas(int clas) {
        this.clas = clas;
    }

    //incapsulation - 1
    @Override
    public String toString() {
        return "Teacher:  " + getName() + " " + getLastname() + " Name Object: " +  nameobject + "  " + "city: " + getCity() + " " + "Classes: " + clas +" " + "salary " + salary  + "$ " + "age "  + getAge() + " years";
    }

    //methods
    public void help (String Profil){
        System.out.println("You are welcome to work!");
    }

    @Override
    public void speak(String text1) {
        super.speak(text1);
        System.out.println("\tWelcome to our school!)");
    }

}
