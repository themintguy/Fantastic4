package Java.Assignments;



class Tv {
    int channel = 1;
    int volumeLevel = 1;
    boolean on = false;

    public Tv(){

    }

    public  void turnOn(){
        on = true;
    }

    public  void turnOff(){
        on = false;
    }

    public  void setChannel(int newChannel){
        if(on && newChannel >= 1 && newChannel <= 120){
            channel = newChannel;
        }
    }

    public  void setVolume(int newVolume){
        if(on && newVolume  >= 1 && newVolume <=7){
            volumeLevel = newVolume;
        }
    }

    public void channelUp(){
        if(on && channel < 120){
            channel++;
        }
    }

    public void  channelDown(){
        if(on && channel > 1){
            channel--;
        }
    }

    public void volumeUp(){
        if(on && volumeLevel < 7){
            volumeLevel++;
        }
    }

    public void volumeDown(){
        if(on && volumeLevel > 1){
            volumeLevel--;
        }
    }

    public void  currentVolume(){
        System.out.println("Current Volume : "+ volumeLevel);
    }

    public void currentChannel(){
        System.out.println("Current Channel : "+channel);
    }

}

public class TestTv {
    public static void main(String[] args) {
        Tv tv1 = new Tv();
        tv1.turnOn();
        tv1.setChannel(31);
        tv1.setVolume(31);
        tv1.currentChannel();
        tv1.currentVolume();
    }

}
