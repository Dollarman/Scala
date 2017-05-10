// This function will be used while invoking "Summation" to compute
 // The area under the curve.

 def f(coefficients:List[Int],powers:List[Int],x:Double):Double =
   {
     var result : Double = 0;
     for (i <- 0 until powers.length) {
        result += math.pow(x,powers(i)) * coefficients(i);
     }
     return result;
      //Fill Up this function body
        // To compute the value of the function
        // For the given coefficients, powers and value of x
   }

  // This function will be used while invoking "Summation" to compute 
  // The Volume of revolution of the curve around the X-Axis
  // The 'Area' referred to here is the area of the circle obtained
  // By rotating the point on the curve (x,f(x)) around the X-Axis
  def area(coefficients:List[Int],powers:List[Int],x:Double):Double = 
   {
      return math.pow(f(coefficients,powers,x),2) * math.Pi;
      //Fill Up this function body
        // To compute the area of the circle on revolving the point
         // (x,f(x)) around the X-Axis
        // For the given coefficients, powers and value of x
   }


   // This is the part where the series is summed up
   // This function is invoked once with func = f to compute the area         // under the curve
    // Then it is invoked again with func = area to compute the volume 
    // of revolution of the curve
// INPUTS: Func , upperLimit :INT, lowerLimit :INT, coefficients :List, powers :List
// OUTPUTS: Double the completed sum of the integraled polynomial.
   def summation(func:(List[Int],List[Int],Double)=>Double,upperLimit:Int,lowerLimit:Int,coefficients:List[Int],powers:List[Int]):Double = {
      // Fill up this function
      var res : Double = 0.0;
      val upD : Double = upperLimit.toDouble;
      var x : Double = lowerLimit.toDouble;
       
       while (x <= upD) {
          res += func(coefficients,powers,x);
          x += 0.001;
      }
       return math.round(res* 0.001);
   }


// The Input-Output functions will be handled by us. You only need to concentrate your effort on the function bodies above.
