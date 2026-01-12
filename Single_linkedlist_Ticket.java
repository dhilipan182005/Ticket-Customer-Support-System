import java.util.*;

class Ticket {
    int ticketId;
    String customerName;
    String issue;
    String priority;
    Ticket next;

    Ticket(int id, String name, String issue, String priority) {
        this.ticketId = id;
        this.customerName = name;
        this.issue = issue;
        this.priority = priority;
    }
}

class TicketQueue {
    Ticket head;

    int priorityValue(String p) {
        if (p.equalsIgnoreCase("Critical")) return 3;
        if (p.equalsIgnoreCase("High")) return 2;
        return 1;
    }

    void addTicket(int id, String name, String issue, String priority) {
        Ticket t = new Ticket(id, name, issue, priority);

        if (head == null || priorityValue(priority) > priorityValue(head.priority)) {
            t.next = head;
            head = t;
            return;
        }

        Ticket curr = head;
        while (curr.next != null &&
               priorityValue(curr.next.priority) >= priorityValue(priority)) {
            curr = curr.next;
        }

        t.next = curr.next;
        curr.next = t;
    }

    void resolveTicket() {
        if (head == null) {
            System.out.println("No tickets");
            return;
        }
        System.out.println("Resolved Ticket ID: " + head.ticketId);
        head = head.next;
    }

    void listTickets() {
        if (head == null) {
            System.out.println("No tickets");
            return;
        }
        Ticket curr = head;
        while (curr != null) {
            System.out.println(curr.ticketId + " | " +
                               curr.customerName + " | " +
                               curr.priority + " | " +
                               curr.issue);
            curr = curr.next;
        }
    }
}

public class Single_linkedlist_Ticket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TicketQueue queue = new TicketQueue();

        while (true) {
            System.out.println("\n1.Add 2.Resolve 3.List 0.Exit");
            int ch = sc.nextInt();
            sc.nextLine();

            if (ch == 0) break;

            if (ch == 1) {
                System.out.print("ID: ");
                int id = sc.nextInt(); 
                sc.nextLine();

                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Issue: ");
                String issue = sc.nextLine();

                System.out.print("Priority (Normal/High/Critical): ");
                String priority = sc.nextLine();

                queue.addTicket(id, name, issue, priority);
            } 
            else if (ch == 2) {
                queue.resolveTicket();
            } 
            else if (ch == 3) {
                queue.listTickets();
            }
        }
    }
}
