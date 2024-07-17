import java.util.*;
public class ns_test {
    public static void main(String[] args) {
        //遍历数组
        int [] ns = {1,2,3,4,5,6,7,8,9,10};
        for(int i = 0; i<ns.length; i++){
            int n = ns[i];
            System.out.print(n+" ");
        }
        System.out.println(Arrays.toString(ns));
        for(int i = ns.length-1; i>=0; i--){
            int n = ns[i];
            System.out.print(n+" ");
        }
        System.out.println();
        //数组排序
        //降序排序
        int [] nspx = {28,34,9,14,21,58,8,65,11,23,21,4574,877,5,12};
        System.out.println(Arrays.toString(nspx));
        for(int i = 0;i < nspx.length; i++){
            for(int j = i+1; j < nspx.length; j++){
                if(nspx[i] < nspx[j]){
                    int temp = nspx[i];
                    nspx[i] = nspx[j];
                    nspx[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nspx));
        //利用Java自带函数升序排序
        int [] nspxhs = {135,156,454,5165,16,1,9681,6,516,16,8,16,5};
        System.out.println(Arrays.toString(nspxhs));
        Arrays.sort(nspxhs);
        System.out.println(Arrays.toString(nspxhs));
        //二维数组
        int [][] ens = {{1,2,3},{4,5,6},{7,8,9}};
        int sums = 0;
        for(int i = 0; i< ens.length; i++){
            for(int j = 0; j< ens.length; j++){
                System.out.print(ens[i][j]+" ");
                sums+=ens[i][j];
            }
        }
        System.out.println(sums);
        System.out.println(ens.length);
        int [] aaa = ens[0];
        System.out.println(Arrays.toString(aaa));
        System.out.println(aaa.length);

    }
}
