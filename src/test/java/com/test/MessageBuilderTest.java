package com.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessageBuilderTest {

    @Test
    void testName() {
        MessageBuilder messageBuilder = new MessageBuilder();
        assertEquals("Hello Test", messageBuilder.getMessage("Test"));
    }

    @Test
    void testNameEmpty() {
        MessageBuilder messageBuilder = new MessageBuilder();
        assertEquals("Please provide a name!", messageBuilder.getMessage(""));
    }

    @Test
    void testNameNull() {
        MessageBuilder messageBuilder = new MessageBuilder();
        assertEquals("Please provide a name!", messageBuilder.getMessage(null));
    }
}