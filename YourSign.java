import java.util.Scanner;

public class YourSign {
    public static void main(String[] args) {
        // ask birth month & birth date
        System.out.println("Tell me your birth month (M)");
        Scanner scanner1 = new Scanner(System.in);
        int birthMonth = scanner1.nextInt();

        System.out.println("Tell me your birth date (DD)");
        Scanner scanner = new Scanner(System.in);
        int birthDate = scanner.nextInt();


        // Capricorn or Aquarius
        if (birthMonth == 1) {

            if (birthDate < 20) {
                System.out.println("Your Sign is Capricorn!");
            }else{
                System.out.println("Your Sign is Aquarius!");
            }

        }
        // Aquarius or Pisces
        if (birthMonth == 2) {
            if (birthDate < 19) {
                System.out.println("Your sign is Aquarius!");
            }else{
                    System.out.println("Your sign is Pisces!");
                }
        }
        // Pieces or Aries
        if (birthMonth == 3) {
            if (birthDate < 20) {
                System.out.println("Your sign is Pisces!");
            }else{
                System.out.println("Your sign is Aries!");
            }
        }

        // Aries or Taurus
        if (birthMonth == 4) {
            if (birthDate < 20) {
                System.out.println("Your sign is Aries!");
            }else{
                System.out.println("Your sign is Taurus!");
            }
        }

        // Taurus or Gemini
        if (birthMonth == 5) {
            if (birthDate < 21) {
                System.out.println("Your sign is Taurus!");
            }else{
                System.out.println("Your sign is Gemini!");
            }
        }

        // Gemini or Cancer
        if (birthMonth == 6) {
            if (birthDate < 21) {
                System.out.println("Your sign is Gemini!");
            }else{
                System.out.println("Your sign is Cancer!");
            }
        }

        // Cancer or Leo
        if (birthMonth == 7) {
            if (birthDate < 24) {
                System.out.println("Your sign is Cancer!");
            }else{
                System.out.println("Your sign is Leo!");
            }
        }

        // Leo or Virgo
        if (birthMonth == 8) {
            if (birthDate < 23) {
            System.out.println("Your sign is Leo!");
            }else {
                System.out.println("Your sign is Virgo!");
            }
        }

        // Virgo or Libra
        if (birthMonth == 9) {
            if (birthDate < 23) {
                System.out.println("Your sign is Virgo!");
            }else{
                System.out.println("Your sign is Libra!");
            }
        }

        // Libra or Scorpio
        if (birthMonth == 10) {
            if (birthDate < 23) {
                System.out.println("Your sign is Libra!");
            }else{
                System.out.println("Your sign is Scorpio!");
            }
        }

        // Scorpio or Sagittarius
        if (birthMonth == 11) {
            if (birthDate < 22) {
                System.out.println("Your sign is Scorpio!");
            }else{
                System.out.println("Your sign is Sagittarius!");
            }
        }

        // Sagittarius or Capricorn
        if (birthMonth == 12) {
            if (birthDate < 22) {
                System.out.println("Your sign is Sagittarius!");
            }else {
                System.out.println("Your sign is Capricorn!");
            }
        }
    }

}
