public class Exceptions {

    public static class InvalidGradeException extends Exception {
        public InvalidGradeException(String message) {
            super(message);
        }
    }

    public static class FacultyMismatchException extends Exception {
        public FacultyMismatchException(String message) {
            super(message);
        }
    }
}
