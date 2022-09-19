package Task10;

import java.util.ArrayList;

public class Operations {
    static FileJob fileJob = new FileJob();
    static PeopleList peopleList = fileJob.read();
    ArrayList<Person> workList = peopleList.getArrayList();

    public String reading() {
        return workList.toString();
    }

    public String remove(int id) {
        String check = "No element was found";
        for (Person p : workList) {
            if (p.getId() == id) {
                workList.remove(p);
                check = "found and removed";
            }
        }
        saveToFile();
        return check;
    }

    public void writing(String name, String surname, int age, int id) {
        workList.add(new Person(name, surname, age, id));
        saveToFile();
        System.out.println("Done");
    }

    public void saveToFile() {
        peopleList.setArrayList(workList);
        fileJob.writeIn(peopleList);
    }

}
