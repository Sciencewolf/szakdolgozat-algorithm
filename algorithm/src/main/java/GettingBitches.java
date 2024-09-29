import java.time.OffsetDateTime;
import java.util.HashMap;

public interface GettingBitches {
    double getTemperature();
    double getHumidity();
    boolean getLidStatus();
    HashMap<String, String> getErrors();
    OffsetDateTime getPreviousData();
    void setTemperature(double temperature);
    void setHumidity(double humidity);
    void setData();
}
