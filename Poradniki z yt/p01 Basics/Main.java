import java.util.Scanner; //3
import java.util.Random; //5
import java.util.Arrays; //13

public class Main {

    static int bub = 4; //12 class scope

    public static void main(String[] args)
    {
        // -----------------------------  1  -----------------------------
        System.out.println("\n--------1--------\n");

        // kek

        /* 
        kek 
        */

        /**
         * kek
         */

        System.out.println("kek");
        System.out.print("kek\n");

        // -----------------------------  2  -----------------------------
        System.out.println("\n--------2--------\n");

        int quantity = 69;
        System.out.println(quantity);

        double gpa = 4.0;
        System.out.println(gpa);

        char grade = 'A';
        System.out.println(grade);

        boolean isGaugan = true;
        System.out.println(isGaugan);

        String name = "makapaka";
        System.out.println("name is "+name);

        // -----------------------------  3  -----------------------------
        /* 
        System.out.println("\n--------3--------\n");
        Scanner scanner = new Scanner(System.in);//init

        System.out.print("Enter name: ");//entrer string
        String nm=scanner.nextLine();

        System.out.println("name is "+nm);

        System.out.print("Enter age: ");//enter int
        int ag=scanner.nextInt();
        
        System.out.println("age is "+ag);

        System.out.print("Enter gpa: ");//enter double
        double gp=scanner.nextDouble();// kurde przecinek
        
        System.out.println("gpa is "+gp);

        System.out.print("Are you gaugan?: ");//enter boolean
        boolean gau=scanner.nextBoolean();// true albo false
        
        System.out.println("gaugan: "+gau);


        //common issue

        System.out.print("\n\nEnter age: ");
        int ag2=scanner.nextInt();
        scanner.nextLine();//the fix
        System.out.print("Enter name: ");
        String nm2=scanner.nextLine();

        System.out.println("age is "+ag2);
        System.out.println("name is "+nm2);

        scanner.close();//close
        */
        // -----------------------------  4  -----------------------------
        System.out.println("\n--------4--------\n");
        
        int a=1;
        if(a==0)
        {
            System.out.println("maka");
        }
        else if(a==4)
        {
            System.out.println("paka");
        }
        else
        {
            System.out.println("draka");
        }

        String bak="";

        if(bak.isEmpty())
        {
            System.out.println("co");
        }

        boolean czy = true;
        if(czy)
        {
            System.out.println("tak");
        }

        // -----------------------------  5  -----------------------------
        System.out.println("\n--------5--------\n");

        Random random = new Random();
        int numb;
        numb = random.nextInt(1,7);//7 exclusive
        System.out.println(numb);

        random.nextDouble();//for doubles
        random.nextBoolean();//for bools

        // -----------------------------  6  -----------------------------
        System.out.println("\n--------6--------\n");

        System.out.println(Math.PI);
        System.out.println(Math.E);
        System.out.println(Math.pow(2,3));
        System.out.println(Math.abs(-5));
        System.out.println(Math.sqrt(9));
        System.out.println(Math.round(3.14));
        System.out.println(Math.ceil(3.14));
        System.out.println(Math.floor(2.99));
        System.out.println(Math.max(1,4));
        System.out.println(Math.min(1,4));

        // -----------------------------  7  -----------------------------
        System.out.println("\n--------7--------\n");
        
        System.out.printf("kek: %b\n",true); 
        // %[flags][width][.precision][specifier-character]
        
        //[flags]
        // + = output plus
        // , = output grouping seperators "100,000"
        // ( = negative naumbers in ()
        // space = display minus if negative, space if positive

        //[width]
        // 0 = zero padding "%04d"
        // number = right justified padding "%4d" do prawej
        // negative number = left justified padding "%-4d" do lewej


        // -----------------------------  8  -----------------------------
        System.out.println("\n--------8--------\n");

        String bro = "brom";
        //int len=bro.length();
        //char letter=name.charAt(0);
        //int index=name.indexOf("r");
        //int lastIndex = name.lastIndexOf("o");

        bro = bro.toUpperCase();
        bro = bro.toLowerCase();
        bro = bro.trim();
        bro = bro.replace("m", "n");

        if(bro.isEmpty())
        {
            System.out.println("pusto");
        }
        else
        {
            System.out.println("nie pusto");
        }

        if(bro.contains("kek"))
        {
            System.out.println("brak");
        }
        else
        {
            System.out.println("jest");
        }

        if(bro.equals("mak"))
        {
            System.out.println("tak");
        }
        else
        {
            System.out.println("nie");
        }

        if(bro.equalsIgnoreCase("Mak"))
        {
            System.out.println("tak");
        }
        else
        {
            System.out.println("nie");
        }

        // -----------------------------  9  -----------------------------
        System.out.println("\n--------9--------\n");

        String emil="kek@gjam.kom";
        String usrnm= emil.substring(0,3);//6 inclusive
        System.out.println(usrnm);

        String emil2="kedsasdask@gjam.kom";
        String usrnm2= emil2.substring(0,emil2.indexOf("@"));
        System.out.println(usrnm2);

        // -----------------------------  10  -----------------------------
        System.out.println("\n--------10--------\n");

        System.out.println(makapaka(69));

        // -----------------------------  11  -----------------------------
        System.out.println("\n--------11--------\n");

        System.out.println(add(1,2));
        System.out.println(add(1,2,3));

        // -----------------------------  12  -----------------------------
        System.out.println("\n--------12--------\n");

        int bub=1; //local scope(prefered more than class scope)

        // -----------------------------  13  -----------------------------
        System.out.println("\n--------13--------\n");

        int[] zium ={6,3,5,7};
        System.out.println(zium[2]);

        int lenn=zium.length;
        System.out.println(lenn);

        System.out.print('\n');
        for(int bah : zium)
        {
            System.out.println(bah);
        }

        Arrays.sort(zium);
        System.out.print('\n');

        for(int bah : zium)
        {
            System.out.println(bah);
        }

        Arrays.fill(zium, 173);
        System.out.print('\n');

        for(int bah : zium)
        {
            System.out.println(bah);
        }


        // -----------------------------  14  -----------------------------
        System.out.println("\n--------14--------\n");

        String[] pups;

        pups=new String[5];

        // -----------------------------  15  -----------------------------
        System.out.println("\n--------15--------\n");

        int[] bumbers={1,5,8,3,4,9};
        int tergettt=9;
        boolean isFound=false;

        for(int i = 0 ;i<bumbers.length; ++i)
        {
            if(tergettt==bumbers[i])
            {
                System.out.println("Znalazo na id: " + i);
                isFound = true;
                break;
            }
        }

        if(!isFound)
        {
            System.out.println("nieznalazo");
        }


        // -----------------------------  16  -----------------------------
        System.out.println("\n--------16--------\n");


        System.out.println(add2(2,4,67,69));

        // -----------------------------  17  -----------------------------
        System.out.println("\n--------17--------\n");

        String[][] ban={{"ciuch","muh","buh"},
                        {"och","choch","cioch"},
                        {"ech","bech","meh"}};
        
        for(String[] tek : ban)
        {
            for(String cak : tek)
            {
                System.out.print(cak + ' ');
            }
            System.out.println();
        }
        
        System.out.println(ban[1][2]);

    }

    static String makapaka(int x){
        System.out.println("makapaka: " + x);
        return "kek";
    }

    static int add(int a,int b){
        return a+b;
    }

    static int add(int a,int b,int c){
        return a+b+c;
    }

    static int add2(int... numbers)
    {
        int sum =0;
        for(int x : numbers)
        {
            sum+=x;
        }
        return sum;
    }
}
