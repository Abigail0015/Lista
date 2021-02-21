package paquete.uaslp.ingenieria.labs.list;

class node
{
    int Date;
    node next;
    node previous;

    public int getDate()
    {
        return Date;
    }

    public void setDate(int date)
    {
        Date = date;
    }

    public node getNext()
    {
        return next;
    }

    public void setNext(node next)
    {
        this.next = next;
    }

    public node getPrevious()
    {
        return previous;
    }

    public void setPrevious(node previous)
    {
        this.previous = previous;
    }
}
