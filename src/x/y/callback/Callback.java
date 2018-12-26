package x.y.callback;

public class Callback {
    public void testCallback(Listener listener){
        for (int i=0;i<10;i++){
            if (i==5){
                listener.execute();
            }else {
                System.out.println("i="+i);
            }
        }
    }
}
