package mySparseArray;

import java.util.Arrays;

/**
 * 稀松数组
 * 当一个数组中大部分元素为0，或者为同一值的数组时，可以使用稀疏数组来保存该数组。
 */
public class SparseArray {
    public static void main(String[] args) {
        SparseArray sparseArray = new SparseArray();
        Integer[][] matrix = new Integer[][]{
                {0,0,0,0,0,1,0},
                {0,0,0,0,9,0,0},
                {0,0,0,-1,0,0,0},
                {0,0,5,0,0,0,0},
                {0,2,0,0,0,0,0}
        };
        System.out.println("-----原始二维数组-----");
        for (Integer[] integers : matrix) {
            for (Integer integer : integers) {
                System.out.print(integer+"\t");
            }
            System.out.println();
        }

        System.out.println("-----转化为稀疏数组-----");
        Integer[][] sparseArr = sparseArray.arrayToSparseArray(matrix);
        for (Integer[] integers : sparseArr) {
            for (Integer integer : integers) {
                System.out.print(integer+"\t");
            }
            System.out.println();
        }

        System.out.println("---稀松数组转化为原始二维数组-----");
        Integer[][] matrix2 = sparseArray.sparseArrayToArray(sparseArr);
        for (Integer[] integers : matrix2) {
            for (Integer integer : integers) {
                System.out.print(integer+"\t");
            }
            System.out.println();
        }


    }

    /**
     * 将二维数组转换成稀疏数组
     * @param matrix 原始二维数组
     * return 稀松数组
     */
    public Integer[][] arrayToSparseArray(Integer[][] matrix){
        int sum = 0; //统计原始二维数组中的有效元素
        for (Integer[] ints : matrix) {
            for (Integer anInt : ints) {
                if(anInt != 0) sum++;
            }
        }

        Integer[][] sparseArray = new Integer[sum + 1][3];
        sparseArray[0][0] = matrix.length;
        sparseArray[0][1] = matrix[0].length;
        sparseArray[0][2] = sum;

       int row = 1;
       for(int i = 0; i < matrix.length; i++) {
           for(int j = 0; j < matrix[0].length; j++) {
               if(matrix[i][j] != 0) {
                   sparseArray[row][0] = i;
                   sparseArray[row][1] = j;
                   sparseArray[row][2] = matrix[i][j];
                   row++;
               }
           }
       }
       return sparseArray;
    }

    /**
     * 将稀疏数组转化为原始二维数组
     * @param sparseArray 稀松数组
     * @return 原始二维数组
     */
    public Integer[][] sparseArrayToArray(Integer[][] sparseArray){
        Integer[][] matrix = new Integer[sparseArray[0][0]][sparseArray[0][1]];
        for (Integer[] integers : matrix) {
            Arrays.fill(integers,0);
        }

        for(int row = 1; row < sparseArray.length; row++) {
            matrix[sparseArray[row][0]][sparseArray[row][1]] = sparseArray[row][2];
        }

        return matrix;
    }
}
