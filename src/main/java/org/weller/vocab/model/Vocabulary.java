package org.weller.vocab.model;

import java.util.UUID;


public class Vocabulary {
    private UUID id;
    private BookCase bookCase;
    private String name;
    private String description;
    private String wordsOriginalLanguage;
    private String wordMeaningLanguage;

    public Vocabulary(UUID id, BookCase bookCase,
                      String name, String description,
                      String wordsOriginalLanguage,
                      String wordMeaningLanguage) {
        this.id = id;
        this.bookCase = bookCase;
        this.name = name;
        this.description = description;
        this.wordsOriginalLanguage = wordsOriginalLanguage;
        this.wordMeaningLanguage = wordMeaningLanguage;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public BookCase getBookCase() {
        return bookCase;
    }

    public void setBookCase(BookCase bookCase) {
        this.bookCase = bookCase;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWordsOriginalLanguage() {
        return wordsOriginalLanguage;
    }

    public void setWordsOriginalLanguage(String wordsOriginalLanguage) {
        this.wordsOriginalLanguage = wordsOriginalLanguage;
    }

    public String getWordMeaningLanguage() {
        return wordMeaningLanguage;
    }

    public void setWordMeaningLanguage(String wordMeaningLanguage) {
        this.wordMeaningLanguage = wordMeaningLanguage;
    }
}
