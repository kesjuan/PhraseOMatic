public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"aliens","Millions","purple","water", "never", "win","smart", "lose", "mountain"
        };
        String[] wordListTwo = {"powerful", "smooth", "game", "disrespect","leading", "happy", "just", "drunk", "mistaken"
        };
        String[] wordListThree = {"believe", "problem", "worshipped", "everyday", "time", "existence", "regret", "outter space", "mission" };

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threelength = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threelength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        System.out.println("Have you ever heard of a " + phrase + "?");

    }
}
