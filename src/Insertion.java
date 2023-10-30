import java.util.Random;

/**
 * Kelas InsertionSort untuk mengurutkan array menggunakan algoritma Insertion Sort.
 */

public class Insertion{

    /**
     * Metode untuk melakukan pengurutan array menggunakan algoritma Insertion Sort.
     *
     * @param array Array yang akan diurutkan.
     */
    public void sort(int array[]) {
        // Implementasi algoritma Insertion Sort
        // ...
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j - 1;
            while (i >= 0 && array[i] > key) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
    }
    /**
     * Metode untuk menampilkan isi dari array.
     *
     * @param array Array yang akan ditampilkan isinya.
     */
    public void displayArray(int array[]) {
        // Implementasi untuk menampilkan isi array
        // ...
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    /**
     * Metode utama untuk menjalankan algoritma pengurutan dan menampilkan hasilnya.
     *
     * @param args Argumen dari baris perintah.
     */

    public static void main(String[] args) {
        // Implementasi main untuk inisialisasi, pengurutan, dan penampilan array.
        // ...
        int arrayLength = 100;
        int[] arrayToSort = new int[arrayLength];
        Random random = new Random();
        Insertion sorter = new Insertion();

        for (int i = 0; i < arrayLength; i++) {
            arrayToSort[i] = random.nextInt(10);
        }

        System.out.println("Array awal : ");
        sorter.displayArray(arrayToSort);

        long startTime = System.currentTimeMillis();
        sorter.sort(arrayToSort);
        long endTime = System.currentTimeMillis();

        System.out.println("\nArray setelah pengurutan : ");
        sorter.displayArray(arrayToSort);

        System.out.println("Waktu eksekusi : " + (endTime - startTime) + "ms");
    }
}
