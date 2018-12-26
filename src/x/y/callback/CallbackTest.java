package x.y.callback;

public class CallbackTest {
    public static void main(String[] args){
        Callback callback=new Callback();
        callback.testCallback(new ListenerImpl());
    }
}
