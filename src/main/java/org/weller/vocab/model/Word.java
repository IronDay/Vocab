package org.weller.vocab.model;

import java.util.UUID;

public class Word {
    private UUID id;
    private String originalWord;
    private String wordTranslation;
    private String pronunciation;

    public Word(){}

    public Word(UUID id, String originalWord, String wordTranslation, String pronunciation) {
        this.id = id;
        this.originalWord = originalWord;
        this.wordTranslation = wordTranslation;
        this.pronunciation = pronunciation;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getOriginalWord() {
        return originalWord;
    }

    public void setOriginalWord(String originalWord) {
        this.originalWord = originalWord;
    }

    public String getWordTranslation() {
        return wordTranslation;
    }

    public void setWordTranslation(String wordTranslation) {
        this.wordTranslation = wordTranslation;
    }

    public String getPronunciation() {
        return pronunciation;
    }

    public void setPronunciation(String pronunciation) {
        this.pronunciation = pronunciation;
    }
}
