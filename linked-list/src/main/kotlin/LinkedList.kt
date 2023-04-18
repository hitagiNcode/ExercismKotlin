class Deque<T> {

    private var head: Node<T>? = null
    private var tail: Node<T>? = null
    private var size = 0

    fun push(value: T) {
        if(head == null) {
            head = Node(value)
            tail = head
            size++
            return
        }else {
            val newNode = Node(value, prev = tail)
            tail?.next = newNode
            tail = newNode
            size++
        }
    }

    fun pop(): T? {
        return if(tail == null)
            null
        else{
            val value = tail?.value
            tail = tail?.prev
            if(tail == null) {
                head = null
            }else {
                tail?.next = null
            }
            size--
            value
        }
    }

    fun unshift(value: T) {
        if(head == null) {
            head = Node(value)
            tail = head
            size++
            return
        }else {
            val newNode = Node(value, next = head)
            head?.prev = newNode
            head = newNode
            size++
        }
    }

    fun shift(): T? {
        val value = head?.value
        if (value != null) {
            head = head?.next
            if (head == null) {
                tail = null
            } else {
                head?.prev = null
            }
            size--
        }
        return value
    }

}

data class Node<T>(var value: T, var next: Node<T>? = null, var prev: Node<T>? = null)
