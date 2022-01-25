package com.vss.code.model;

public class Node<T> {
    private Node<T> next;
    private T data;

    public Node(final T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(final Node<T> next) {
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(final T data) {
        this.data = data;
    }
}
