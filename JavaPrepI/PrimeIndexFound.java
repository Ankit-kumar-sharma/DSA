public class PrimeIndexFound {
    public static void main(String args[]) {
        int arr[] = { 8, 9, 3, 2, 23, 17 };
        PrimeIndexFound obj = new PrimeIndexFound();
        obj.isPrimeIndex(arr);
    }

    public void isPrimeIndex(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if(isPrime(arr[i]))
            {
                System.out.println("The prime number "+arr[i]+" is at index :"+i);
            }
        }
    }
    public boolean isPrime(int num) {
        boolean prime = false;
        if (num > 2) {
            for (int i = 2; i<num; i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                } else {
                    prime = true;
                }
            }
        }
        else
        {
            prime=false;
        }

        return prime;
    }

}
