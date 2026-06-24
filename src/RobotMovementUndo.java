public class RobotMovementUndo {



    // Grid dimensions (size x size)
    static int size = 7;

    // Robot's current position on the grid (x = column, y = row)
    static int x = 3;
    static int y =3;


    // Stack to track move history for undo functionality
    static Stack moves = new Stack(50);

    public RobotMovementUndo() {
    }


    // Prints the current state of the grid to the console
    // 'R' marks the robot's position; '.' marks empty cells
    static void displayGrid(){
        for(int i =0; i<size; i++){
            for(int j=0; j< size; j++){
                if(i ==y && j ==x){


                    // Print robot marker at its current position
                    System.out.print("R");


                }else{
                    // Print empty cell
                    System.out.print("  .  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }


    // Attempts to move the robot in the given direction
    // Pushes the direction onto the move stack if the move is valid
    static void move(String dir){
        dir = dir.toUpperCase();


        // Calculate the new position without modifying the current position yet
        int nx = x;
        int ny = y;

        switch(dir){
            case "UP":ny--; break;// Move up decreases row index
            case "DOWN":ny++;break;// Move down increases row index
            case "LEFT":nx++;break;// Move left decreases column index
            case "RIGHT":nx++;break;// Move right increases column index
            default:return;// Ignore unrecognized directions



        }


        // Validate that the new position is within grid boundaries
        if(nx<0|| nx>=size || ny<0 ||ny>=size){
            System.out.println("Invalid move");
            return;

        }



        // Apply the new position
        x = nx;
        y =ny;



        // Record the move so it can be undone later
        moves.push(dir);

        System.out.println("Move:" + dir);
        displayGrid();

    }





    // Reverts the robot's last move by popping from the move stack
    // and moving in the opposite direction
    static void undo(){

        if(moves.isEmpty()){
            System.out.println("Nothing to undo");
            return;
        }



        // Retrieve the last recorded move
        String last =moves.pop();



        // Move in the opposite direction to reverse the last move
        switch(last){
            case"UP":y++;break;
            case"DOWN":y--;break;
            case"LEFT":x++;break;
            case"RIGHT":x--;break;
        }


        System.out.println("Undo:"+last);
        displayGrid();
    }




    public static void main(String[]args){

        // Display the initial grid with the robot at the center
        displayGrid();


        // Perform a sequence of moves
        move("UP");
        move("UP");
        move("RIGHT");
        move("RIGHT");
        move("DOWN");



        // Undo the last three moves one at a time
        undo();
        undo();
        undo();
    }


}


