package com.abc.SparseArray;

/**
 * @author tws
 * @date 2022/8/30
 * @about 稀疏数组第一天
 **/

public class day01 {
    public static void main(String[] args) {
        //创建一个原始二维数组 11*11
        // 0 表示没有棋子，1表示黑子， 2表示篮子
        int chessar[][] =new int[11][11];
        chessar[1][2] =1;
        chessar[2][4]=2;
        for (int[] row :chessar){
            for (int data :row){
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }

        //将二维数组  转成 稀疏矩阵
        //1.先遍历二维数据 得到非0 的个数
        int sum =0;
        for (int i=0;i<11;i++){
            for (int j=0;j<11;j++){
                if (chessar[i][j] !=0){
                    sum++;
                }
            }
        }

        //2.创建对应的稀疏数组
        int sparseArr[][] =new int[sum+1][3];
        sparseArr[0][0] =11;
        sparseArr[0][1] =11;
        sparseArr[0][2] =sum;

        //3.遍历二维数组；将非0的值存放到sparseArr中
        int cnt =0;
        for (int i=0;i<11;i++){
            for (int j=0;j<11;j++){
                if (chessar[i][j] !=0){
                    cnt++;
                    sparseArr[cnt][0] =i;
                    sparseArr[cnt][1] =j;
                    sparseArr[cnt][2] =chessar[i][j];
                }
            }
        }


        // 输出稀疏数组
        System.out.println("稀疏数组");
        for (int i =0;i <sparseArr.length;i++){
            System.out.printf("%d\t%d\t%d\t\n",sparseArr[i][0],sparseArr[i][1],sparseArr[i][2]);
        }
        System.out.println("---");























    }

}
