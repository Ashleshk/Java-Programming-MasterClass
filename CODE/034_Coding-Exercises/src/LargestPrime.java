public class LargestPrime {
    public static int getLargestPrime(int number){
        if(number<2)
            return -1;
        int count =2;
        int result =-1;

        while(count<=number)
        {
            int primtcounter=2;
            boolean primeTest =true;

            while(primtcounter <count)
            {
                primeTest =primeTest && !(count %primtcounter==0);
                primtcounter++;
            }
            if(number %count ==0 && primeTest)
                result=count;
            count++;
        }

        return result;
    }
}
