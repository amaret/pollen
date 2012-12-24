from pollen.environment import Notifier

module Test0 {

  pollen.run() {
    Notice n(test0) 
    Timer.start(n, 250);
    pollen.environment.run()
  }

  test0() {
  
  }
}