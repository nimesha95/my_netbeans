
package tutorial5_2;

public class human_on_stairs {
    public static void humanStairs(int human_step){
        for(int i=1;i<=5;i++){
            if(i==6-human_step){
                humanz(human_step);
            }
            else
                Tutorial5_2.stairs1(6-i);
        }}
    
    public static void humanz(int human_step){
        String blah="";
        for(int i=0;i<human_step;i++){
            blah += "       ";
        }
        System.out.println(blah+ "   0  *");
        System.out.println(blah+ "  /|\\ *");
        System.out.println(blah+ "   |  *");
        System.out.println(blah+ "  / \\ *");
        System.out.println(blah+ "* * * *");
    }
}

