package kap17_DS_In_MultiThreaded_Umgebung;
/**
import java.util.Comparator;
public class List<T> implements IList<T>
  public List(final Comparator<T> comp, T begin, T end)
  public boolean add(T item)
    Node<T> prev = find(item);
    if (comparator.compare(curr.data, item) == 0)
  public boolean remove(T item)
    Node<T> prev = find(item);
    if (comparator.compare(curr.data, item) == 0)
    return false;
  public boolean contains(T item)
    Node<T> curr = find(item).next;
  private Node<T> find(T item)
    // Die Schleife wird auf jeden Fall terminieren, da wir
    return prev;