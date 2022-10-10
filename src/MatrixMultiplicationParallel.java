import java.util.Date;

public class MatrixMultiplicationParallel {

    public static void main(String[] args) {


        /*
        Date start = new Date();

        int[][] m1 = MatrixGeneratorUtil.generateMatrix(10, 10);
        int[][] m2 = MatrixGeneratorUtil.generateMatrix(10, 10);

        int[][] result1 = new int[m1.length][m2[0].length];
        ParallelThreadsCreator.multiply(m1, m2, result1);

        Date end = new Date();
        System.out.println("\nTime taken in milli seconds for 10X10 matrix multiplication: " + (end.getTime() - start.getTime()));
        */


        /*
        Date start = new Date();

        int[][] m3 = MatrixGeneratorUtil.generateMatrix(100, 100);
        int[][] m4 = MatrixGeneratorUtil.generateMatrix(100, 100);

        int[][] result2 = new int[m3.length][m4[0].length];
        ParallelThreadsCreator.multiply(m3, m4, result2);

        Date end = new Date();
        System.out.println("\nTime taken in milli seconds for 100X100 matrix multiplication: " + (end.getTime() - start.getTime()));
        */


        Date start = new Date();

        int[][] m5 = MatrixGeneratorUtil.generateMatrix(1000, 1000);
        int[][] m6 = MatrixGeneratorUtil.generateMatrix(1000, 1000);

        int[][] result3 = new int[m5.length][m6[0].length];
        ParallelThreadsCreator.multiply(m5, m6, result3);

        Date end = new Date();
        System.out.println("\nTime taken in milli seconds for 1000X1000 matrix multiplication: " + (end.getTime() - start.getTime()));


    }

}