package practice

@main def hello: Unit = 
  println("Hello world!")
  println(sqrt(4))

def msg = "I was compiled by Scala 3. :)"


def sqrt(x: Double) = {

  def abs(n: Double): Double = 
    val result = if n > 0 then n else -1 * n
    result
  
  def square(n: Double): Double = 
    n * n

  def sqrtIter(guess: Double, x: Double): Double =
    if (isGoodEnough(guess, x)) guess
    else sqrtIter(improve(guess, x), x)

  def improve(guess: Double, x: Double) =
    (guess + x / guess) / 2

  def isGoodEnough(guess: Double, x: Double) =
    abs(square(guess) - x) < 0.001

  sqrtIter(1.0, x)
}
