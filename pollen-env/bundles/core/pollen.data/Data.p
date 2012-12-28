
meta {type T, type Q = uint8} class Data {

  T data
  Q length

  Data(T data, Q length) { @data = data; @length = length }  

  host Data(T data, Q length) { @data = data; @length = length }
  
  public T data() { return @data }

  public Q length() { return @length }

  public set(T data, Q length) { @data = data; @length = length }

}