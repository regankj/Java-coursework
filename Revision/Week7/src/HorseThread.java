import java.util.Random;

public class HorseThread extends Thread {

    private int ID;
    private int time = 0;

    public int getTime(){
        return time;
    }

    public HorseThread(int id){
        ID = id;
    }

    public void run(){
        final int MAX_DISTANCE = 1000;
        int distance = 0;

        Random random = new Random();
        while (distance < MAX_DISTANCE){
            distance += random.nextInt(6) + 1;
            time ++;
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("Horse" + ID + " finished at time " + time);
    }
}
