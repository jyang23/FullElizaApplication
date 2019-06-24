import java.util.Scanner;
import java.io.*;

public class Main {


    public static void responseHi()
    {
        System.out.println("hello! It's nice to meet you!!");
        System.out.println("How can I help you today?");


    }

    public static void responseReplacement(String x)
    {
        x.replace("i","you");
        x.replace("me","you");
        x.replace("my","you");
        x.replace("am","you");
        System.out.println("Why do you say "+x+"?");
    }

    public static void responseTellMeMore()
    {
        System.out.println("Please tell me more");
    }
    public static void responseWorry()
    {
        System.out.println("Don't worry, look on the bright side, stay positive!");
    }
    public static void responseMean()
    {
        System.out.println("People can be so mean.");
    }
    public static void responseDontKnow()
    {
        System.out.println("You dont? Lets think about it for a bit.");
    }
    public static void responseBye()
    {
        System.out.println("Im so sorry to see you go :(");
    }

    public static void responseGettingLate()
    {
        System.out.println("It is getting late, maybe we had better quit");
    }
    public static void responseIDunno()
    {
        System.out.println("I understand, this can be hard sometimes.");
        System.out.println("Why not try taking a step back and do something you enjoy to relax?");
    }
    public static void responseThink()
    {
        System.out.println("You seem to think that, but why?");
    }
    public static void responseCry()
    {
        System.out.println("Don't Cry, these things happen.");
    }
    public static void responseHelp()
    {
        System.out.println("I am always here to help :)");
    }
    public static void responseHmm()
    {
        System.out.println("Hmm...I can see where you are coming from");
    }
    public static void responseShe()
    {
        System.out.println("They What?");
    }
    public static void responseThanks()
    {
        System.out.println("No problem, I am here for you");
    }
    public static void main(String[] args) {

        System.out.println("Hello, I am Eliza, what is your problem?");

        Scanner in = new Scanner(System.in);
        String input = "";
        boolean flag = true;

        while(flag)
        {
            System.out.println("Enter your Response here or Q to quit:");
            input = in.nextLine();
            input = input.toLowerCase();

            if(input.contains("hello")||input.contains("hi"))
            {
                responseHi();
            }
            else if(input.contains("i") && input.contains("think"))
            {
                responseThink();
            }
            else if(input.contains("because")||input.contains("well")||input.contains("since"))
            {
                responseTellMeMore();
            }
            else if(input.contains("worry")||input.contains("worried"))
            {
                responseWorry();
            }
            else if(input.contains("mean") && input.contains("they") && input.contains("are"))
            {
                responseMean();
            }
            else if(input.contains("i") && input.contains("dont") && input.contains("know"))
            {
                responseDontKnow();
            }
            else if(input.contains("tired") && input.contains("getting"))
            {
                responseGettingLate();
            }
            else if(input.contains("cry") && input.contains("sad"))
            {
                responseCry();
            }
            else if(input.contains("can") && input.contains("you") && input.contains("help"))
            {
                responseHelp();
            }
            else if(input.contains("please") && input.contains("and") && input.contains("understand"))
            {
                responseHmm();
            }
            else if(input.contains("friend"))
            {
                responseShe();
            }
            else if(input.contains("helpful")||input.contains("thanks")||(input.contains("thank") && input.contains("you")))
            {
                responseThanks();
            }
            else if(input.equals("Q")||input.equals("q")||input.equals("bye")||input.equals("I am feeling great"))
            {
                responseBye();
                flag = false;
            }
            else if(input.contains("i") || input.contains("me") || input.contains("my") || input.contains("am"))
            {
                responseReplacement(input);
            }
            else
            {
                responseIDunno();
            }
        }
        System.out.println("Have a nice day and feel better!!!");



    }
}
