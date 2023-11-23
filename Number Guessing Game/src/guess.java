import javax.swing.*;


public class guess {
    public static void main(String[] args) {
        int compute = (int) (Math.random() * 100 + 1);
        int user = 0;

//        System.out.println("The Correct Guess Would be " + compute);

        int count = 1;
        while(user != compute) {
            String response = JOptionPane.showInputDialog(null, "Enter a guess between " +
                    "1 and 100", "Guessing game", JOptionPane.QUESTION_MESSAGE);
            user = Integer.parseInt(response);
            JOptionPane.showMessageDialog(null,  " " + determine(user, compute, count));
            count++;
        }
    }

    private static String determine(int user, int compute, int count) {
        if(user <= 0 || user > 100) {
            return "your input is invalid" + " please Enter Number in the range of 1 - 100.";
        }
        else if(user == compute) {
            return "your guess is correct" + "\n" + "total no. of guess: " + count;
        }
        else if(user > compute) {
            return "your guess is too high";
        }

        else{
            return "your guess is too low";
        }
    }
}
