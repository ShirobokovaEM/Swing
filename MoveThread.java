
package javaapplication91;


public class MoveThread implements Runnable {
    
    private final Thread self;
    private int delay;//задержка 
    private final JBoxFrame frame;//окно

    public MoveThread(int delay, JBoxFrame frame) {
        this.delay = delay;
        this.frame = frame;
        self = new Thread(this, "BoxMoveThread");
    }    

    public int getDelay() {
        return delay;
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }
    
    public void start() {
        self.start();
    }
    
    public void stop(){
        self.interrupt();
    }

    @Override
    public void run() {
        try {
            while(true){
            frame.moveBox();
            Thread.sleep(delay);
            }
        }catch (InterruptedException ex) { }
    }   
    
}
