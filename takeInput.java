class Geeks{
    
    // Function to take input using Scanner class
    static void IOFunction(){
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t--  > 0){
		    
		    // Your code here
		    int a = sc.nextInt();
		    System.out.println(a);
		    float b = sc.nextFloat();
		    System.out.println(b);
		    long c = sc.nextLong();
		    System.out.println(c);
		    
		    byte d = sc.nextByte();
		    System.out.println(d);
		    
		    sc.nextLine();  
            // This is because when nextByte() method of Scanner class is used to read the value, it reads the value.
            // But the cursor, after reading d, remains just after it.
            // So when the string is read using nextLine() method of Scanner class, this method starts reading from the cursor’s current position.
            // In this case, it will start reading just after the input of d. So the next line after d is just a new line, which is represented by ‘\n’ character. 
            // Hence the output you get for s is just ‘\n’.
            // So, to resolve this issue, you can first consume the leftover new line using the nextLine() method. And then take input for string s. 
		    
			String s = sc.nextLine(); 
		    System.out.println(s);
		}
		
    }
    
}