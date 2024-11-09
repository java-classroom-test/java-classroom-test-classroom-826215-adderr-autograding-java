package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

public class TestCalculator {

    @Test
    @DisplayName("Add tow Numbers")
    void testAdd1() {
        Calculator c = new Calculator();
        int res = c.add(5, 3);
        assert res == 8;
    }

    @Test
    @DisplayName("Add tow Numbers")
    void testAdd2() {
        Calculator c = new Calculator();
        int res = c.add(-5, -3);
        assert res == -8;
    }


    @Test
    @DisplayName("Substrate tow Numbers")
    void testMinus1() {
        Calculator c = new Calculator();
        int res = c.minus(5, 3);
        assert res == 2;
    }


    @Test
    @DisplayName("Substrate tow Numbers")
    void testMinus2() {
        Calculator c = new Calculator();
        int res = c.minus(5, 3);
        assert res == 2;
    }
}
