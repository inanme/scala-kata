class Emp
class Manager extends Emp
class CEO extends Manager
class Award[+T](val recipient: T) //co, +, super, Generalize, up
class Problem[-T](recipient: T) //contra, -, extends,  Specialize, down
class Action1[+T <: Manager](val recipient: T) //Specialize < extends down
class Action2[-T >: Manager](recipient: T) //Generalize > super up

// Function[-A, +B]
val f1: Function[Manager, Manager] = _ => new CEO
val f2: Function[CEO, Emp] = f1

val ea: Award[Emp] = new Award[Manager](new Manager)
//val ca: Award[CEO] = new Award[Manager](new Manager)

val ep: Problem[Manager] = new Problem[Emp](new Manager)

val action1: Action1[Manager] = new Action1[CEO](new CEO)
val action2: Action2[Manager] = new Action2[Emp](new Emp)