/*
 * Copyright (c) 2013 dusan.saiko@gmail.com
 */
package org.saiko.ai.genetics.tsp;


/**
 * @author dusan.saiko@gmail.com
 * 
 * TSPConfiguration specifies the configuration parameters of the application
 */
public class TSPConfiguration {

   /**
    * Antialiasing flag for graphics rendering.
    * Slows the displaying quite a lot.
    */
   protected boolean antialiasing=true;

   /**
    * Initial population count which is set to the computation engine.
    */
   protected int initialPopulationSize=1000;
   
   /**
    * Computation thread priority
    * @see Thread#setPriority(int)
    */
   protected int threadPriority=5;
   
   /**
    * Population growth between two generations.
    * This flag does not apply for all the engines.
    */
   protected double populationGrow=0.00075;
   
   /**
    * Ratio (0..1), how much the population should undergo random mutation 
    */
   protected double mutationRatio=0.25;
   
   /**
    * The count of generation which give the same best result after which the program should stop
    * computations; 
    */
   protected int maxBestCostAge=100;
   
   /**
    * flag that this computation should be done without GUI
    * @see TSP#main(String[]) 
    */
   protected boolean console=false;
   
   /**
    * Should the cost be computed like square root of distance, instead of 
    * only distance itself ? This should prefer the solutions with short distances inside of it
    * e.g. distances 5 6 3 6 2 give total distance 22 
    *      distances 2 2 1 3 13 give total distance 21
    * but in rms the distance at first examle is 5*5+6*6+3*3+6*6+2*2 = 110
    * and second example rms distance is 187.
    */
   protected boolean rmsCost=false;
   
   /**
    * @return antialiasing flag for graphics rendering. Slows the displaying quite a lot.
    */
   public boolean isAntialiasing() {
      return antialiasing;
   }
   
   /**
    * @return initial population count which is set to the computation engine.
    */
   public int getInitialPopulationSize() {
      return initialPopulationSize;
   }
   
   /**
    * @param initialPopulationSize Initial population count which is set to the computation engine.
    */
   public void setInitialPopulationSize(int initialPopulationSize) {
      this.initialPopulationSize=initialPopulationSize;
   }
   
   /**
    * @return Returns the maxBestCostAge.
    */
   public int getMaxBestCostAge() {
      return maxBestCostAge;
   }
   
   /**
    * @param maxBestCostAge The maxBestCostAge to set.
    */
   public void setMaxBestCostAge(int maxBestCostAge) {
      this.maxBestCostAge=maxBestCostAge;
   }
   
   /**
    * @return ratio (0..1), how much the population should undergo random mutation 
    */
   public double getMutationRatio() {
      return mutationRatio;
   }
   
   /**
    * @param mutationRatio Ratio (0..1), how much the population should undergo random mutation 
    */
   public void setMutationRatio(double mutationRatio) {
      this.mutationRatio=mutationRatio;
   }
   
   /**
    * @return Population growth between two generations.
    * This flag does not apply for all the engines.
    */
   public double getPopulationGrow() {
      return populationGrow;
   }
   
   /**
    * @param populationGrow Population growth between two generations.
    * This flag does not apply for all the engines.
    */
   public void setPopulationGrow(double populationGrow) {
      this.populationGrow=populationGrow;
   }
   
   /**
    * @return flag, id the cost should be computed like square root of distance, instead of 
    * only distance itself ? This should prefer the solutions with short distances inside of it
    * e.g. distances 5 6 3 6 2 give total distance 22 
    *      distances 2 2 1 3 13 give total distance 21
    * but in rms the distance at first examle is 5*5+6*6+3*3+6*6+2*2 = 110
    * and second example rms distance is 187.
    */
   public boolean isRmsCost() {
      return rmsCost;
   }
   
   /**
    * @param rmsCost Flag, id the cost should be computed like square root of distance, instead of 
    * only distance itself ? This should prefer the solutions with short distances inside of it
    * e.g. distances 5 6 3 6 2 give total distance 22 
    *      distances 2 2 1 3 13 give total distance 21
    * but in rms the distance at first examle is 5*5+6*6+3*3+6*6+2*2 = 110
    * and second example rms distance is 187.
    */
   public void setRmsCost(boolean rmsCost) {
      this.rmsCost=rmsCost;
   }
   
   /**
    * @return computation thread priority
    * @see Thread#setPriority(int)

    */
   public int getThreadPriority() {
      return threadPriority;
   }
   
   /**
    * @param threadPriority Computation thread priority
    * @see Thread#setPriority(int)
    */
   public void setThreadPriority(int threadPriority) {
      this.threadPriority=threadPriority;
   }

   
}