package tutorial5_2;
public class Tutorial5_2 {
    public static void main(String[] args) {
        stairs();   //printing a step
        five_stairs();  //printing 5 steps
        human();    //print a man standing on a step
        human_on_stairs.humanStairs(2);     //print a man on stair
        
    }
    
    public static void stairs(){
        for(int i=0;i<=4;i++){
            if(i==4)
                System.out.println("* * * *");
            else
                System.out.println("      *");
        }
    }  
    public static void stairs1(int number){
        String blah="";
        for(int i=0;i<number;i++){
            blah += "       ";
        }
        for(int i=0;i<=4;i++){
            if(i==4)
                System.out.println(blah+"* * * *");
            else
                System.out.println(blah+"      *");
        }
        
}
    public static void five_stairs(){
        for(int i=0;i<5;i++)
            stairs1(5-i);
    }
    
    public static void human(){
        System.out.println("   0  *");
        System.out.println("  /|\\ *");
        System.out.println("   |  *");
        System.out.println("  / \\ *");
        System.out.println("* * * *");
    }
    
}