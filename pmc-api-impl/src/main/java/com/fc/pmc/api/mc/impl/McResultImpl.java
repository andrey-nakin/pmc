
import com.fc.api.mc.McResult;
import com.fc.api.mc.bo.McParams;
import java.time.Instant;
import java.util.stream.Stream;

/**
 *
 * @author andrey
 */
public class McResultImpl implements McResult {

    public McParams getParams() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getNumOfRuns() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double endingValue(double quantile) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Stream<Instant> getSnapshots() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double value(Instant timeAsOf, double quantile) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
