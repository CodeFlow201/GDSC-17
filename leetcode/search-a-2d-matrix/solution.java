public class solution{

    // lets say we have to find 3 in a m x n matrix
// Test case.1 matrix = [1,3,5,7]
    // [10,11,16,20]
    // [23,30,34,60]
    // 1. first we find the length of rows and coloumns
    // 2. Then we take low = 0 and high = rows*colows-1 which is in this case is 3*4-1(11)
    // 3. Then we apply binary search and find the middle element(returning the index)
    // 4. how can we know where to move left or right if we dont have the mid_point(element)
    // 5. Then we have to find the mid_point which is the element on the mid point, so we do matrix[mid/cols][mid%cols]
    // 6. if we find the target we return true otherwise we move left or right based on the element
    
//    Test case 2. matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
//     ans should be false
//     Time complexity should be O(logn) and space complexity is constant O(1)





    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int low = 0;
        int high = rows*cols-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            int mid_point = matrix[mid/cols][mid%cols];
            if(mid_point==target) return true;
            else if(mid_point>target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return false;
        
    }
}
