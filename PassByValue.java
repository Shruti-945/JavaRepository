class PassByValue {
    public static void main(String[] args) {
        int i=10;
        int j=20;
         swap(i,j); /*i,j are passed to swap function by pass by value */
      
        System.out.println(i+ " " + j); /* Not swapped */
    }
    static void swap(int a, int b) /*a and b new variables of int data type are initialized and created */
    {                  //Swapping without 3rd var
         int temp=a;   //a=a+b
         a=b;          //b=a-b 
         b=temp;       //a=a-b 
    }

        
    }

