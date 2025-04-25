import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Imenik {

    private List<Ocijena> ocjene = new ArrayList<>();

    public void addGrade(Ocijena ocijena) {
        ocjene.add(ocijena);
    }

    // spremi podatke o ocjenama u tekstualnu datoteku
    public void spremi(String filePath) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Ocijena ocijena : ocjene) {
                writer.write(ocijena.toString());
                writer.newLine();
            }
        }
    }

    public void load(String filePath) throws IOException {
        ocjene.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                Student student = new Student(parts[0], parts[1], parts[2], parts[3], parts[4]);
                Profesor profesor = new Profesor(parts[5], parts[6], parts[7], parts[8]);
                int grade = Integer.parseInt(parts[9]);
                try {
                    ocjene.add(new Ocijena(student, profesor, grade));
                } catch (Exceptions.InvalidGradeException | Exceptions.FacultyMismatchException e) {
                    System.err.println("Error loading grade: " + e.getMessage());
                }
            }
        }
    }

    public List<Ocijena> getOcjene() {
        return ocjene;
    }
}
