package wit_spin_http;

public class RandomWork {
    public static String doSomeRandomWork(int howMuch) {
        final int LEN = 1024;

        long acc = 0;
        for (long i = 0; i < (long) Integer.MAX_VALUE * howMuch / 10; i ++) {
            acc ++;
        }

        final String[] strings = new String[LEN];

        for (int i = 0; i < howMuch; i ++) {
            for (int o = 0; o < LEN; o ++) {
                if (strings[o] == null) {
                    strings[o] = "";
                }

                strings[o] = (strings[o] + "" + (i % 10));

                if (strings[o].length() > 10) {
                    strings[o] = strings[o].substring(0, 9);
                }
            }
        }

        return "Done " + (LEN * howMuch) + " ops";
    }

}
