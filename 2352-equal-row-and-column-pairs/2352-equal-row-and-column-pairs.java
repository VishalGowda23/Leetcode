class Solution {
    public int equalPairs(int[][] grid) {
        // int count = 0;
        // for(int i = 0 ; i < grid.length ; i++){
        //     for(int j = 0 ; j < grid.length ; j++){
        //         boolean equal = true;
        //         for(int k = 0 ; k < grid.length ;k++){
        //             if(grid[i][k] != grid[k][j]){
        //                 equal = false;
        //                 break;
        //             }
        //         }
        //         if(equal){
        //             count++;
        //         }
        //     }
        // }
        // return count;
        HashMap<List<Integer>, Integer>map = new HashMap<>();
        int count = 0;

        for(int i = 0 ; i < grid.length ; i++){
            List<Integer> row = new ArrayList<>();
            for(int j = 0 ; j < grid.length ; j++){
                row.add(grid[i][j]);
            }
            map.put(row , map.getOrDefault(row , 0) + 1);
        }

        for(int i = 0 ; i < grid.length ; i++){
            List<Integer> col = new ArrayList<>();
            for(int j = 0 ; j < grid.length ; j++){
                col.add(grid[j][i]);
            }

            if(map.containsKey(col)){
                count += map.get(col);
            }
        }
        return count;
    }
}