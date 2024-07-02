class Solution {
public:
    vector<vector<int>> transpose(vector<vector<int>>& matrix) {
        int len = matrix.size();
        if (len == 0) return matrix;
        int rowLen = matrix[0].size();
        vector<vector<int>> result;
        for (int i = 0; i < rowLen; i++){
            vector<int> temp;
            for(int j = 0 ; j < len; j++){
                temp.push_back(matrix[j][i]);
            }
            result.push_back(temp);
        }
        return result;
    }
};


//if rows == columns
// class Solution {
// public:
//     vector<vector<int>> transpose(vector<vector<int>>& matrix) {
//         int len = matrix.size();
//         for (int i = 0; i < len; i++){
//             int rowLen = matrix[i].size();
//             if (rowLen != len) return matrix;
//             for(int j = i ; j < rowLen; j++){
//                 if(i == j) continue;
//                 else{
//                     int temp = matrix[j][i];
//                     matrix[j][i] = matrix[i][j];
//                     matrix[i][j] = temp;                    
//                 }
//             }
//         }
//         return matrix;
//     }
// };
