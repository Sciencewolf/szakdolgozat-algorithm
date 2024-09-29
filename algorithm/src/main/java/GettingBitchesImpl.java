import java.time.OffsetDateTime;
import java.util.HashMap;

public class GettingBitchesImpl implements GettingBitches {

    @Override
    public double getTemperature() {
        return 0;
    }

    @Override
    public double getHumidity() {
        return 0;
    }

    /**
     *
     * @return true if lid is closed else false
     */
    @Override
    public boolean getLidStatus() {
        return false;
    }

    /**
     *
     * @return HashMap key:value pair object
     */
    @Override
    public HashMap<String, String> getErrors() {
        return null;
    }

    /**
     *
     * @return an DateTime object when was the last time this algorithm was run
     */
    @Override
    public OffsetDateTime getPreviousData() {
        return OffsetDateTime.now();
    }

    @Override
    public void setTemperature(double temperature) {

    }

    @Override
    public void setHumidity(double humidity) {

    }

    @Override
    public void setData() {

    }

    /**
     * Main method of the algorithm.
     * Call this to run the script.
     */
    public void run() {

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GettingBitchesImpl{");
        sb.append(this.getErrors());
        sb.append(", ");
        sb.append(this.getTemperature());
        sb.append(", ");
        sb.append(this.getHumidity());
        sb.append(", ");
        sb.append(this.getPreviousData());
        sb.append(", ");
        sb.append(this.getLidStatus());

        sb.append('}');
        return sb.toString();
    }
}