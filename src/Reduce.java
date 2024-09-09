public class Reduce {
    public static void main(String[] args) {
        int i = 100;
        int count = 0;

        while(i != 0){
            boolean isEven = i % 2 == 0;
            count++;

            if(isEven){
                i = i / 2;
            }else{
                i -= 1;
            }
        }
        System.out.println(count);
    }
}
