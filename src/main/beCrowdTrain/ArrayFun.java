public class ArrayFun {

    public static void visualizarArray(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.println("X[" + i + "] = " + v[i]);
        }
    }

    public static void tratarArray1172(int[] v) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] <= 0) {
                v[i] = 1;
            }
        }
    }
}