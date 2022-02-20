case class Employee(name: String, age: Int)

val employeeList = List(
    Employee("Mark", 32), Employee("Alice", 27), Employee("Allen", 28)
)

val ids = List("7886", "125", "8904")

val olds: List[(String, String)] =
    for
        employee <- employeeList
        id <- ids
        if employee.age > 30
    yield (employee.name, id)


for (x <- employeeList) println(x.age)

employeeList.foreach(x => println(x.age))

for el <- List(1,2,3,4) yield el + 1
