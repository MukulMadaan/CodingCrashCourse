class Solution {
    public String alphabetBoardPath(String target) {
        int startRowIndex = 0;
        int startColIndex = 0;
        int len = target.length();
        String result = "";
        for (int i = 0; i < len; i++){
            char now = target.charAt(i);
            int ascii = now - 'a';
            int currentRowIndex = ascii/5;
            int currentColIndex = ascii%5;
            int rowDiff = currentRowIndex - startRowIndex;
            int colDiff = currentColIndex - startColIndex;
            // System.out.println(rowDiff);
            if (rowDiff > 0){
                int check = 0;
                if (now == 'z') check = 1;
                while(rowDiff > check){
                    result += 'D';
                    rowDiff--;
                }
            } else{
                while(rowDiff < 0){
                    result += 'U';
                    rowDiff++;
                }
            }
            if (colDiff > 0){
                while(colDiff > 0){
                    result += 'R';
                    colDiff--;
                }
            } else{
                while(colDiff < 0){
                    result += 'L';
                    colDiff++;
                }
            }
            if (now == 'z'){
                while(rowDiff > 0){
                    result += 'D';
                    rowDiff--;
                }
            }
            result += '!';
            startRowIndex = currentRowIndex;
            startColIndex = currentColIndex;
        }
        return result;
    }
}

INCORECT ATTEMPT
class Solution {
    public String alphabetBoardPath(String target) {
        int startRowIndex = 0;
        int startColIndex = 0;
        int len = target.length();
        String result = "";
        for (int i = 0; i < len; i++){
            char now = target.charAt(i);
            int ascii = now - 'a';
            int currentRowIndex = ascii/5;
            int currentColIndex = ascii%5;
            int rowDiff = currentRowIndex - startRowIndex;
            int colDiff = currentColIndex - startColIndex;
            if (rowDiff > 0){
                while(rowDiff-- > 0){
                    result += 'D';
                }
            } else{
                while(rowDiff++ < 0){
                    result += 'U';
                }
            }
            if (colDiff > 0){
                while(colDiff-- > 0){
                    result += 'R';
                }
            } else{
                while(colDiff++ < 0){
                    result += 'L';
                }
            }
            result += '!';
            startRowIndex = currentRowIndex;
            startColIndex = currentColIndex;
        }
        return result;
    }
}
