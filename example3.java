public class example3 {
    public static void main(String[] args){
        int n=10;
        for(int i=1; i<=4;i++){
            for (int j=1; j<=i; j++){
                System.out.print(n+(i-1) + " ");
                n--;

            }
            System.out.println();
        }
    }
}
