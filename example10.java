public class example10 {
    public static void main(String[] args){
        int n=1;
        for(int i=1; i<=4; i++){
            n=i;
            for(int j=1; j<=i; j++){
                if(n%2==0) {
                    System.out.print(n * n * n + " ");
                    n++;
                }else{
                    System.out.print(n*n+" ");
                      n++;
                }


            }
            System.out.println();
        }
    }
}
