public class Page90 {

    public static void main(String[] args){
        int n = 1260;
        double count = 0;

        int[] coin_types = {500, 100, 50, 10};

        for(int i =0; i < 4; i++){
            count += n / coin_types[i];
            n %= coin_types[i];
        }
        System.out.println(count);



    }
}
