import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;
import java.util.Random;

public class School {
    private HashMap<String, ArrayList<School>> hm = new  HashMap<String, ArrayList<School>>();

    public void addDoctor(String pain, School school){
        if(hm.get (pain) == null){
            ArrayList<School> newList = new ArrayList<School>();
            newList.add(school);
            hm.put(pain, newList);
        } else {
            hm.get(pain).add(school);
        }
    }


    @Override
    public String toString() {
        return "School{" +
                "hm=" + hm +
                '}';
    }
}
