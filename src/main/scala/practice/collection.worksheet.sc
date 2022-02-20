import scala.collection.mutable

/*
construct collection
*/

val first = mutable.ArrayBuffer(1,2)
val second = mutable.ArrayBuffer(3,4)

// + is updated
// ++ is concat
// - is removed
// -- is removedAll
// +: is prepended
// :+ is appended
// += is addOne
// ++= is addAll

// +=:, +=, ++=, -=, and --= for mutable operations on sequences.

first ++ second

val alphabets = mutable.ArrayBuffer("a", "b", "c", "d", "e", "f")

// does not have to be mutable
alphabets --= List("a", "b")

alphabets.addOne("j")

val account = Map(
    "abcder" -> "jjdfgdfg",
    "sdfsdf" -> "sdfsdfsdf" 
)

account.get("abcder")
/*
query collection
*/

val data = List(7788, -123, 3445)
data.exists(x => x < 0)
data(0)
data.apply(0)
