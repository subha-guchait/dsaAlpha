class Queue {
  constructor() {
    this.q = [];
    this.front = -1;
    this.rear = -1;
  }
  enqueue(el) {
    if (this.front == -1) {
      this.front = this.front + 1;
    }
    this.rear = this.rear + 1;

    this.q[this.rear] = el;
  }

  dequeue() {
    if (this.isEmpty) {
      return -1;
    }
  }

  isEmpty() {
    return this.q.length == 0;
  }

  getFirstElement() {
    return this.q[this.front];
  }

  getRearElement() {
    return this.q[this.rear];
  }
}
