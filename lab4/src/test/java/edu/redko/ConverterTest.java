package edu.redko;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/*
  @author User
  @project lab4
  @class ConverterTest
  @version 1.0.0
  @since 13.04.2025 - 19.44
*/class ConverterTest {

    @org.junit.jupiter.api.Test
    void romanToArabic() {
    }
    @Test
    void given2018Roman_WhenConvertingToArabic_ThenReturn2018() {
        String roman2018 = "MMXVIII";

        int result = Converter.romanToArabic(roman2018);

        assertThat(result).isEqualTo(2018);
    }

    @Test
    void whenInputIsEmpty_thenThrowException() {
        assertThrows(IllegalArgumentException.class, () -> {
            Converter.romanToArabic("");
        });
    }

    @Test
    void whenInputIsInvalidSymbol_thenThrowException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Converter.romanToArabic("ABCD");
        });
        assertTrue(exception.getMessage().contains("cannot be converted"));
    }

    @Test
    void whenInputIsMixedValidAndInvalid_thenThrowException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Converter.romanToArabic("MMXIIIQ");
        });
        assertTrue(exception.getMessage().contains("cannot be converted"));
    }
    @Test
    void whenInputIsLowerCaseInvalid_thenThrowException() {
        assertThrows(IllegalArgumentException.class, () -> {
            Converter.romanToArabic("abcd");
        });
    }
    @Test
    void whenInputHasSpecialCharacters_thenThrowException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Converter.romanToArabic("MM#IV");
        });
        assertTrue(exception.getMessage().contains("cannot be converted"));
    }

    @Test
    void whenInputHasNumbers_thenThrowException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Converter.romanToArabic("XIV123");
        });
        assertTrue(exception.getMessage().contains("cannot be converted"));
    }

    @Test
    void whenInputIsValidWithLowerCase_thenConvertSuccessfully() {
        int result = Converter.romanToArabic("mmxviii");
        assertEquals(2018, result);
    }

    @Test
    void whenInputIsNull_thenThrowException() {
        assertThrows(IllegalArgumentException.class, () -> {
            Converter.romanToArabic(null);
        });
    }

    @Test
    void whenInputIsVeryLongInvalid_thenThrowException() {
        String invalidInput = "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMXYZ";
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Converter.romanToArabic(invalidInput);
        });
        assertTrue(exception.getMessage().contains("cannot be converted"));
    }

}