public class Q1bii {
    public static void main(String[] args){
        for (int i = 0; i<10; i++){
            MyTask t = new MyTask(Thread.MAX_PRIORITY, "high priority" + i);
            t.start();
        }
    }
}
