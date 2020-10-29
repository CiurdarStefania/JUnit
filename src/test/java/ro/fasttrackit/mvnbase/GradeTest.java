package ro.fasttrackit.mvnbase;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class GradeTest {
    private Grade grade;

    @BeforeEach
    void setup() {
        grade = new Grade();
    }

    @Test
    @DisplayName("Din grade Fahrenheit in grade Celsius ")
    void gradeFahrenheitInCelsius() {
        //SETUP
        var result = grade. fahrenheitToCelsius(100.0000000004);
        assertThat(result).isEqualTo(37.777777778);

    }
        @Test
        @DisplayName("Din grade Celsius in grade Fahrenheit")
        void gradeCelsiusInFahrenheit() {
        //SETUP
        var result = grade.celsiusToFahrenheit(37.777777778);
            assertThat(result).isEqualTo(100.0000000004);

        }


    }
