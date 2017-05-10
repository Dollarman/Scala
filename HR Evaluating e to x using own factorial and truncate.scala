object Solution {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        var a0 = 0;
        while(a0 < n){
            var x = sc.nextDouble();
            a0+=1;
            println( trunc(exp(x), 4) )
        }
    }
    def exp(x : Double) : Double = {
        var a : Double = 1;
        for (i <- 1 until 10) {
            a += math.pow(x,i) / fac(i);
        }
        return a;
    }
   def fac(n : Int) : Int = {((1 to n) :\ 1) ( _ * _ ) }
   def trunc(x: Double, n: Int) = {
   def p10(n: Int, pow: Long = 10): Long = if (n==0) pow else p10(n-1,pow*10)
    if (n < 0) {
        val m = p10(-n).toDouble
        math.round(x/m) * m;
    }
    else {
        val m = p10(n).toDouble
        math.round(x*m) / m;
    }
  }
}