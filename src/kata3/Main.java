package kata3;

/**
 *
 * @author Krystian Kurzawa
 */

public class Main {

    public static void main(String[] args) {
        CalculateMailDomainHistogramControl control = new CalculateMailDomainHistogramControl(args[0]);
        control.execute();
    }
}
