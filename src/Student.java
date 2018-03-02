import java.util.Scanner;


public class Student extends People {
    public String language;

    public Student(String name, String lastname, String city, int age, String language) {
        super(name, lastname, city, age);
        this.language = language;
    }
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Student {" + "Language: " + language +  '\'' + ", name='" + getName() + '\'' + ", last name='"
                + getLastname() + "', city='" + getCity() + "', age=" + getAge() + '}';
    }

    @Override
    public void speak(String text1) {
        super.speak(text1);
        System.out.println("I wanna join group for study!");
    }

}