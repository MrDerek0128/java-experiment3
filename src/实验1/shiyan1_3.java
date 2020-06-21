package 实验1;

public class shiyan1_3 {
    public static void main(String[] args){
        int i,j,k;
        for(i=1;i<10;i++){
            for(j=1;j<i+1;j++){
                k=i*j;
                if(i!=j){
                    System.out.printf("%d*%d=%-2d ",i,j,k);
                }
                else {
                    System.out.printf("%d*%d=%-2d\n",i,j,k);
                }
            }
        }
    }
}
