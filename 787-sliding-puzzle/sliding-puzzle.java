class Solution 
{
    public int slidingPuzzle(int[][] board) 
    {
        String target= "123450";//Final or the Destination Puzle we have to reach 
        
        StringBuilder start_= new StringBuilder();//String Buffer because it takes O(1) time for string creation  
        for(int i= 0; i< 2; i++){
            for(int j= 0; j< 3; j++)
                start_.append(board[i][j]);
        }
        String start= start_.toString();//Intial puzzle given
        
        //Our main objective is to find the min number of swap or move required to reach the destination puzzle if possible(So BFS is the best posssible solution because it gives the shortest path between 2 points)
        
        Queue<String> q= new ArrayDeque<>();
        HashSet<String> visited= new HashSet<>();//so that we dont traverse the same puzzle again//prevent cycle 
        int[][] swap= {{1, 3}, {0, 2, 4}, {1, 5}, {0, 4}, {1, 3, 5}, {2, 4}};//possible number of swapping position, depending on the current position of 0//BFS traversal direction 
        
        int level= 0;//our current level or the starting level 
        
        visited.add(start);//marking the starting puzzle as visited 
        q.offer(start);//adding the starting puzzle into the Queue
        while(!q.isEmpty())
        {//r m* w a*
            int size= q.size();//polling constraint, breadth wise  
            while(size  -- > 0)
            {
                String temp= q.poll();//polling the current puzzle 
                
                if(temp.equals(target))//if we reach the destination puzzle, we return the level(as it is Guaranteed that it will be the min number of swap or move, since BFS expand radially)
                    return level;
                
                int index= temp.indexOf('0');//returns the index of the first occutrance of 0
                for(int swapIndex: swap[index])//getting the possible swapping positions from the current index of 0 
                {
                    StringBuilder sb= new StringBuilder(temp);//string builder is mutable,i.e; it can be changed 
            
                    //Swapping 
                    sb.setCharAt(index, temp.charAt(swapIndex));
                    sb.setCharAt(swapIndex, '0');//puzzle swapped //Empty space moving
                    
                    String puzz= sb.toString();//converting into string 
                    
                    if(visited.contains(puzz) == true)//not visiting the visited puzzle 
                        continue;
                    
                    visited.add(puzz);//marking the current puzzle as visited 
                    q.offer(puzz);//adding the puzzle tro the Queue
                }
            }
            level+= 1;//increasing the level, as all the puzzle at same level are inserted 
        }
        return -1;//when we can't reach the destination puzzle
    }
}//Please do Upvote, it helps a lot