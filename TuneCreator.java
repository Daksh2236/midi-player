
/**
 * Write a description of class TuneCreator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TuneCreator
{
    // instance variables - replace the example below with your own
    private MidiPlayer player;

    /**
     * Constructor for objects of class TuneCreator
     */
    public TuneCreator()
    {
        // initialise instance variables
        player = new MidiPlayer();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void CreateAndPLay()
    {
        // put your code here
        SimpleTune tune  = new SimpleTune();
        tune.addNote("C",4);
        tune.addNote("C4",4);
        tune.addNote("Db",4);
        tune.setInstrument(3);
        player.playTune(tune);
    }
}