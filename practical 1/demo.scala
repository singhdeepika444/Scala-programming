class Calculator() // class
{
	// variable declaration and initialisation
	var sum:Int=0
	var dif:Int=0
	var mul:Int=0
	var div1:Float=0
	var div2:Int=0
	def calculation(x:Int,y:Int) // method for performing operation
	{
		println("value of x: "+ x +"\nvalue of y: "+ y +"\n")
		sum=x+y         // addition
		dif=x-y        // substraction 
		mul=x*y       // multiplication 
		div1=x/y     // division
		div2=x%y    // modulus
	}
	def show() // method to print operation result
	{
		println("x + y = "+sum)
		println("x - y = "+dif)
		println("x * y = "+mul)
		println("x / y = "+div1)
		println("x % y = "+div2)
	}
}
object calculate
{
	def main( args: Array[String])
	{
		var obj1=new Calculator()   // object of class Calculator
                 val obj2=new Calculator()  // object of class Calculator
 

		obj1.calculation(22,7)     // function call with help of object
		obj1.show()


                obj2.calculation(22,7)     // function call with help of object
		obj2.show()
	}
}