import processing.core.PApplet;

public class fourBalls extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 488;
    public static  final int DIAMETER = 15;
    public static final int NO_OF_BALLS = 4;
    private int xDirection=0;

    public static void main(String[] args){
        PApplet.main("fourBalls");
    }
    @Override
    public void settings(){
        super.settings();
        size(WIDTH,HEIGHT);
    }
    @Override
    public void setup(){
        super.setup();
        background(0);
        fill(150);
    }
    @Override
    public void draw(){
        for(int idx=1;idx<=NO_OF_BALLS;idx++){
            drawCircle(idx);
        }
    }
    private void drawCircle(int idx) {
        int height= (idx*HEIGHT)/5;
        ellipse(xDirection/idx,height,DIAMETER,DIAMETER);
        xDirection+=2;
    }

}
