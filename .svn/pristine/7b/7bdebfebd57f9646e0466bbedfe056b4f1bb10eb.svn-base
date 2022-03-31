import java.util.Stack;  
import java.lang.Thread;

public class SorterImplementation implements Sorter {

    Stack<Integer> stk= new Stack<>();  
    
    // This method will take val and push it on to the top of the stack.
    public void pushValue(int val){

        // function name : pushValue
        // args : val (int)
        // return : void

        stk.push(val);  
        System.out.println("Elements in Stack: " + stk);  

    }

    // pop all the values on the stack and push all the popped values based on the operator
    public void pushOperator(String operator){

        // function name : pushOperator
        // args : operator (String)
        // return : void

        QuickSort quickSortobj = new QuickSort();

            int[] array = new int[stk.size()];
            // convert stack to array
            for(int i=0;i<array.length;i++){

                Integer x = (Integer) stk.pop();  
                array[i]=x;

            }
            // sort the array
            int[] result = quickSortobj.sort(array);
            
            if(operator.equals("ascending")){

                System.out.println(operator);

                // push values to stack
                for(int k=0;k<array.length;k++){
                    stk.push(result[k]);

                }

                System.out.println("Elements in Stack: " + stk);  

            }

            if(operator.equals("descending")){
                
                System.out.println(operator);

                // push values to stack in inverse
                for(int l=array.length-1;l>=0;l--){

                    stk.push(result[l]);

                }

                System.out.println("Elements in Stack: " + stk);  

            }
            if(operator.equals("max")){

                System.out.println(operator);
                // return max value
                stk.push(result[0]);
                
                System.out.println("Elements in Stack: " + stk);  

            }
            if(operator.equals("min")){

                System.out.println(operator);
                // return min value
                stk.push(result[array.length-1]);
                
                System.out.println("Elements in Stack: " + stk);  

            }     
     
    }

    // This method will pop the top of the stack and return it to the client.
    public int pop(){

        // function name : pop
        // args : nil
        // return : x (int)

        Integer x = (Integer) stk.pop();
        System.out.println("Elements in Stack: " + stk);  
        return x;
    }

    // This method will pop the top of the stack and return it to the client.
    public boolean isEmpty(){

        // function name : isEmpty
        // args : nil
        // return : result (boolean)

       boolean result = stk.empty();
       return result; 
    }

    // This method will wait millis milliseconds before carrying out the pop operation as above.
    public int delayPop(int millis){

        // function name : pushOperator
        // args : millis (int)
        // return : x (int)

        try {
                        
            // it will sleep the main thread for 1 sec
            // ,each time the for loop runs
            Thread.sleep(millis);

            Integer x = (Integer) stk.pop();  
            System.out.println("Elements in Stack: " + stk);
            return x;
            
        }
        catch (Exception e) {
            
            // catching the exception
            System.out.println(e);
            return -1;
        }
    	
    }
	  
}