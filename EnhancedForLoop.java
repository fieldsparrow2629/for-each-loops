import java.util.ArrayList;

public class EnhancedForLoop
{
    public static void main(String[] args)
    {
        /********** Examples **********/
        
        int[] arr = {4,5,1,2,3,8};
        
        // Ex. 1
        for (int x: arr)
            System.out.print(x + " ");
        System.out.println();
        
        // Ex. 2
        for (int x: arr)
            x++; // remember, x is a copy of each item in the array
            
        for (int x: arr)
            System.out.print(x + " ");
        System.out.println();
        
        // Ex. 3
        for (int i=0; i<arr.length; i++)
            arr[i]++; // now we are actually changing elements in the array
            
        for (int x: arr)
            System.out.print(x + " ");
        System.out.println();
        
        
        // Ex. 4
        Pet[]   pets = {new Pet("Phineas"),new Pet("Ferb"),new Pet("Perry")};
        
        for (Pet p : pets)
            p.sleep();
        

        for (Pet p : pets)
            System.out.println(p);

        ArrayList<Pet> morePets = new ArrayList<Pet>();
        morePets.add(new Pet("Milo"));
        morePets.add(new Pet("Otis"));
        
        for (int i=morePets.size()-1; i>=0; i--) {
            Pet p = morePets.get(i);
            
            morePets.remove(i);
            p.eat();
        }
        /********** Your turn **********/
        
        // #1 - Write a method mean(double nums[]) which uses an enhanced
        //      for loop to return the mean of the elements in nums. Test
        //      the method here.
        
        double[] nums = {5,6,7,9,15,40,3};
        
        
        double sum = 0;
        for(double x: nums)
        {
            sum += x;
        }
        System.out.println(sum/(nums.length));
        
        // #2 - Write a method max(double nums[]) which uses an enhanced
        //      for loop to return the maximum value of the elements in
        //      nums. Then test the method.
        
        double max = nums[0];
        for(double x: nums)
        {
            if(x > max) max = x;
            
        }
        System.out.println(max);
        
        // #3 - Write a method sumEvenVals that uses an enhanced for 
        //      loop to return the sum of all even values stored in an 
        //      Array.  Then test the method.
        
        double sumEven = 0;
        for(double x: nums)
        {
            if(x%2 == 0) sumEven += x;
        }
        System.out.println(sumEven);

        // #4 - Write a method vowelCount that uses an enhanced for loop
        //      to count the number of vowels (a,e,o,u only) in a list
        //      of words.
        
        String[] words = {"dogs", "cats", "tree", "letter", "apple"};
        
        int vowelCount = 0;
        for(String word: words)
        {
            for(int i = 0; i < word.length(); i++){
                char letter = word.charAt(i);
                if(letter == 'a' || letter == 'i' || letter == 'e' || letter == 'o' || letter == 'u'){
                    vowelCount ++;
                }
            }
        }
        System.out.println(vowelCount);

        // #5 - Write a method sumEvenLocs that uses an enhanced for 
        //      loop to find the sum of all values stored with even 
        //      numbered indices in an Array. Then test the method.
        
        int sumEvenLocs1 = 0;
        int index = 0; 
        for(double x: nums)
        {
            if(index%2 == 0) sumEvenLocs1 += x;
            index ++;
        }
        System.out.println(sumEvenLocs1);
        
        // #6 - Solve #5 using a regular for loop. Then explain why a
        //      regular for loop is more appropriate for that problem.
        
        int sumEvenLocs2 = 0; 
        for(int i = 0; i < nums.length; i++)
        {
            if(i%2 == 0) sumEvenLocs2 += nums[i]; 
        }
        System.out.println(sumEvenLocs2);
        
        // a regular for loop makes more sense because it references and tracks the index of the loop
        // the advanced loop doesnt keep track of the loop
    }
}