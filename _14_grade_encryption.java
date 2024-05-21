public class _14_grade_encryption {
    public static void main(String[] args) {
        char grade = 'A';
        char decryptedGrade = (char)(grade+8);      // (grade+8) returns int so we typecast into char
        System.out.println("The decrypted grade is: "+decryptedGrade);
        char encryptedGrade = (char)(decryptedGrade-8);      // (grade-8) returns int so we typecast into char
        System.out.println("The encrypted grade is: "+encryptedGrade);
    }
}
