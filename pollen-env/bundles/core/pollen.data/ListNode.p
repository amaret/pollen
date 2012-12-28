
meta {type T}

class ListNode {

  T data
  uint8 next
  uint8 prev
  
  ListNode(T data, uint8 next, uint8 prev) {
    @data = data
    @next = next
    @prev = prev
  }
  
  host ListNode(T data, uint8 next, uint8 prev) {
    @data = data
    @next = next
    @prev = prev
  }

  public T data() {
    return @data
  }
  
  public uint8 next() {
    return @next
  }

  public uint8 previous() {
    return @prev
  }
  
  public position(uint8 next, uint8 prev) {
    @next = next
    @prev = prev
  }
  
}