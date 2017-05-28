package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.*;

@SpringBootApplication
@RestController
public class UiApplication {

    @RequestMapping("/user")
    public Principal user(Principal user) {
        return user;
    }

    @RequestMapping("/resource")
    public Map<String, Object> home() {
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("id", UUID.randomUUID().toString());
        model.put("content", "Hello World");
        return model;
    }

    @RequestMapping("/notes")
    public List<Note> notes() {
        Note note = new Note();
        note.setId(1l);
        note.setUserId(2l);
        note.setCategoryId(3l);
        note.setDescription("des");
        note.setTitle("title");

        List<Note> notes = new ArrayList<>();
        notes.add(note);
        notes.add(note);
        notes.add(note);
        notes.add(note);
        return notes;
    }

    public static void main(String[] args) {
        SpringApplication.run(UiApplication.class, args);
    }


}
