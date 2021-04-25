package com.iluwatar.pac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

/**
 * Application test for not throw.
 */
class AppTest {

  @Test
  void shouldExecuteApplicationWithoutException() {
        assertDoesNotThrow(() -> App.main(new String[]{}));
    }
}