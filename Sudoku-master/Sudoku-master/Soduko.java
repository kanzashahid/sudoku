
public class Sud Task 2{

    
    public static void main(String[] args) {
       System.out.println("REPLACE THE ZEROS TO MAKE A SUDUKO :-");
         int [][]arr1=new int [9][9];
         arr1[0][0]=5;arr1[0][1]=3;arr1[0][4]=7;arr1[1][0]=6;arr1[1][3]=1;arr1[1][4]=9;arr1[1][5]=5;arr1[2][1]=9;arr1[2][2]=8;arr1[2][7]=6;arr1[3][0]=8;arr1[3][4]=6;arr1[3][8]=3;
         arr1[4][0]=4;arr1[4][3]=8;arr1[4][5]=3;arr1[4][8]=1;arr1[5][0]=7;arr1[5][4]=2;arr1[5][8]=6;arr1[6][1]=6;arr1[6][7]=2;arr1[6][8]=8;arr1[7][3]=4;arr1[7][4]=1;arr1[7][5]=9;arr1[7][8]=5;
         arr1[8][4]=8;arr1[8][7]=7;arr1[8][8]=9;
         
        int [][]arr2={{5,3,4,6,7,8,9,1,2},
                      {6,7,2,1,9,5,3,4,8},
                      {1,9,8,3,4,2,5,6,7},
                      
                      {8,5,9,7,6,1,4,2,3},
                      {4,2,6,8,5,3,7,9,1},
                      {7,1,3,9,2,4,8,5,6},
                      
                      {9,6,1,5,3,7,2,8,4},
                      {2,8,7,4,1,9,6,3,5},
                      {3,4,5,2,8,6,1,7,9}};
       
        System.out.print("  ");
        for(int s=0;s<9;s++){System.out.print(" "+s);}
        System.out.println("");
        for (int i=0; i<9;i++)
        {System.out.print(i+" ");
        for (int j=0;j<9;j++)
        {System.out.print(" "+arr1[i][j]);}
            System.out.println(" ");
        }
        
       
       
        System.out.println("Sudoku Game");
       Scanner input=new Scanner (System.in);
       
       
       int wrong=0; int terminator =0;
        while ((wrong<3)&& (terminator<51))
        { 
           
        
       
             while(wrong<5){
                 
             System.out.print("ROW= ");
        int row =input.nextInt();
            System.out.print("COLUMN= ");
        int col=input.nextInt();     
           for(int i=0;i<9;i++)
        {
        for(int j =0;j<9;j++)
        {       
                 
        if((row==0&&col==0)||(row==0&&col==1)||(row==0&&col==4)||(row==1&&col==0)||(row==1&&col==3)||(row==1&&col==4)||(row==1&&col==5)||(row==2&&col==1)||(row==2&&col==2)||(row==2&&col==7)
                ||(row==3&&col==0)||(row==3&&col==4)||(row==3&&col==8)||(row==4&&col==8)||(row==5&&col==0)||(row==5&&col==4)||(row==5&&col==8)||
                (row==6&&col==1)||(row==6&&col==7)||(row==6&&col==8)||(row==7&&col==3)||(row==7&&col==4)||(row==7&&col==5)||(row==7&&col==8)
                ||(row==8&&col==4)||(row==8&&col==7)||(row==8&&col==8))
        {System.out.println("That is already filled");
        
                 System.out.print("Row= ");
         row =input.nextInt();
            System.out.print("Column = ");
         col=input.nextInt();
        }      
        }
        }
         
             System.out.print("Enter Value = ");
            int val=input.nextInt();
                 if((val!=arr2[row][col]) || (val==0))
        {wrong+=1;
            System.out.println((5-wrong)+" Tries Left");}
        else {arr1[row][col]=val;
            terminator++;
            }         
             System.out.print("  ");
        for(int s=0;s<9;s++){System.out.print(" "+s);}
        System.out.println("");
        for (int i=0; i<9;i++)
        {System.out.print(i+" ");
        for (int j=0;j<9;j++)
        {System.out.print(" "+arr1[i][j]);}
            System.out.println(" ");
        }}
        }
        if(terminator==50){System.out.println("You win");}
        }
    
}
