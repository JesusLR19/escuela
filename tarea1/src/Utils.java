public class Utils {
    public static <T extends Comparable<T>> T[] ordena(T[] vector) {
        quicksort(vector, 0, vector.length - 1);
        return vector;
    }

    private static <T extends Comparable<T>> void quicksort(T[] vector, int izquierda, int derecha) {
        int i = izquierda;
        int j = derecha;
        T pivote = vector[(i + j) / 2];
        while (i <= j) {
            while (vector[i].compareTo(pivote) < 0) {
                i++;
            }
            while (vector[j].compareTo(pivote) > 0) {
                j--;
            }
            if (i <= j) {
                T temp = vector[i];
                vector[i] = vector[j];
                vector[j] = temp;
                i++;
                j--;
            }
        }
        if (izquierda < j) {
            quicksort(vector, izquierda, j);
        }
        if (i < derecha) {
            quicksort(vector, i, derecha);
        }

    }
}


