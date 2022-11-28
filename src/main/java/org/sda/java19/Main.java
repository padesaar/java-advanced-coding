package org.sda.java19;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * //Exercise
 * //3. Personal information
 * //a. Create a file containing any personal data (name, surname, phone number). Data of individual persons should be in the following lines.
 * //b. Download data from a file and create objects of people based on them (in any way - Regex, String.split ...).
 * //c. Enter the created objects into ArrayList or Map (<line number>: <Person>).
 * //d. Present the obtained data.
 *
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {


        // Download data from a file and create objects of people based on them
        Path personPath = Paths.get("C:\\Users\\37253\\java-advanced-coding\\src\\main\\resources\\data.txt");


        try {
            List<String> fileLines = Files.readAllLines(personPath, StandardCharsets.UTF_8);

            for (String fileLine : fileLines) {
                String[] personData = fileLine.split(", ");

                Person person = new Person();
                person.setFirstName(personData[0]);
                person.setLastName(personData[1]);
                person.setPhoneNumber(personData[2]);
                person.setAge(convertStringToInt(personData[3]));
                person.setEmail(personData[4]);

                System.out.println(person);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Enter the created objects into ArrayList or Map (<line number>: <Person>).
        Scanner scanner = new Scanner(new FileReader("C:\\Users\\37253\\java-advanced-coding\\src\\main\\resources\\data.txt"));

        HashMap<String, String> map = new HashMap<String, String>();
        int lineNumber = 1;
        while (scanner.hasNextLine()) {
            String[] columns = scanner.nextLine().split(", ");
            map.put(String.valueOf(lineNumber), columns[0]);
            lineNumber++;
        }
        System.out.println(map);
    }

    private static Integer convertStringToInt(String numberStr) {
        try {
            return Integer.parseInt(numberStr);
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
            return 0;
        }
    }

    }
