class Player {

    //Player details
    String username;
    String rank;
    int level;

    //Constructor for player
    Player(String username, String rank, int level) {
        this.username = username;
        this.rank = rank;
        this.level = level;
    }

    void display() {
        System.out.println(username + " | " + rank + " | " + level);
    }
}


//Queue class for matchmaking System
class MatchmakingQueue {

    Player[] queue; //Array to store players
    int front; // points to first player
    int rear; // points to last player
    int size; //Maximum Queue size

    //Consrtuctor
    MatchmakingQueue(int size) {
        this.size = size;  //to assign queue size
        queue = new Player[size]; // then creating new player

        // this shows the queue starts empty
        front = -1;
        rear = -1;
    }

    //check if queue is empty
    boolean isEmpty() {
        return front == -1;
    }

    //Check of Queue full
    boolean isFull() {
        return rear == size - 1;
    }


    //Add player to Queue
    void enqueue(Player player) {

        //check overflow condiiton
        if (isFull()) {
            System.out.println("Queue Full");
            return;
        }

        //if first player enter"
        if (isEmpty()) {
            front = 0;
        }

        //move forward and add new player
        queue[++rear] = player;
        System.out.println(player.username + " joined");
    }

    //Remove player from queue
    Player dequeue() {

        //Check underflow condition
        if (isEmpty()) {
            System.out.println("Queue Empty");
            return null;
        }

        //store first player temporarily
        Player temp = queue[front];

        if (front == rear) { //if only one player exists
            front = rear = -1; //reset queue
        } else {
            front++; // move forward
        }

        return temp; //Return removed player
    }

    //Display all players in queue
    void displayQueue() {

        //check if queue is empty
        if (isEmpty()) {
            System.out.println("Queue Empty");
            return;
        }

        //traverse and display queue
        for (int i = front; i <= rear; i++) {
            queue[i].display();
        }
    }
}

class Main {

    public static void main(String[] args) {

        //Create matchmaking queue with size 5
        MatchmakingQueue q = new MatchmakingQueue(5);

        Player p1 = new Player("Abrantha", "Gold", 32);
        Player p2 = new Player("John", "Silver", 15);
        Player p3 = new Player("Sara", "Platinum", 48);

        //add players to queue
        q.enqueue(p1);
        q.enqueue(p2);
        q.enqueue(p3);

        //display current queue
        System.out.println("\nQueue:");
        q.displayQueue();

        //match first player
        System.out.println("\nMatched:");

        Player m = q.dequeue();

        //display matched player
        if (m != null) {
            m.display();
        }

        //diplay remaining queue
        System.out.println("\nQueue After Match:");
        q.displayQueue();
    }
}