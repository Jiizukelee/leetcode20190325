import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueMorseRepresentationsTest {

    @Test
    void uniqueMorseRepresentations() {
        UniqueMorseRepresentations uniqueMorseRepresentations =new UniqueMorseRepresentations();
        String[] words = new String[]{"gihn", "zefgn", "gifg", "mfhsg"};
        uniqueMorseRepresentations.uniqueMorseRepresentations(words);
    }
}