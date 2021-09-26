package tasks;

public class Task {
    public static void main(String args[]) {
        //initial and assign sum 
        double sum = 0.0;
        
        //initialize and assign numbers
        int startNumber = 0;
        int endNumber = 1000000000;
        

        
        //generate a table header for the output
        System.out.println("Index \t Sum \tTimeTaken(nano seconds) \tTimeTaken(Milli Seconds)");
         
        //looping through first billion numbers
         double startTimeForALoop = System.nanoTime();
        for(int i=startNumber; i<=endNumber;i++){
            //calcuting start time for each row
            double startTimeForEachRow = System.nanoTime();
            
            //summing up numbers
            sum += i;
            
            //getting the end time
            double endTimeForEachRow = System.nanoTime();
            
            double elaspedTimeForEachRow = (endTimeForEachRow - startTimeForEachRow);
            System.out.println(i+"\t\t "+sum + "\t"+elaspedTimeForEachRow+" \t\t\t\t\t\t"+elaspedTimeForEachRow/1000000);
            
            
            //get end time
        }
        double endTimeForALoop = System.nanoTime();
        
        //total time taken for a loop
        double  elaspedTimeForALoop = endTimeForALoop - startTimeForALoop;
        System.out.println("\nTotal"+"\t "+sum+ "\t"+elaspedTimeForALoop+ "\t\t\t\t"+elaspedTimeForALoop/1000000+"\n");
        
      


    }
}