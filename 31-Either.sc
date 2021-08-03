

def myDoubleOnlyPositives(x:Int): Int = {
  if (x < 0) throw new IllegalArgumentException(String.valueOf(x))
  x * 2
}


def myDoubleOnlyPositivesWithEither1(x:Int): Either[IllegalArgumentException, Int] = {
  if (x < 0) Left(new IllegalArgumentException(String.valueOf(x)))
  else Right(x * 2)
}

trait DeleteStatus {
  def statusCode: Int
}

final case object DeleteSuccess extends DeleteStatus {
  val statusCode = 1
}

final case object DeleteSystemFailure extends DeleteStatus {
  val statusCode = -1
}

final case object DeleteRequestFailure extends DeleteStatus {
  val statusCode = -2
}

def myDoubleOnlyPositivesWithEither(x:Int): DeleteStatus Either Int = {
  if(x == 0) Left(DeleteSystemFailure)
  else if (x < 0) Left(DeleteRequestFailure)
  else Right(x* 2)
}


myDoubleOnlyPositivesWithEither(0)
myDoubleOnlyPositivesWithEither(-2)
myDoubleOnlyPositivesWithEither(2)
