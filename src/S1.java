public class S1  {
    int y= 0;

    S1(int n){

      y =  ((21-n) < 21) ? (21-n) : (2 * (n-21));

    }

    public int getY() {
        return y;
    }


}
