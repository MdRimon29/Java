public class Student_Marks {
    public static void main(String[] args) 
    {
     String[] department = {"CSE", "EEE", "Civil"};
     int dept, st, sc, total = 0;
     double percent = 0;
    // Take the scores of students in a 3D array.
        int[ ][ ][ ] scores = {
                          {{75, 87, 69}, {90, 87, 85},{56, 67, 76}}, 
                          {{78, 67, 75}, {87, 98, 76}, {67, 56, 66}}, 
                          {{72, 63, 72}, {82, 91, 71}, {64, 56, 66}}
                      };
       for(dept = 0; dept < scores.length; dept++)
        {	
           System.out.println("Department " +department[dept]+ ": "); 
           for(st = 0; st < scores[dept].length; st++)
           {
                    System.out.println("Student " +(st + 1)+ " scores: ");	 
                    for(sc = 0; sc < scores[dept][st].length; sc++)
                    {
                        System.out.print(scores[dept][st][sc]+ " ");
                        total += scores[dept][st][sc];
                        percent = (double)total/3;
                    }
                    System.out.println("\nTotal scores: " +total); // Displaying total marks of student.
                    System.out.println("Percentage: " + percent); // Displaying percentage. 
                     total = 0; // reset total to zero.
           }
           System.out.println();
        }
       }
    }