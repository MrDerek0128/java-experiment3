package 实验1;

public class shiyan1_2 {
    public static void main(String[] args) {
        int i,j;
        long k;
        System.out.println("negative number is illegal");
        for(i=0;i<21;i++){
            k=1;
            for(j=1;j<i+1;j++){
                k=k*j;
            }
            System.out.println(i+"!="+k);
        }
    }
}
