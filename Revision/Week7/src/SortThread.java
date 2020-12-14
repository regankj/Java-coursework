public class SortThread extends Thread {

    private int[] m_data;
    private int m_start;
    private int m_end;

    SortThread(int[] data, int start, int end){
        m_data = data;
        m_start = start;
        m_end = end;
    }

    public static void BubbleSort(int[] data, int start, int end){
        for (int i=0; i < end-start; i++){
            for (int j = end; j >= start + 1; j--){
                if (data[i] > data[j]){
                    int temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
    }
}
