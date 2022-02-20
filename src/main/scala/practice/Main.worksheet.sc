val greeting = "hello!"
println(greeting)
def loop: Int = loop
def x = loop

val msg: String = "I was compiled by Scala 3. :)"
val e = "eee"

val a = List(78, 11, 12, 31)

33 :: a

a match {
    case Nil => "nil!"
    case x::xs => s"$x,$xs"
}

a.map(x => x * 2)

case class Num(value: Int)

given n: Num = Num(42)
def f(using x: Num): Int = x.value

println(f(using Num(0)))

case class Name(text: String)

def world = Name("world")
world


val foo: (Int, Int) => Float  = (a, b) => a / b

foo(3, 10)