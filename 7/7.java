public static void main(String[] args){
		System.out.println(new Reverse().reverse(-0));
	}
    public int reverse(int x) {
        long i = 0;
        boolean flag = true;
        if (x < 0){
        	flag = false;
        	x = -x;
        }
        while (x != 0){
        	System.out.println("x now is " + x);
        	i *= 10;
        	i += x % 10;
        	x /= 10;
        	System.out.println("i now is " + i);
        }
        if (i > Integer.MAX_VALUE || i < Integer.MIN_VALUE){
        	return 0;
        }
        return flag ? (int)i : (int)-i;
        
    }