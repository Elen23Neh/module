public class Array {
    public static void main(String[] args) {

        int[] array = {1, 4, 5, 1, 1, 3,};
        System.out.println(сount(array));
    }

    static int сount(int[] array) {
        int result = 0;
        int countUnique = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            countUnique++;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == array[i]) {
                    count++;
                }
            }
        }
        return result = countUnique - count + 1;
    }
}
