package org.weller.vocab.service;

import org.weller.vocab.model.BookCase;
import org.weller.vocab.model.Vocabulary;
import org.weller.vocab.model.Word;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class VocabularyService {
    private final List<Vocabulary> vocabularies = new ArrayList<>();
   public void AddVocabulary(Vocabulary vocabulary){
      vocabularies.add(vocabulary);
   }

    public void deleteWord(UUID id){
        vocabularies.removeIf((Vocabulary word)->word.getId().equals(id));
    }

    public void updateWord(Vocabulary newVocabulary){
        vocabularies.stream().filter((word)->word.getId().equals(newVocabulary.getId())).map((vocabulary -> new Vocabulary(newVocabulary.getId(),
                newVocabulary.getBookCase(),
                newVocabulary.getName(),
                newVocabulary.getDescription(),
                newVocabulary.getWordsOriginalLanguage(),
                newVocabulary.getWordMeaningLanguage()
                )));
    }
}
