public class FormLetterWriter {
    static String businessLetter = " Thank you for your recent order";
    public static void main(String[] args) {
        displaySalutation("Doe");
        displaySalutation("Jill", "Doe");
    }

    private static void displaySalutation(String lastName) {
        System.out.println("Dear Mr. or Ms. " + lastName + businessLetter);
    }

    private  static  void displaySalutation(String firstName, String lastName) {
        System.out.println("Dear " + firstName + " " + lastName + businessLetter);
    }
}
