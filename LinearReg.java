// Main.java
import java.lang.Math;


class Main {
    public static void main(String[] args) {
    	
    	
    	double[][] arrPoints = {{0,118.84}, {1,-24.66}, {2,127.39}, {3,-46.58}, {4,78.65}, {5,-67.13}, {6,-23.18}, {7,25.11}, {8,25.84}, {9,38.19}, {10,99.76}, {11,100.67}, {12,80.58}, {13,210.67}, {14,78.72}, {15,-21.62}, {16,162.65}, {17,41.26}, {18,81.25}, {19,59.91}, {20,158.24}, {21,34.47}, {22,203.17}, {23,18.79}, {24,140.31}, {25,43.9}, {26,135.72}, {27,162.05}, {28,191.33}, {29,66.65}, {30,115.78}, {31,3.8}, {32,172.29}, {33,140.05}, {34,214.17}, {35,109.76}, {36,49.42}, {37,101.8}, {38,25.93}, {39,249.79}, {40,337.3}, {41,171.75}, {42,123.57}, {43,244.68}, {44,230.44}, {45,166.03}, {46,284.51}, {47,218.96}, {48,151.44}, {49,144.74}, {50,351.61}, {51,68.23}, {52,104.28}, {53,144.41}, {54,91.6}, {55,114.37}, {56,150.22}, {57,270.79}, {58,155.77}, {59,204.18}, {60,151.74}, {61,142.32}, {62,157.69}, {63,214.76}, {64,134.6}, {65,229.58}, {66,165.57}, {67,223.94}, {68,281.46}, {69,150.29}, {70,327.89}, {71,180.94}, {72,306.5}, {73,230.38}, {74,196.46}, {75,231.85}, {76,317.89}, {77,304.56}, {78,301.08}, {79,286.36}, {80,330.8}, {81,415.13}, {82,295.88}, {83,380.21}, {84,102.6}, {85,207.88}, {86,163.56}, {87,295.39}, {88,348.9}, {89,371.29}, {90,331.33}, {91,146.06}, {92,349.63}, {93,155.35}, {94,318.58}, {95,325.32}, {96,297.32}, {97,300.58}, {98,200.84}, {99,16.38}};
    	double smallestError = Double.MAX_VALUE;
    	//System.out.println(smallestError)
    	double X2 = 0.1;
    	double Y2 = 0.1;
    	double finalX=0;
    	double finalY = 0;
    	double slope = (Y2)/(X2);
    	double residue1;
    	double residue2;
    	double residue3;
    	double totalResidue = 0;
      
      double outlierX = Double.MAX_VALUE;
      double outlierY = Double.MAX_VALUE;
      
      double a;
      double b;
      double c;
    	
    // 	for (int i = 0; i < 100; i ++) {
    	  
    	  
    // 	  for (int j = 0; j < 100; j ++) {
    // 	    //distance formula = a^2...
    // 	    //find residue:
    // 	    //System.out.println(smallestError);
    // 	   //line function = y2 = slope*X2 + 0 
    //   	   for (int[] point : arrPoints){
    //   	     totalResidue += Math.abs(point[1] - slope*point[0]);
    //   	     //System.out.println(totalResidue);
    //   	   }
    // 	   //if (smallestError == 10000 ) {
    // 	   //  smallestError = totalResidue; 
    // 	   //}
    // 	   //System.out.println(totalResidue);
    	   
    // 	   if (totalResidue< smallestError) {
    // 	     //System.out.println("EEEEEEEEEE");
    // 	     smallestError = totalResidue;
    // 	     finalX = X2;
    // 	     finalY = Y2;
    // 	   }
    	   
    // 	   // Y1+=0.1;
    // 	    Y2 += 0.1;
    // 	    slope = (Y2-Y1)/(X2-X1);
    // 	    totalResidue = 0;
    // 	  }
    	  
    // 	//  X1+=0.1;
    // 	  X2 +=0.1;
    // 	  slope = (Y2-Y1)/(X2-X1);
    // 	  totalResidue = 0;
    // 	}
    for (int i = 0; i < 100; i++) {
      X2 = 0.1 * i; // Adjust X2 incrementally
        for (int j = 0; j < 100; j++) {
          Y2 = 0.1 * j; 
          
     
          slope = Y2/X2;
          totalResidue = 0;
            
          
          for (double[] point : arrPoints) {
            totalResidue += Math.abs(point[1] - slope * point[0]);
            System.out.println(totalResidue);
          }
            
          // Check if current totalResidue 
          if (totalResidue < smallestError) {
            //System.out.println(totalResidue);
            smallestError = totalResidue;
            finalX = X2;
            finalY = Y2;
          }
        }
      }
      
    	
    	System.out.println("Here:");
    	System.out.println(smallestError);
    	
    // 	System.out.println("Array of points: ");
    // 	for (int i = 0; i < arrPoints.length; i++) {System.out.print(arrPoints[i]);}
    	System.out.println(finalX);
    	System.out.println(finalY);
    	System.out.println("Line slope: ");
      double o = finalY/finalX;
    	System.out.println(o);
    	System.out.println("The B value is 0"); 
    	
    }
    
    
}