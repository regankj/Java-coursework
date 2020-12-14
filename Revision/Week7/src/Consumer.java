import java.util.Random;

public class Consumer extends Thread {

    private Buffer buffer;

    public Consumer (Buffer buf){
        buffer = buf;
    }


    public void run(){
        Random random = new Random();
        for (int i=0; i < 100; i++){
            if (buffer.isEmpty()){
                System.out.println("Buffer empty");
            }
            else {
                int value = buffer.get();
                System.out.println("Get: " + value);
            }
            int t = random.nextInt(51) + 50;
            try {
                Thread.sleep(t);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
