public class functionsss implements interfacee {
    public  Boolean checkprimeno(Integer a){
        int i,m=0,flag=0;
        boolean check  =false;
        m=a/2;
        if(a==0||a==1){
//            System.out.println(a+" is not prime number");
            check =false;
        }else{
            for(i=2;i<=m;i++){
                if(a%i==0){
                    flag=1;
//                    System.out.println(a+" is not prime number");

                     check =false;
                     break;

                }
            }
            if(flag==0)  {
//                System.out.println(a+" is prime number");
                return check =true;
            }
        }
        return check;

    }
    public  boolean checkecevnodd(Integer a){
        boolean c = false;

        if(a % 2 == 0)
        {
            c =true;
        }
        else
        {
            c =false;
        }
        return c;
    }
    public int getavgerage(int[] arr){
            double total = 0;

            for(int i=0; i<arr.length; i++){
                total = total + arr[i];
            }



            double average = total / arr.length;



            return (int) average;
        }
    public boolean isPalindrome(String str) {

        int i = 0, j = str.length() - 1;


        while (i < j) {


            if (str.charAt(i) != str.charAt(j))
                return false;

            i++;
            j--;
        }

        // Given string is a palindrome
        return true;
    }

    public double ictof(double c) {
        Double F = c * (9f / 5) + 32;
        return F;
    }

    public double ictok(double k) {
        float K = (float) (k + 273.15);
        return K;
    }



}

