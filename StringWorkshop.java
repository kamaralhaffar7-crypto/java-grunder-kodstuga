public class StringWorkshop {
    public static void main(String[] args) {

        // Del 1
        String firstName = "Kamar";
        String lastName = "Al-Haffar";

        String fullName = firstName + " " + lastName;

        System.out.println("Hej! Jag heter " + fullName + ".");
        System.out.println("Mitt namn innehåller " + fullName.length() + " tecken.");

        // Bonus
        String city = "Alingsås";
        String profession = "Mjukvarutestare";

        System.out.println(fullName + " bor i " + city + " och utbildar sig till " + profession + ".");
    }
}
