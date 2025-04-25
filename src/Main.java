import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            Student student1 = new Student("Pero", "Perić", "12345678947", "98765432143", "PMF");
            Student student2 = new Student("Ivana", "Ivić", "98765432123", "12345678945", "Medicinski fakultet");
            Profesor profesor1 = new Profesor("Marko", "Marić", "11122233223", "PMF");
            Profesor profesor2 = new Profesor("Tena", "Tenić", "44455566677", "Medicinski fakultet");

            Imenik imenik = new Imenik();

            imenik.addGrade(new Ocijena(student1, profesor1, 5));
//            imenik.addGrade(new Ocijena(student2, profesor1, 4));
//            imenik.addGrade(new Ocijena(student1, profesor2, 3));
            imenik.addGrade(new Ocijena(student2, profesor2, 4));

            String filePath = "src/ocjene.txt";
            imenik.spremi(filePath);

            Imenik newImenik = new Imenik();
            newImenik.load(filePath);

            for (Ocijena ocijena : newImenik.getOcjene()) {
                System.out.println(ocijena);
            }
        } catch (Exceptions.InvalidGradeException | Exceptions.FacultyMismatchException | IOException e) {
            System.err.println("Greška: " + e.getMessage());
        }
    }
}
