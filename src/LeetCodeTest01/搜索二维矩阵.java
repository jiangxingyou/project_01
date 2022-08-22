package LeetCodeTest01;

/*
编写一个高效的算法来搜索 m x n 矩阵 matrix 中的一个目标值 target 。该矩阵具有以下特性：

每行的元素从左到右升序排列。
每列的元素从上到下升序排列。
 

作者：力扣 (LeetCode)
链接：https://leetcode.cn/leetbook/read/top-interview-questions/xmlwi1/
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class 搜索二维矩阵 {
    public static void main(String[] args) {
        System.out.println("test--2022年8月22日");
        System.out.println(5/2);
    }

    public boolean fun(int[][] matrix, int target){
        //从左下角，开始找
        int row = matrix.length - 1;//行
        int column = 0;
        while (row >= 0 && column < matrix[0].length){
            if (target == matrix[row][column]){
                return true;
            }else if(target < matrix[row][column]){
                row--;
            }else{
                column++;
            }
        }
        return false;
    }
}
