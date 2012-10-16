package test.queue

from pollen.data import Queue{uint8} as Queue

module QueueTest {
	
  Queue q(10)
	Queue q2(20)
		
	pollen.run() {
    for (i = 0; i < 10; i++) { q.enqueue(i);  }
    for (i = 0; i < 10; i++) { q.dequeue(i);  }
	}
}