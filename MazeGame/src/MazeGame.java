import java.util.Arrays;
import java.util.*;
public class MazeGame {
    public static int[][] startMaze() {
        int m[][] = {
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 9, 9, 1, 9, 0, 9, 9, 9, 9, 9, 9, 9, 9, 9, 0, 0},
                    {0, 9, 0, 0, 9, 0, 0, 9, 0, 0, 9, 0, 0, 0, 9, 9, 0},
                    {0, 9, 9, 9, 9, 0, 9, 9, 2, 0, 9, 0, 0, 0, 0, 9, 0},
                    {0, 0, 9, 0, 9, 0, 0, 0, 9, 0, 9, 0, 0, 9, 0, 9, 0},
                    {0, 0, 9, 0, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 0},
                    {0, 0, 9, 0, 0, 9, 0, 8, 0, 9, 0, 0, 0, 0, 9, 0, 0},
                    {0, 0, 9, 0, 9, 9, 0, 0, 9, 9, 0, 9, 9, 0, 9, 9, 0},
                    {0, 0, 9, 0, 0, 9, 9, 9, 9, 9, 0, 0, 9, 0, 0, 0, 0},
                    {0, 0, 9, 9, 9, 9, 0, 8, 0, 9, 0, 0, 9, 0, 0, 0, 0},
                    {0, 0, 0, 9, 0, 0, 0, 0, 9, 9, 9, 9, 9, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };
        return m;
    }
    public static int[] findPlayer(int[][] maze){
        for(int i = 0; i < maze.length; ++i){
            for(int j = 0; j < maze[0].length; ++j){
                if(maze[i][j] == 1){
                    int[] arr = {i, j};
                    return arr;
                }
            }
        }
        return null;
    }
    public static int[] findMonster(int[][] maze){
        for(int i = 0; i < maze.length; ++i){
            for(int j = 0; j < maze[0].length; ++j){
                if(maze[i][j] == 2){
                    int[] arr = {i, j};
                    return arr;
                }
            }
        }
        return null;
    }
    public static int[] createMonster(int[][] maze){
        int firstNum = (int)(Math.random() * (maze.length - 1)) + 1;
        int secondNum = (int)(Math.random() * (maze[0].length - 1)) + 1;
        int[] monster = {firstNum, secondNum};
        return monster;
    }
    public static int[] checkMove(int[] player, String direction, int[][] maze){
        if(direction.equals("L") || direction.equals("l")){
            if(player[1] == 0){
                System.out.println("You cannot move past the wall");
            }
            else if(maze[player[0]][player[1] - 1] == 0){
                System.out.println("You cannot move past the wall");
            }
            else{
                player[0] -= 1;
                System.out.println("You have moved left. ");
            }
        }
        else if(direction.equals("R") || direction.equals("r")){
            if(player[1] == maze.length){
                System.out.println("You cannot move past the wall");
            }
            else if(maze[player[0]][player[1] + 1] == 0){
                System.out.println("You cannot move past the wall");
            }
            else{
                player[1] += 1;
                System.out.println("You have moved right. ");
            }
        }
        else if(direction.equals("U") || direction.equals("u")){
            if(player[0] == 0){
                System.out.println("You cannot move past the wall");
            }
            else if(maze[player[0] - 1][player[1]] == 0){
                System.out.println("You cannot move past the wall");
            }
            else{
                player[0] -= 1;
                System.out.println("You have moved up. ");
            }
        }
        else if(direction.equals("D") || direction.equals("d")){
            if(player[1] == maze[0].length){
                System.out.println("You cannot move past the wall");
            }
            else if(maze[player[0] + 1][player[1]] == 0){
                System.out.println("You cannot move past the wall");
            }
            else{
                player[0] += 1;
                System.out.println("You have moved down. ");
            }
        }
        else{
            System.out.println("Incorrect Direction");
        }
        return player;
    }
    public static int[] checkMonsterMove(int[] player, int num, int[][] maze){
        if(num == 1){
            if(player[1] == 0){
                System.out.println("You cannot move past the wall");
            }
            else if(maze[player[0]][player[1] - 1] == 0){
                System.out.println("You cannot move past the wall");
            }
            else{
                player[0] -= 1;
                System.out.println("You have moved left. ");
            }
        }
        else if(num == 2){
            if(player[1] == maze.length){
                System.out.println("You cannot move past the wall");
            }
            else if(maze[player[0]][player[1] + 1] == 0){
                System.out.println("You cannot move past the wall");
            }
            else{
                player[0] += 1;
                System.out.println("You have moved right. ");
            }
        }
        else if(num == 3){
            if(player[0] == 0){
                System.out.println("You cannot move past the wall");
            }
            else if(maze[player[0] - 1][player[1]] == 0){
                System.out.println("You cannot move past the wall");
            }
            else{
                player[0] -= 1;
                System.out.println("You have moved up. ");
            }
        }
        else if(num == 4){
            if(player[1] == maze[0].length){
                System.out.println("You cannot move past the wall");
            }
            else if(maze[player[0] + 1][player[1]] == 0){
                System.out.println("You cannot move past the wall");
            }
            else{
                player[0] += 1;
                System.out.println("You have moved down. ");
            }
        }
        else{
            System.out.println("Incorrect Direction");
        }
        return player;
    }
    public static boolean checkWin(int[] player, int[][] maze){
        if(maze[player[0]][player[1]] == 8){
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean checkLoss(int[] player, int[][] maze){
        if(maze[player[0]][player[1]] == 2){
            return false;
        }
        else{
            return true;
        }
    }
    public static void mazeOptions(int[] player, int[][] maze){
        //No way available
        if(player[0] == 0){
            System.out.println("There is no way left. ");
        }
        if(player[0] >= maze.length){
            System.out.println("There is no way right. ");
        }
        if(player[1] == 0){
            System.out.println("There is no way ahead. ");
        }
        if(player[1] >= maze[0].length){
            System.out.println("There is no way behind you. ");
        }
        //Way available
        if(maze[player[0]][player[1] - 1] == 9){
            System.out.println("The corridor on your left is dimply lit. ");
        }
        if(maze[player[0]][player[1] + 1] == 9){
            System.out.println("The corridor on your right is dimply lit. ");
        }
        if(maze[player[0] - 1][player[1]] == 9){
            System.out.println("The corridor ahead of you is dimply lit. ");
        }
        if(maze[player[0] + 1][player[1]] == 9){
            System.out.println("The corridor behind you is dimply lit. ");
        }
        //The end
        if(maze[player[0] + 1][player[1] - 1] == 8){
            System.out.println("The corridor on your left looks brighter than the others. ");
        }
        if(maze[player[0]][player[1] + 1] == 8){
            System.out.println("The corridor on your right looks brighter than the others. ");
        }
        if(maze[player[0] - 1][player[1]] == 8){
            System.out.println("The corridor ahead of you looks brighter than the others. ");
        }
        if(maze[player[0] + 1][player[1]] == 8){
            System.out.println("The corridor behind you looks brighter than the others. ");
        }
    }
    public static void clear(){
        for(int i = 0; i < 3; ++i){
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean play = true;
        int[][] maze = startMaze();
        int[] player = findPlayer(maze);
        int[] monster = findMonster(maze);
        //int[] monster = createMonster(maze);

        String direction = "";
        System.out.println("Welcome to Maze Run! \nType 'help' at any time to pull up how to use directions\n");
        while(play) {
            System.out.println(Arrays.toString(player));
            System.out.println(Arrays.toString(monster));
            //System.out.println(maze.length + " and " + maze[0].length);
            System.out.println("Which way would you like to go?\n");
            direction = in.next();
            if (direction.equals("quit")) {
                play = false;
            }
            else if (direction.equals("help")) {
                System.out.println("\nDirections are \n'U' for Up\n'D' for Down\n'L' for Left\n'R' for Right\n");
                mazeOptions(player, maze);
            }
            else {
                clear();
                //int num = (int)(Math.random() * 4) + 1;
                int range = (4 - 1) + 1;
                int num = (int)(Math.random() * range) + 1;
                player = checkMove(player, direction, maze);
                monster = checkMonsterMove(monster, num, maze);
                if(checkWin(player, maze)){
                    System.out.println("Would you like to play again? \nY for yes\nN for no\n");
                    String chk = in.next();
                    if(chk.equals("Y") || chk.equals("y")){
                        maze = startMaze();
                        player = findPlayer(maze);
                        monster = findMonster(maze);
                    }
                    else{
                        play = false;
                    }
                }
                if(checkLoss(player, maze) == false){
                    System.out.println("The monster has eaten you: fatality");
                    System.out.println("Would you like to play again? \nY for yes\nN for no\n");
                    String chk = in.next();
                    if(chk.equals("Y") || chk.equals("y")){
                        maze = startMaze();
                        player = findPlayer(maze);
                        monster = findMonster(maze);
                    }
                }
                else if(checkWin(player, maze) == false){
                    System.out.println("The candles flicker in the empty corridor. ");
                    mazeOptions(player, maze);

                }
                else{
                    mazeOptions(player, maze);
                }
            }
        }
    }
}
