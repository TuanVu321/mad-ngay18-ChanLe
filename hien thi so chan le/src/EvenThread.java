public class EvenThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <11 ; i++) {
            if(i%2==0){
                System.out.println(i);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
