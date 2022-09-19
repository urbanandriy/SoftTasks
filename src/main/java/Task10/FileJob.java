package Task10;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileJob {
    public void writeIn(PeopleList peopleList) {
        try (Writer writer = new FileWriter("C:\\Users\\aurba\\IdeaProjects\\FirstTasks\\src\\main\\java\\Task10\\Persons.json")) {
            Gson gson = new GsonBuilder().create();
            gson.toJson(peopleList, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public PeopleList read() {
        try (FileReader reader = new FileReader("C:\\Users\\aurba\\IdeaProjects\\FirstTasks\\src\\main\\java\\Task10\\Persons.json")) {
            Gson gson = new Gson();
            return gson.fromJson(reader, PeopleList.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        PeopleList peopleList = new PeopleList();
        FileJob fileJob = new FileJob();
        ArrayList<Person> arrayList = new ArrayList<>(List.of(new Person("Tom", "Kruzz", 54, 1)));
        peopleList.setArrayList(arrayList);
        fileJob.writeIn(peopleList);

    }
}
