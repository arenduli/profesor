public class Ocijena {

    private Student student;
    private Profesor profesor;
    private int ocijena;

    public Ocijena(Student student, Profesor profesor, int ocijena) throws Exceptions.InvalidGradeException, Exceptions.FacultyMismatchException {
        if (ocijena < 0 || ocijena > 5) {
            throw new Exceptions.InvalidGradeException("Ocijena mora biti između 0 i 5.");
        }
        if (!student.getNazivFakulteta().equals(profesor.getNazivFakulteta())) {
            throw new Exceptions.FacultyMismatchException("Student i profesor moraju pripadati istom fakultetu.");
        }
        this.student = student;
        this.profesor = profesor;
        this.ocijena = ocijena;
    }

    @Override
    public String toString() {
        return student.toString() + "," + profesor.toString() + "," + ocijena;
    }
}
