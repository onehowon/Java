class MyTv2{
    boolean isPowerOn;
    int channel;
    int volume;
    private int prevChannel;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    public void setVolume(int volume){
        if(volume > MAX_VOLUME || volume < MIN_VOLUME)
            return;
        this.volume = volume;
    }
    public int getVolume(){
        return volume;
    }
    public void setChannel(int channel){
        if(channel > MAX_CHANNEL || channel < MIN_CHANNEL)
            return;

        prevChannel = this.channel;
        this.channel = channel;
    }
    public int getChannel(){
        return channel;
    }

    public void gotoPrevChannel(){
        setChannel(prevChannel);
    }

}
public class mytv2 {
    public static void main(String[] args) {
        MyTv2 t = new MyTv2();

        t.setChannel(10);
        System.out.println("CH:" + t.getChannel());
        t.setVolume(20);
        System.out.println("CH:" + t.getVolume());
    }
}
