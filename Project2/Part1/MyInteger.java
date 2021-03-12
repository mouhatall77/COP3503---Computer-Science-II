class MyInteger {
    //Data fields
    private int value;

    //Constructor that creates a MyInteger Object
    public MyInteger(int value){
        this.value = value;
    }

    //Returns value
    public int getValue() {
        return value;
    }

    //Method that return true is value is even
    public boolean isEven() {
        return ((value%2)==0);
    }

    //Return true if is odd
    public boolean isOdd() {
        boolean odd;
        if (!((value%2)==0)) odd = true;
        else odd = false;
        return odd;
    }

    //Return true if value is Prime
    public boolean isPrime(){
        if (value <= 1)
            return false;

        for (int i=2; i<value; i++){
            if (value % i == 0)
                return false;
        }
        return true;
    }

    //Test is specified value is static
    public static boolean isEven(int n){
        return ((n%2)==0);
    }

    //Test if specified value id odd
    public static boolean isOdd(int n) {
        boolean odd;
        if (!((n%2)==0)) odd = true;
        else odd = false;
        return odd;
    }

    //Test is specified value is prime
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i=2; i<n; i++){
            if (n % i == 0)
                return false;
        }
        return true;
    }

    /** Return true if the value in the object is equal to the specified value */
    public boolean equals(int anotherNum){
        return (anotherNum == value);
    }

    /** return true if the value in the object is equal to the specified value */
    public boolean equals(MyInteger obj){
        return (obj.value == this.value);
    }
}
