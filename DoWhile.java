/*
Syntax of do-while loop in java:
do{
    //body of loop
}while(condition);
*/
//print 0 to 9 using do-while loop
public class DoWhile {
   public static void main(String[] args){
    int i = 0;
    do{
        System.out.println(i);
        i++;    
    }while(i<10);
   } 
}
