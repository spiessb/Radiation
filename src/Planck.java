import java.lang.Math;

public class Planck {
    public final static double SIGMA = 5.67E-8;    //
    public final static double PI    = Math.PI;
    public final static double H     = 6.626E-34;  //Planck constant
    public final static double C     = 299792458.; //speed of light
    public final static double KB    = 1.380649E-23;//Boltzmann's constant
    public final static double C1    = 2 * H * C*C;
    public final static double C2    = H*C/KB;

    /**
     * Spectral radiant exitance
     */
    public static double sre(double wavelength, double temperature){
        return (C1/wavelength)/(Math.exp(C2/(wavelength*temperature)) - 1.);
    }

    public static void main(String[] args) {
        double t = 5000;
        double w;

        for (int i = 1; i <= 10; i++) {
            w = i * 0.1E-6;
            System.out.println("w= " + w + "  sre = " + sre(w,t));
        }
    }
}
