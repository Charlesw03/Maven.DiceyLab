import java.util.Random;

public class Dice {


    /// creating a variable called number of dice as  a Integer class not prim data
    private Integer numberOfDice;

    //number of dice is referring to the above variable and


    public Dice(Integer numberOfDice){
        this.numberOfDice = numberOfDice;
    }
        //getter intellij made

    public Integer getNumberOfDice(){
        return numberOfDice;
    }
        // setter intellij made

    public void setNumberOfDice(Integer numberOfDice) {
        this.numberOfDice = numberOfDice;

    }

       public Integer rollDice(){
        //creating a random number from random class
        Random random = new Random();
            Integer dice1 = random.nextInt(6) + 1;
            Integer dice2 = random.nextInt(6) + 1;



           return  dice1 + dice2; //random.nextInt(6) + 1 ;


       }
        public Integer sumNToss(){
        Integer sum = 0;
            for (int i = 0; i < numberOfDice ; i++) {
                 sum+=rollDice();
            }
                return sum;
        }

}
