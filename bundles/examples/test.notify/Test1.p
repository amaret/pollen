import pollen.environment
from pollen.time import Timer

from MyPackage import MyType
from pollen.notify import Notice{MyType}

module Test1 {

  pollen.run() {
    MyType t()
    Notice n(test0, t) 
    Timer.start(n, 250);
    pollen.environment.run()
  }

  test0(MyType t) {
  
  }
}

