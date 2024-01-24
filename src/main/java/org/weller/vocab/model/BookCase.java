package org.weller.vocab.model;

import java.util.List;
import java.util.UUID;

public class BookCase {
    private UUID id;
    private List<Vocabulary> vocabularies;

    public BookCase(UUID id, List<Vocabulary> vocabularies) {
        this.id = id;
        this.vocabularies = vocabularies;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public List<Vocabulary> getVocabularies() {
        return vocabularies;
    }

    public void setVocabularies(List<Vocabulary> vocabularies) {
        this.vocabularies = vocabularies;
    }
}
