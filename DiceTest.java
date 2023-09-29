public class DiceTest {
    static double dice1;
    static double dice2;
    static double diceSum;
    static void Roll() {
        dice1 = Math.floor(Math.random() *(6 - 1 + 1) + 1);
        dice2 = Math.floor(Math.random() *(6 - 1 + 1) + 1);
        diceSum = dice1 + dice2;
        System.out.println("Dice 1:   " + (int) dice1 + "\nDice 2:   " + (int) dice2 + "\nDice sum:   " + (int) diceSum);
    }
    
    
    public static void main(String[] args) {
        var two = 0;
        var three = 0;
        var four = 0;
        var five = 0;
        var six = 0;
        var seven = 0;
        var eight = 0;
        var nine = 0;
        var ten = 0;
        var eleven = 0;
        var twelve = 0;
        var equal = 0;
    
        var testCounter = 0;
        while (testCounter < 1000) {
            Roll();
            if (dice1 == dice2) {
                equal = equal + 1;
            } 
            switch ((int) diceSum) {
            case 2 -> two++;
            case 3 -> three++;
            case 4 -> four++;
            case 5 -> five++;
            case 6 -> six++;
            case 7 -> seven++;
            case 8 -> eight++;
            case 9 -> nine++;
            case 10 -> ten++;
            case 11 -> eleven++;
            case 12 -> twelve++; 
            }
            testCounter = testCounter + 1;
        }
        System.out.println("The dice rolled a sum of 2, " + two + " times.");
        System.out.println("The dice rolled a sum of 3, " + three + " times.");
        System.out.println("The dice rolled a sum of 4, " + four + " times.");
        System.out.println("The dice rolled a sum of 5, " + five + " times.");
        System.out.println("The dice rolled a sum of 6, " + six + " times.");
        System.out.println("The dice rolled a sum of 7, " + seven + " times.");
        System.out.println("The dice rolled a sum of 8, " + eight + " times.");
        System.out.println("The dice rolled a sum of 9, " + nine + " times.");
        System.out.println("The dice rolled a sum of 10, " + ten + " times.");
        System.out.println("The dice rolled a sum of 11, " + eleven + " times.");
        System.out.println("The dice rolled a sum of 12, " + twelve + " times.");
        System.out.println("The dice rolled two equals, " + equal + " times.");
    }
}
