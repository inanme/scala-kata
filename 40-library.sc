import scala.util._

class Customer(id: Int)

def getCustomer(id: Int): Try[Customer] =
  if (id < 0) Failure(new IllegalArgumentException("invalid customer id"))
  else Success(new Customer(id))

class Event()

def pollEvents(): Option[Event] =
  if (scala.math.random() > .5d) None
  else Some(new Event())

pollEvents()

//.map, flatMap,foreach, fold
