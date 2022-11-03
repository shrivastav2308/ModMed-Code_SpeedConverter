public class SpeedConverter {
    public static long toMPH(double kmph) {
        if(kmph < 0) {
            return -1;
        }
        return Math.round(kmph / 1.609);
    }
    public static void printConversion(double kmph) {
        if(kmph < 0) System.out.println("Invalid Value");
        long mph = toMPH(kmph);
        System.out.println(kmph + " km/h = " + mph + " mi/h");
    }
}