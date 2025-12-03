public class BouncingBall {
    public static void main(String[] args) {
        // Set the dimensions of the window (console)
        int width = 40;
        int height = 10;

        // Ball's initial position
        int ballX = 0;
        int ballY = 0;

        // Ball's speed (dx, dy are the directions in which the ball moves)
        int dx = 1;
        int dy = 1;

        while (true) {
            // Clear the console
            clearConsole();

            // Print the window with the ball
            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    if (x == ballX && y == ballY) {
                        System.out.print("O");  // The ball
                    } else {
                        System.out.print(" ");  // Empty space
                    }
                }
                System.out.println();
            }

            // Update the ball's position
            ballX += dx;
            ballY += dy;

            // Bounce the ball off the walls
            if (ballX <= 0 || ballX >= width - 1) {
                dx = -dx;  // Reverse horizontal direction
            }
            if (ballY <= 0 || ballY >= height - 1) {
                dy = -dy;  // Reverse vertical direction
            }

            // Slow down the animation (simulate real-time)
            try {
                Thread.sleep(100);  // Pause for 100ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // Method to clear the console
    private static void clearConsole() {
        try {
            // Windows
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // Unix or Mac
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}