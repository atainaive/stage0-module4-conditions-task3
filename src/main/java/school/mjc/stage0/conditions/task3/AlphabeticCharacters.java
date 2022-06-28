package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')) {
            if ("aeiou".indexOf(character) < 0 || "AEIOU".indexOf(character) < 0) {
                System.out.println("Consonant");
            } else {
                System.out.println("Vowel");
            }
        } else {
            System.out.println("wrong alphabet!");
        }
    }
}
