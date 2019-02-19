import org.junit.Assert;
import org.junit.Test;


public class Tests {

    @Test
    public void diceTest(){
        //given
        Dice dice = new Dice(2);
        int expected = 2;
        //when
        int actual = dice.getNumberOfDice();
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void test_SumnToss(){
        //given
    Boolean answer = false;
    Dice dice = new Dice(2);
    int expected = dice.getNumberOfDice()*6;
        //when
        int actual = dice.sumNToss();
        //then
            if(expected <= actual) {
                    answer = true;
            }
    }
    @Test
    public void testSimulation(){

        Simulation sim = new Simulation();

        sim.runSimulations(1000);

    }

}
