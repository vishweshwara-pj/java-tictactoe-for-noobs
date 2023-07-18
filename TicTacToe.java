import java.util.*;
public class TicTacToe {

    public static Scanner sc = new Scanner(System.in);
    static char[][] tictactoe = new char[3][3];
    static boolean win = true;
    static char winchar = 'X';
    public static int[] positions = {11,12,13,21,22,23,31,32,33};
    public static void main(String[] args) {
        
        System.out.println("This is the skeleton for the TicTacToe, remember the positions");
        for(int i=1;i<=3;i++)
        {
            for(int j=1;j<=3;j++)
            {
                System.out.print("     "+i+j+"   ");
            }
            System.out.println("\n");
        }
        int q = 1;
        while(win)
        {
            
            int pos=0;
            if(q==1){
                System.out.print("\n'X' position - ");
                pos = sc.nextInt();
                put(tictactoe,pos,'X');
                showMap(tictactoe);
                q=0;
                winchar = checkWinCondition(tictactoe, 'X');
            }
            else{
                System.out.print("\n'O' position - ");
                pos = sc.nextInt();
                put(tictactoe,pos,'O');
                showMap(tictactoe);
                q=1;
                winchar = checkWinCondition(tictactoe,'O');
            }
           
        }
        if(win==false)
        {
            System.out.println(winchar + " is the winner!!");
        }
        else
        {
            System.out.println("Oops!! A Tie.");
        }
        
    }
    
    public static void put(char[][] a,int x, char b)
    {
        int r = x/10;
        int c = x%10;
        a[r-1][c-1] = b;
    }
    
    public static void showMap(char[][] arr)
    {
       for(int i=0;i<tictactoe.length;i++)
        {
            for(int j=0;j<tictactoe[0].length;j++)
            {
                if(arr[i][j]=='O' || arr[i][j]=='X')
                    System.out.print("     "+arr[i][j]+"   ");
                else
                    System.out.print("     -   ");
            }
            System.out.println("\n");
        } 
    }
    
    public static char checkWinCondition(char[][] arr, char w)
    {
        if(arr[0][0]==w && arr[0][1]==w && arr[0][2]==w)
            win=false;
        else if(arr[1][0]==w && arr[1][1]==w && arr[1][2]==w)
            win=false;
        else if(arr[2][0]==w && arr[2][1]==w && arr[2][2]==w)
            win=false;
        else if(arr[0][0]==w && arr[1][1]==w && arr[2][2]==w)
            win=false;
        else if(arr[0][2]==w && arr[1][1]==w && arr[2][0]==w)
            win=false;
        else if(arr[0][0]==w && arr[1][0]==w && arr[2][0]==w)
            win=false;
        else if(arr[0][2]==w && arr[1][2]==w && arr[2][2]==w)
            win=false;
        else if(arr[0][1]==w && arr[1][1]==w && arr[2][1]==w)
            win=false;
        return w;
            
    }
    
}