class MyTv2{
    
    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;
    
    private boolean isPowerOn;
    private int channel;
    private int volume;
    private int PrevCh;
    
    public void setChannel(int channel){
        if(channel > MAX_CHANNEL || channel < MIN_CHANNEL) return;
        PrevCh = this.channel;
        this.channel = channel;
    }
    
    public void gotoPrevChannel(){
        setChannel(PrevCh);
    }
    
    public int getChannel(){
        return channel;
    }
}

public class practice7_5{
    public static void main(String[] args){
        MyTv2 t = new MyTv2();
        
        t.setChannel(10);
        System.out.println("CH:" + t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:" + t.getChannel());
    }
}