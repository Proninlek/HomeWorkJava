public class NewHomeWork {
    public static void sort (int [] array){
        for (int i = array.length/ 2 - 1; i >= 0; i --)
            heapify (array, array.length, i);

        for (int i= array.length/ 2 - 1; i >= 0; i --)
            int temp = array [0];
            array [0] = array [i];
            array [i] = temp;
            heapify (array, i, 0);
    }
}
    private static void heapify (int [] array, int heapSide, int rootIndex) {
        int lergest = rootIndex;
        int leftChild = 2 * rootIndex + 1;
        int rightChild = 2 * rootIndex + 2;
        if (leftChild < heapSide && array[leftChild] > array[lergest])
            lergest = leftChild;
        if (rightChild < heapSide && array[rightChild] > array[lergest])
            lergest = rightChild;
        if (lergest != rootIndex) {
            int temp = array[rootIndex];
            array[rootIndex] = array[lergest];
            array[lergest] = temp;
            heapify(array, heapSide, lergest);
        }
    }
}
