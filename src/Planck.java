import java.lang.Math;

public class Planck {
    public final static double SIGMA = 5.67E-8;     // [W/m^2*K^4]
    public final static double PI    = Math.PI;
    public final static double H     = 6.626E-34;   //Planck constant [m^2*kg/s]
    public final static double C     = 299792458.;  //speed of light [m/s]
    public final static double KB    = 1.380649E-23;//Boltzmann's constant [kg/(s^2*K)]
    public final static double C1    = 2 * PI * H * C*C;
    public final static double C2    = H*C/KB;

    /**
     * Spectral radiant exitance
     */
    public static double sre(double wavelength, double temperature){
        return (C1/Math.pow(wavelength,5.))/(Math.exp(C2/(wavelength*temperature)) - 1.);
    }

    public static void main(String[] args) {
        double t = 1000; // temperature [K]
        double w;

        for (int i = 1; i <= 20; i++) {
            w = i * 0.5e-6;
//            System.out.println("w= " + w + "  sre = " + sre(w,t));
            System.out.printf("w= %.2e  sre = %.4e%n", w , sre(w,t));
        }
    }
}
