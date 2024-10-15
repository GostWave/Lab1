



public class Lab1 {
    double[][] z1 = new double[10][13];


    public static void main(String[] args) {
        double[][] z1 = new double[10][13];
        short[] z = new short[10];
        short k = 0;
        double[] x = new double[13];
        double x1;
        short z2;


        for (int i = 23; i >= 5; i--) {
            if (i % 2 == 1) {
                z[k] = (short) i;
                k++;
            }
        }
        for (int i = 0; i < 13; i++) {
            x[i] = (Math.random() * 29.0) - 14.0;
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 13; j++) {
                x1 = x[j];
                z2 = z[i];
                z1[i][j] = rez(x1, z2, z1);
            }
        }
        print(z1);
    }

    public static double rez(double x1, short z2, double[][] z1) {
        double rez;
        switch (z2) {
            case 21:
                rez = Math.cbrt(Math.pow(Math.tan(x1), Math.atan((x1 + 0.5) / 29)));
                break;
            case 5, 9, 11, 13, 23:
                rez = Math.atan(Math.sin(Math.log(Math.pow((Math.abs(x1) / 2), x1))));
                break;
            default:
                rez = Math.pow((4 * (Math.tan(Math.asin(Math.pow(Math.E, -Math.abs(x1))) - 1))), Math.log(Math.sqrt(Math.abs(x1))));
        }
        return rez;
    }

    public static void print(double[][] z1) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 13; j++) {
                System.out.printf("%.5f ",z1[i][j]);

            }
            System.out.println();
        }
    }
}
