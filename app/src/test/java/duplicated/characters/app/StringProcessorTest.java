package duplicated.characters.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class StringProcessorTest {

    @Test
    public void givenStandardString_whenRemoveDuplicates_thenNoDuplicates() {
        // Given
        String input = "AABBCCD112233";

        // When
        String result = StringProcessor.removeDuplicates(input);

        // Then
        assertEquals("ABCD123", result);
    }

    @Test
    public void givenEmptyString_whenRemoveDuplicates_thenEmptyString() {
        // Given
        String input = "";

        // When
        String result = StringProcessor.removeDuplicates(input);

        // Then
        assertEquals("", result);
    }

    @Test
    public void givenUniqueCharactersString_whenRemoveDuplicates_thenSameString() {
        // Given
        String input = "abc123";

        // When
        String result = StringProcessor.removeDuplicates(input);

        // Then
        assertEquals("abc123", result);
    }

    @Test
    public void givenAllSameCharactersString_whenRemoveDuplicates_thenSingleCharacter() {
        // Given
        String input = "aaaa";

        // When
        String result = StringProcessor.removeDuplicates(input);

        // Then
        assertEquals("a", result);
    }


    @Test
    public void givenNullString_whenRemoveDuplicates_thenNull() {
        // Given
        String input = null;

        // When
        String result = StringProcessor.removeDuplicates(input);

        // Then
        assertNull(result);
    }

}
