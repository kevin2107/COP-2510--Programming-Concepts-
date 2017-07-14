public class AttackerSuccessProbability
{
   //instance data
   private double ProbabilityTheAttackerFindsNextBlock;
   private double ProbabilityAnHonestNodeFindsNextBlock;

   //Constructors - Accepts Paramaters
   public AttackerSuccessProbability (double q, int z)
   {
      ProbabilityTheAttackerFindsNextBlock = q;
      ProbabilityAnHonestNodeFindsNextBlock = z;
   }
   //Constructor - does not accept paramaters
   public AttackerSuccessProbability ()
   {
      ProbabilityTheAttackerFindsNextBlock = 0;
      ProbabilityAnHonestNodeFindsNextBlock = 0;
   }
   //Mutators
   public void setAttackerSuccessProbability(double qUP, int zUP)
   {
      ProbabilityTheAttackerFindsNextBlock = qUP;
      ProbabilityAnHonestNodeFindsNextBlock = zUP;
   }

   //Return Methods
   public double solveAttackerSuccessProbability(double q, int z)
   {
      double p = 1.0 - q;
      double lambda = z * (q/p);
      double sum = 1.0;
      int i, k;
      for (k = 0; k <= z; k++)
      {
         double poisson = Math.exp(-lambda);
         for (i = 1; i <= k; i++)
          poisson *= lambda / i;
         sum -= poisson * (1- Math.pow(q/p, z -k));
       }
       return sum;
   }

   public double toDouble()
   {
      return solveAttackerSuccessProbability(0.1, 0);
   }
}