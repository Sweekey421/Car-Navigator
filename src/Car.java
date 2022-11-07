import java.util.Random;
public class Car {
    private int v;
    public int getV() {   //возвращает в
        Random random = new Random();
        v += random.nextInt(5)+1;
        if (v >= 110){
            v -= 7;
        }
        return v;
    }
}