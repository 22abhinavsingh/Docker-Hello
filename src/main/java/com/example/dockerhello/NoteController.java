
package com.example.dockerhello;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/notes")
public class NoteController {

    private final NoteRepository noteRepository;

    public NoteController(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    @PostMapping
    public Note createNote(@RequestBody Note note) {
        note.setTitle(note.getTitle().trim());
        return noteRepository.save(note);
    }

    @GetMapping
    public List<Note> getAllNotes() {
        return noteRepository.findAll();
    }
}
