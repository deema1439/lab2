import java.util.*;
public class lab2 {

    public static void reverse(ArrayList<Integer> list4) {
        int first = 0;
        int last = list4.size() - 1;
        while (first < last) {
            int temp = list4.get(first);
            list4.set(first, list4.get(last));
            list4.set(last, temp);
            first++;
            last--;
        }
    }

    /// ////////////////////////////////////////////////////////////////


    public static void elemnts(ArrayList<Integer> list5) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = s.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.println("elmante " + (i + 1) + ":");
            int elements = s.nextInt();
            list5.add(elements);
        }
    }

    public static void display(ArrayList<Integer> list5) {
        if (list5.isEmpty()) {
            System.out.println("empty you have to put elemant first ");
        } else {
            System.out.println(list5);
        }
    }

    public static void search(ArrayList<Integer> list5) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the elemnts that you want to search for:");
        int ele = s.nextInt();
        int index = list5.indexOf(ele);
        System.out.println("elemnt in index:" + index);
    }

    public static void sort(ArrayList<Integer> list5) {
        if (list5.isEmpty()) {
            System.out.println("array is empty ");
            return;
        }
        Collections.sort(list5);
        System.out.println("array sorted");
        display(list5);
    }

    public static void random(Scanner s){
        System.out.println("enter the minimum value of the range: ");
        int rangemin=s.nextInt();
        System.out.println("enter the maximum value of the range: ");
        int maxrang=s.nextInt();
        System.out.println("enter the number of random numbers: ");
        int numberof=s.nextInt();
        Random r=new Random();
        for(int i=0;i<numberof;i++){
        int randomnum=r.nextInt(rangemin,maxrang+1);
        System.out.println("random number "+randomnum);
        }
    }

    public static int checklength(String password){
                int length = password.length();
                if (length >= 8) {
                    return 3;
                } else if (length >= 6) {
                    return 2;
                } else {
                    return 0;
                }
            }


    public static int specialcharacters(String password) {

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (!Character.isLetterOrDigit(c)) {
                return 2;
            } else {
                return 0;
            }
        }
        return 0;
    }


        public static int uppercaselowercase(String password){
            boolean upper=false;
            boolean lower=false;
            for (int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);
                if (Character.isUpperCase(c)) {
                    upper=true;
                } else if (Character.isLowerCase(c)) {
                    lower=true;
                }
            }

            if (upper && lower) {
                return 3;
            } else {
                return 0;
            }
        }


    static void fibonacci(int n)
    {
        int num1=0, num2=1;
        for (int i = 0; i < n; i++) {
            System.out.print(num1 +" ");
            int num3 = num2 + num1;
            num1=num2;
            num2=num3;
        }
    }









    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        //Q1:


        ArrayList<String>list=new ArrayList<>(5);

        list.add("cat");
        list.add("dog");
        list.add("red");
        list.add("is");
        list.add("am");//{"","","","",}
        int largest =list.get(0).length();
        for (String compoier : list) {
            if (compoier .length() > largest)
                largest = compoier .length();
        }
        ArrayList<String> result = new ArrayList<>();
        for (String compoier2 : list){
            if (compoier2 .length() == largest)
                result.add(compoier2);
    }
        System.out.println(result);


        //Q2

        ArrayList<Integer>list2=new ArrayList<>();
        System.out.println("enter the size: ");
        int size=s.nextInt();
        System.out.println("enter the elements: ");
        for(int i=0;i<size;i++){
            System.out.println("element "+(i+1)+":");
            int elements=s.nextInt();
            list2.add(elements);
        }
        System.out.println("enter an element that you want to know their count: ");
        int element=s.nextInt();
        int count1=0;
        for(int i=0;i<size;i++){
            if(list2.get(i)==element)
            count1++;
        }
        System.out.println(element+" occurs "+count1+" times ");

        //Q3
        ArrayList<Integer>list3=new ArrayList<>();
        System.out.println("enter the size: ");
        int size1=s.nextInt();
        System.out.println("enter the elements: ");
        for(int i=0;i<size1;i++){
            System.out.println("element "+(i+1)+":");
            int elements=s.nextInt();
            list3.add(elements);
        }
        System.out.println("3 largest elements of the said array are :");
        for (int k = 0; k < 3; k++) {
            int larg = list3.get(0);
            for (int i = 1; i < list3.size(); i++) {
                if (list3.get(i) > larg) {
                    larg = list3.get(i);
                }
            }
            System.out.print(larg + " ");
            list3.remove(Integer.valueOf(larg));
        }

        //Q4 methode 1
        ArrayList<Integer> list4 = new ArrayList<Integer>();
        System.out.println("enter the size: ");
        int size2=s.nextInt();
        System.out.println("enter the elements: ");
        for(int i=0;i<size2;i++){
            System.out.println("element "+(i+1)+":");
            int elements=s.nextInt();
            list4.add(elements);
        }
        reverse(list4);
        System.out.println("the revarce is: ");
        for(int i =0;i<list4.size();i++){
            System.out.print(list4.get(i));
        }

        //Q5
        ArrayList<Integer> list5 = new ArrayList<>();
        int choose;
        do {
            System.out.println(" 1-Accept elements of an array ");
            System.out.println(" 2-Display elemnts of an array ");
            System.out.println(" 3-serch elements of an array ");
            System.out.println(" 4-sort the array");
            System.out.println(" 5-exit");
            choose = s.nextInt();
            switch (choose) {
                case 1:
                    elemnts(list5);
                    break;
                case 2:
                    display(list5);
                    break;
                case 3:
                    search(list5);
                    break;
                case 4:
                    sort(list5);
                    break;
                default:
                    System.out.println("you stop it . ");
            }

        } while (choose != 5);


        //Q6

        random(s);

        //Q7
        System.out.println("enter your password ");;
        String  password=s.nextLine();
        checklength(password);
        specialcharacters( password);
        uppercaselowercase(password);
        int sum= checklength(password)+specialcharacters( password)+uppercaselowercase(password);
        System.out.println("the sum of points: "+sum);
        if(sum>=8){
            System.out.println("password is strength");
        }else if (sum>=5){
            System.out.println("password is moderately");;
        }else{
            System.out.println("password is week");
        }

        //Q8

        System.out.println("enter number of n : ");
        int number=s.nextInt();
        fibonacci(number);























































    }









}




















































