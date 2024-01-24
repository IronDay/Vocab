package org.weller.vocab.service;

import org.weller.vocab.model.BookCase;
import org.weller.vocab.model.Vocabulary;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class BookCaseService {
    private final List<BookCase> bookCases = new ArrayList<>();
    public void AddBookCase(BookCase bookCase){
        bookCases.add(bookCase);
    }

    public void deleteBookCase(UUID id){
        bookCases.removeIf((BookCase bookCase)->bookCase.getId().equals(id));
    }

    public void updateWord(BookCase bookCase){
        bookCases.stream().filter((bookCSE)->bookCSE.getId().equals(bookCase.getId())).map((bookCSE -> new BookCase(
                bookCSE.getId(),
                bookCSE.getVocabularies()
        )));
    }
}
