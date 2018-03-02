import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;
import java.util.Random;

public class School {
    private HashMap<String, ArrayList<Teacher>> hm = new  HashMap<String, ArrayList<Teacher>>();

    public void addTeacher(String pain, Teacher teacher){
        if(hm.get (pain) == null){
            ArrayList<Teacher> newList = new ArrayList<Teacher>();
            newList.add(teacher);
            hm.put(pain, newList);
        } else {
            hm.get(pain).add(teacher);
        }
    }

    public Teacher getTeacherForIllness(String illness) {
        ArrayList<Teacher> teachers = hm.get(illness);
        if (teachers == null) {
            return null;
        } else{
            Random rnd = new Random(System.currentTimeMillis());
            int index = Math.abs(rnd.nextInt() % teachers.size());
            return teachers.get(index);
        }
    }

    @Override
    public String toString() {
        String res = "";

        for (String illness: hm.keySet()) {
            ArrayList<Teacher> teachers = hm.get(illness);
            res += illness + '\n';
            for (Teacher d : teachers) {
                res += "\t" + d;
            }
            res += '\n';
        }

        return res;
    }
}
