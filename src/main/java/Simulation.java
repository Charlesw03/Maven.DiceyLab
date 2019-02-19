public class Simulation {
Dice dice = new Dice(2);
Bins bins = new Bins(2,12);

    public void runSimulations(Integer numberOfThrows){
        for (int i = 1; i < numberOfThrows; i++) {

            bins.binStoreVal(dice.rollDice()) ;


        }

        for (int i = 2; i <= 12 ; i++) {
           Double perct = (double)bins.getBins(i) / numberOfThrows;
            System.out.println(i + " :  " + bins.getBins(i) + " : " +  perct) ;


        }





    }

}
