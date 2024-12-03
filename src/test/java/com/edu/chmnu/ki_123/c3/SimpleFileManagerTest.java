package com.edu.chmnu.ki_123.c3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;

class SimpleFileManagerTest {
    private static final String DIRECTORY_PATH = "C:/Users/dcher/Documents/Java/java-SimpleFileManager";
    private static final String FILE_NAME = "testFile.txt";
    private static File file;

    @BeforeEach
    void setUp() {
        file = new File(DIRECTORY_PATH + "/" + FILE_NAME);
    }

    @Test
    void testFileCreation() throws IOException {
        if (file.exists()) {
            assertTrue(file.delete(), "The file should have been deleted before the test.");
        }

        assertTrue(file.createNewFile(), "File not created.");
        assertTrue(file.exists(), "File does not exist after creation.");
    }

    @Test
    void testFileDeletion() throws IOException {
        if (!file.exists()) {
            assertTrue(file.createNewFile(), "The file should have been created before the test.");
        }

        assertTrue(file.delete(), "File not deleted.");
        assertFalse(file.exists(), "File still exists after deletion.");
    }

    @AfterEach
    void tearDown() {
        if (file.exists()) {
            assertTrue(file.delete(), "Unable to delete file after test.");
        }
    }
}