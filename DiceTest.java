public class DiceTest {
    static double dice;
    static void Roll() {
        dice = Math.floor(Math.random() *(6 - 1 + 1) + 1);
        System.out.println("Dice: " + dice);
    }
    
    
    public static void main(String[] args) {
        var one = 0;
        var two = 0;
        var three = 0;
        var four = 0;
        var five = 0;
        var six = 0;
    
        var testCounter = 0;
        while (testCounter < 1000) {
            Roll();
            switch ((int) dice) {
                case 1 -> one++;
                case 2 -> two++;
                case 3 -> three++;
                case 4 -> four++;
                case 5 -> five++;
                case 6 -> six++;
            }
            testCounter = testCounter + 1;
        }
        System.out.println("The dice rolled 1, " + one + " times.");
        System.out.println("The dice rolled 2, " + two + " times.");
        System.out.println("The dice rolled 3, " + three + " times.");
        System.out.println("The dice rolled 4, " + four + " times.");
        System.out.println("The dice rolled 5, " + five + " times.");
        System.out.println("The dice rolled 6, " + six + " times.");
    }
}
