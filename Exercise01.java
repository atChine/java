package Exercise01;

public class Exercise01 {
    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++) {
            for (int j = 1; j < 1000; j++) {
                for (int k = 1; k <1000 ; k++) {
                    if(i*i+j*j+k*k==1000){
                        System.out.println(i+" "+j+" "+k);
                    }
                }
            }
        }
    }
}
