package com.kodilla.exception.io;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReader {
    public void readFile() {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("File/names.txt").getFile());
        Path path = Paths.get(file.getPath());
        try {
            Stream<String> fileLines = Files.lines(path);
        } catch (IOException e) {
            System.out.println("OH NO ERROR ERROR !!!!");
        }
    }
}
