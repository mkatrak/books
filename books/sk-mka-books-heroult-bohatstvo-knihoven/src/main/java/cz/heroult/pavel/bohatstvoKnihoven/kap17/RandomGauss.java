package cz.heroult.pavel.bohatstvoKnihoven.kap17;

/////////////////////////////////////////////////////////////////
//                                                             //
// Tento zdrojov� k�d je sou��st� distribuce bal�ku program�,  //
//     poskytovan�ch jako dopl�uj�c� informace ke knize        //
//                                                             //
//                   Java -- bohatstv� knihoven                //
//                II. opraven� a roz���en� vyd�n�              //
//                                                             //
//     P�e�t�te si, pros�m, d�kladn� upozorn�n� v souboru      // 
//                       Cti_me.txt                            //
//        kter� je ned�lnou sou��st� t�to distribuce           //
//                                                             //
//                 (c) Pavel Herout, 2006                      // 
//                                                             //
/////////////////////////////////////////////////////////////////

import java.util.*;

public class RandomGauss {
  static int pocet = 21;

  public static void main(final String[] args) {
    if (args.length == 1)
      pocet = Integer.parseInt(args[0]);

    Random r = new Random(123);
    double[] d = new double[100000];
    for (int i = 0;  i < d.length;  i++)
      d[i] = r.nextGaussian();
//      d[i] = r.nextDouble();

    Arrays.sort(d);
    double max = Math.max(Math.abs(d[0]), d[d.length - 1]);

    for (int i = 0;  i < d.length;  i++)
      d[i] /= max;

    double[] h = new double[pocet + 1];
    for (int i = 0;  i < d.length;  i++) {
      int j = (int) ((d[i] * (pocet / 2 + 1)) + (pocet / 2 + 1));
      if (j >= pocet)
        j = pocet;
      h[j]++;
    }

    max = 0.0;
    for (int i = 0;  i < h.length;  i++) {
      if (max < h[i])
        max = h[i];
    }

    for (int i = 0;  i < h.length;  i++) {
      h[i] /= max;
      h[i] *= 60;
    }

    for (int i = 0;  i < h.length;  i++) {
      for (int j = 0;  j < h[i];  j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}

