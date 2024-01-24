package org.weller.vocab.service;

import org.weller.vocab.model.Word;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class WordService {

    private final List<Word> words = new ArrayList<>();
    public void AddWord(Word word){
        words.add(word);
    }

    public void deleteWord(UUID id){
        words.removeIf((Word word)->word.getId().equals(id));
    }

    public void updateWord(Word newWord){
       words.stream().filter((word)->word.getId().equals(newWord.getId())).map((word -> {
           return new Word(newWord.getId(),
                   newWord.getOriginalWord(),
                   newWord.getWordTranslation(),
                   newWord.getPronunciation());
       }));
    }
}
