import javax.swing.*;
 //czesc
    /**
     *<p>The <tt>Lab1</tt> class presents basics of Java programming.</p>
     * <p>Subject list:</p>
     *<ol>
     * <li>Types</li>
     * <li>Variables</li>
     * <li>Type conversion and casting</li>
     * <li>Arrays</li>
     * <li>String</li>
     * <li>Operators</li>
     * <li>Control flow statements</li>
     * <li>Constructors</li>
     * <li>Static variables and methods</li>
     * <li>Using Swing Components - Dialogs</li>
     * <li>Using Javadoc tool</li>
     * </ol>
     *<p>For more information, see <a href="http://docs.oracle.com/javase/tutorial/reallybigindex.html">Java Oracle Documentation</a></p>
     * @author Rafał Migacz
     */
 
public class Lab1{
 
    private static String surname;
    private static String first_name;
    private static int age;
    private static float average_grade;
   
     /**
     * Reads students personal data and presents them in dialogs
     */
    public static void enterData( ){
             
        surname = JOptionPane.showInputDialog(null,"Enter surname:","Surname",JOptionPane.PLAIN_MESSAGE);
        first_name = (String)JOptionPane.showInputDialog(null,"Enter first name:","Name",JOptionPane.PLAIN_MESSAGE);
        age = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter age:","Age",JOptionPane.PLAIN_MESSAGE));
        average_grade = Float.parseFloat(JOptionPane.showInputDialog(null,"Enter average grade:","Average grade",JOptionPane.PLAIN_MESSAGE));
 
        JOptionPane.showMessageDialog(null,"Surname: "      +surname
                                      +"\nFirst name: "     +first_name
                                      +"\nAge: "            +age
                                      +"\nAverage grade: "  +average_grade,
                                      "Student",
                                      JOptionPane.PLAIN_MESSAGE);
    }
   
    /**
     * Reads a, b and c coefficients of quadratic equation, computes value and presents result using Dialogs
     *
     */
    
    public static void quadraticEquation(){
        
        float a = Float.parseFloat(JOptionPane.showInputDialog(null,"Enter a:","A coefficient",JOptionPane.PLAIN_MESSAGE));
        float b = Float.parseFloat(JOptionPane.showInputDialog(null,"Enter b:","B coefficient",JOptionPane.PLAIN_MESSAGE));
        float c = Float.parseFloat(JOptionPane.showInputDialog(null,"Enter c:","C coefficient",JOptionPane.PLAIN_MESSAGE));
       
        if( a!=0 ){
                 
            float delta = (b*b)-(4*a*c);
            if (delta < 0)
            {
                JOptionPane.showMessageDialog(null,"No roots","Message",JOptionPane.PLAIN_MESSAGE);
            }
                else if(delta == 0)
                {
                    JOptionPane.showMessageDialog(null,"One double root x1 = x2= "+(-b/(2*a)) ,"One pierwiastek",JOptionPane.PLAIN_MESSAGE);
                }
                    else{
                   
                    JOptionPane.showMessageDialog(null,"x1 = "+(-b-Math.sqrt(delta)/(2*a))+"\nx2 = "+(-b+Math.sqrt(delta)/(2*a)),"Double pierwiastki",JOptionPane.PLAIN_MESSAGE);
                       
                        }
       
        }
   
    }
   
    /**
     * Shows a part of Unicode Character Table - codes and characters; prints result in console
     *
     */ 
    public static void unicodeCharacterTable(){
    
        char a='\u0020';
        for(int i=32; i<256; i++,a++){
                System.out.printf("%d=%c ",i,a);
                if(i%10 == 1) System.out.println();
                }
    }
   
    /**
     * Shows multiplication table; reads its size
     */
    public static void multiplicationTable(){
        
        int rows, columns;
       
        rows = Integer.parseInt(JOptionPane.showInputDialog(null,"Rows","Multiplication table",JOptionPane.PLAIN_MESSAGE));
        columns = Integer.parseInt(JOptionPane.showInputDialog(null,"Columns","Multiplication table",JOptionPane.PLAIN_MESSAGE));
       
        int [][] table = new int [rows][columns];
       
        for(int i=0;i<table.length;i++)                 // table.length - how many rows
                for(int j=0;j<table[0].length;j++)      // table.length - how many columns
                {
                table[i][j]=0;
                }
               
        for(int i=0;i<table.length;i++){
                table[i][0]=i+1;
        }
       
        for(int j=0;j<table[0].length;j++){
                table[0][j]=j+1;
                        }
                       
        for(int i=1;i<table.length;i++) {               // table.length - how many rows
                for(int j=1;j<table[0].length;j++)      // table.length - how many columns
                        {
                                table[i][j]=table[0][j]*table[i][0];
                        }
     
        }
       
        for(int i=0;i<table.length;i++){                 // table.length - how many rows
                for(int j=0;j<table[0].length;j++)      // table.length - how many columns
                {
                System.out.print(table[i][j]+" ");
                }
                System.out.println();
   
         }
}
   
    /**
     * Reads coefficients and variable x
     * Computes value of polynomal: W(x)= a*x^3 + b*x^2 + c*x + d. 
     */
    public static void polynomal(){
        
            JOptionPane.showMessageDialog(null,"W(x)= a*x^3 + b*x^2 + c*x + d ","Message",JOptionPane.PLAIN_MESSAGE);
            float w=0;
            float a = Float.parseFloat(JOptionPane.showInputDialog(null,"Enter a:","A coefficient",JOptionPane.PLAIN_MESSAGE));
            float b = Float.parseFloat(JOptionPane.showInputDialog(null,"Enter b:","B coefficient",JOptionPane.PLAIN_MESSAGE));
            float c = Float.parseFloat(JOptionPane.showInputDialog(null,"Enter c:","C coefficient",JOptionPane.PLAIN_MESSAGE));
            float d = Float.parseFloat(JOptionPane.showInputDialog(null,"Enter d:","D coefficient",JOptionPane.PLAIN_MESSAGE));
            float x = Float.parseFloat(JOptionPane.showInputDialog(null,"Enter x:","X",JOptionPane.PLAIN_MESSAGE));
       
            w=a*x+b;
            w=w*x+c;
            w=w*x+d;
           
            JOptionPane.showMessageDialog(null,"Answer is: "+w,"Message",JOptionPane.PLAIN_MESSAGE);
     
}
 
    /**
     * Reads two numbers a,b and compute Greatest Common Divisor and Least Common Divisor
     */
    public static void gcdLcm(){
        
            int a,b;
            a = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a","Number a",JOptionPane.PLAIN_MESSAGE));
            b = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter b","Number b",JOptionPane.PLAIN_MESSAGE));
           
            int tempA=a;
            int tempB=b;
            int lcm_temp;
               
            while(a!=b){
               
                if(a<b) b=b-a;
                else a=a-b;
            }
               
            lcm_temp=(tempA*tempB)/a;
            System.out.println("Greatest common divisor "+tempA+" and "+tempB+" is: "+a);
            System.out.println("Least common divisor "+tempA+" and "+tempB+" is: "+lcm_temp);
}              
        
    /**
     * Computes factorial of n using recursion
     * @param n integer
     * @return factorial of n
     */
    public static int factorial(int n){
        
        if(n <= 1)
        {
                return 1;
        }
                return n*factorial(n-1);
        }
 
    /**
     * Computes value of two series. Reads in precision value.
     */
    public static void series(){
        
        JOptionPane.showMessageDialog(null,"S(1)= 4*sum(k=1 to infinity){((-1)^(k+1))*(1/(2*k-1))}\n"+
                                            "S(2) = sum(k=0 to infinity){1/k!}",
                                            "Message",
                                            JOptionPane.PLAIN_MESSAGE);

        float precision = Float.parseFloat(JOptionPane.showInputDialog(null,"Enter precision e < 0.1:","Precision",JOptionPane.PLAIN_MESSAGE));

        double sum1 = 0, sum2 = 0, temp = 0;
        for(float k=1;;k++){
            temp = Math.pow((-1.0),(k+1.0))*(1.0/(2.0*k-1.0));
            if(Double.compare(Math.abs(temp),precision)>=0){
            sum1 += temp;
            }
            else break;
        }
        sum1 *=4.0;
        temp = 0;

        for(int k=0;;k++){
            temp = 1.0/factorial(k);        //      (float)/(int) !
            if(Double.compare(temp,precision)>=0){
            sum2 += temp;
            }
            else break;
        }
         JOptionPane.showMessageDialog(null,"Sum (1) is: "+sum1
                                            +"Sum (2) is: "+sum2,
                                            "Message",
                                            JOptionPane.PLAIN_MESSAGE);

    }
 
    /**
     * Computes an amount of prime numbers less or equal than n.
     */
    public static void pifunction(){
        
        int sum = 0;  
        JOptionPane.showMessageDialog(null,"Pi(n)=-1+sum(j=3 to infinity){(j-2)!-j*floor((j-2)!/j)} ","Message",JOptionPane.PLAIN_MESSAGE);
   
        int n = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter n","Message",JOptionPane.PLAIN_MESSAGE));
   
        for(int j=3;j<=n;j++){
            sum += factorial(j-2)-j*(Math.floor(factorial(j-2)/j));
        }
        --sum;
            JOptionPane.showMessageDialog(null,"Sum is: "+n);

        }
 
    /**
     * Generates Hofstadter sequence
     */
    public static void sequence(){
   
        JOptionPane.showMessageDialog(null,"Hofstadter sequence","Message",JOptionPane.PLAIN_MESSAGE);
        int n = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter n","Message",JOptionPane.PLAIN_MESSAGE));
        int temp = 0;
        for(int i=0; n!=1; i++)
        {
            if(n%2 == 0)
            {
            temp=n;
            n=n/2;
            System.out.println((i+1)+"      "+temp+"        parzyste        "+n);
            }
            else{
            temp=n;
            n=3*n+1;
            System.out.println((i+1)+"      "+temp+"        nieparzyste     "+n);
            }

        }
}
 
    /**
     * Contains menu that provides all defined methods in Lab1 class
     * @param argv
     */
   
    public static void main (String [] argv){
        int choice;
        do{
            choice = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Options: \n"
                    + "(1) Grade record book \n"
                    + "(2) Quadratic equation \n"
                    + "(3) Unicode character table\n"
                    + "(4) Multiplication table\n"
                    + "(5) Polynomal\n"
                    + "(6) Greatest and least common divisor\n"
                    + "(7) Series\n"
                    + "(8) Pi function\n"
                    + "(9) Hofstadter sequence\n"
                    + "(0) Exit program",
                    "Menu",
                    JOptionPane.PLAIN_MESSAGE));

            switch(choice){
                    case(1): enterData(); break;
                    case(2): quadraticEquation(); break;
                    case(3): unicodeCharacterTable(); break;
                    case(4): multiplicationTable(); break;
                    case(5): polynomal(); break;
                    case(6): gcdLcm(); break;
                    case(7): series(); break;
                    case(8): pifunction(); break;
                    case(9): sequence();break;
                    default: break;

            }
        }
        while ( choice <= 9 && choice >= 1  );

    }
}