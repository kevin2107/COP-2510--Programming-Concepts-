//“I pledge my Honor that I have not cheated, and will not cheat, on this assignment” Kevin Ramnauth

public class Nautical
{
   //Convert a Nautical mile to kilometers and miles
   public static void main(String[] args)
   {   
   double kilonaut = 1.852; //kilometer of 1 nautical mile
   double milenaut = 1.150779; //miles of 1 nautical mile
   
   int naut = 314;
   double nauttokilo = naut*kilonaut; //nautical miles multiplied by kilometers
   double nauttomile = naut*milenaut;//nautical miles multipled by miles
   
   System.out.println(naut + " nautical miles is equivalent to:");
   System.out.println(nauttokilo + " kilometers or " + nauttomile + " miles");
   }
}

