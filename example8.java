public class example8 {
    public static void main(String [] args){
        int n=10; char ch='J';
        for(int i=1;i<=4;i++){

            for(int j=1; j<=i; j++){
                if (i%2==1) {
                    System.out.print(n + " ");

                }else{
                    System.out.print(ch+ "  ");

                }
                 n--; ch--;
            }

            System.out.println();
        }
    }
}
