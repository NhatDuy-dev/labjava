package guii;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;

public class ObstacleChaseGame extends JPanel implements ActionListener, KeyListener {

    private int playerX = 250, playerY = 250; // Vị trí ban đầu của nhân vật
    private int playerSpeed = 5; // Tốc độ di chuyển của nhân vật
    private ArrayList<int[]> obstacles = new ArrayList<>(); // Danh sách các chướng ngại vật
    private ArrayList<int[]> obstacleDirections = new ArrayList<>(); // Hướng di chuyển của chướng ngại vật
    private ArrayList<Integer> obstacleSpeeds = new ArrayList<>(); // Tốc độ của từng chướng ngại vật
    private Timer timer; // Timer để cập nhật trò chơi mỗi 20ms
    private boolean gameOver = false; // Trạng thái kết thúc trò chơi
    private int score = 0; // Điểm số của người chơi
    private boolean isImmortal = false; // Trạng thái bất tử của nhân vật
    private long immortalStartTime = 0; // Thời gian bắt đầu trạng thái bất tử

    // Vị trí và trạng thái của vật phẩm màu vàng
    private int itemX, itemY;
    private boolean itemVisible = true;

    // Các biến cờ để kiểm tra phím di chuyển
    private boolean moveUp = false, moveDown = false, moveLeft = false, moveRight = false;

    public ObstacleChaseGame() {
        setFocusable(true); // Đảm bảo JPanel nhận sự kiện bàn phím
        addKeyListener(this); // Gắn KeyListener để nhận sự kiện phím
        setFocusTraversalKeysEnabled(false); // Vô hiệu hóa phím mặc định như Tab

        timer = new Timer(20, this); // Timer gọi `actionPerformed` mỗi 20ms
        timer.start(); // Bắt đầu Timer
        resetGame(); // Thiết lập lại trạng thái ban đầu của game
    }

    private void resetGame() {
        // Khôi phục trạng thái ban đầu khi chơi lại
        playerX = 250;
        playerY = 250;
        gameOver = false;
        score = 0;
        isImmortal = false;
        obstacles.clear(); // Xóa danh sách chướng ngại vật
        obstacleDirections.clear();
        obstacleSpeeds.clear();

        // Thêm 3 chướng ngại vật ngẫu nhiên
        addObstacle();
        addObstacle();
        addObstacle();

        spawnItem(); // Tạo vật phẩm màu vàng
        timer.start(); // Khởi động lại Timer
        repaint(); // Cập nhật giao diện
    }

    private void addObstacle() {
        // Tạo chướng ngại vật ngẫu nhiên
        Random rand = new Random();
        int[] newObstacle = {rand.nextInt(500), rand.nextInt(500)};
        obstacles.add(newObstacle);

        // Tạo hướng ngẫu nhiên (x, y)
        int[] newDirection = {rand.nextInt(4) - 2, rand.nextInt(4) - 2};
        obstacleDirections.add(newDirection);

        // Tạo tốc độ ngẫu nhiên cho chướng ngại vật
        int newSpeed = 2 + rand.nextInt(2);
        obstacleSpeeds.add(newSpeed);
    }

    private void spawnItem() {
        // Sinh ra vị trí ngẫu nhiên cho vật phẩm màu vàng
        Random rand = new Random();
        itemX = rand.nextInt(550);
        itemY = rand.nextInt(550);
        itemVisible = true; // Hiển thị vật phẩm
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Vẽ nền
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 600, 600);

        if (gameOver) {
            // Hiển thị khi trò chơi kết thúc
            g.setColor(Color.RED);
            g.setFont(new Font("Arial", Font.BOLD, 30));
            g.drawString("Game Over!", 200, 250);
            g.setFont(new Font("Arial", Font.PLAIN, 20));
            g.drawString("Điểm số: " + score, 220, 290);
            g.drawString("Nhấn G để chơi lại", 200, 320);
        } else {
            // Hiển thị điểm số và trạng thái bất tử
            g.setColor(Color.BLACK);
            g.setFont(new Font("Arial", Font.PLAIN, 20));
            g.drawString("Score: " + score, 10, 20);

            if (isImmortal) {
                g.setColor(Color.ORANGE);
                g.drawString("BẤT TỬ!", 500, 20);
            }

            // Vẽ nhân vật (màu xanh lá khi bất tử, xanh dương khi thường)
            g.setColor(isImmortal ? Color.GREEN : Color.BLUE);
            g.fillRect(playerX, playerY, 25, 25);

            // Vẽ chướng ngại vật
            g.setColor(Color.RED);
            for (int[] obstacle : obstacles) {
                g.fillOval(obstacle[0], obstacle[1], 30, 30); // Vẽ hình tròn
            }

            // Vẽ vật phẩm màu vàng
            if (itemVisible) {
                g.setColor(Color.YELLOW);
                g.fillRect(itemX, itemY, 20, 20);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!gameOver) {
            score++; // Tăng điểm số mỗi lần `actionPerformed` được gọi

            if (score % 50 == 0) {
                addObstacle(); // Thêm chướng ngại vật mỗi khi đạt điểm chia hết cho 50
            }

            // Kiểm tra hết thời gian bất tử
            if (isImmortal && System.currentTimeMillis() - immortalStartTime > 3000) {
                isImmortal = false;
            }

            // Di chuyển nhân vật dựa vào các cờ
            if (moveUp && playerY > 0) {
                playerY -= playerSpeed;
            }
            if (moveDown && playerY < 570 - 15) {
                playerY += playerSpeed;
            }
            if (moveLeft && playerX > 0) {
                playerX -= playerSpeed;
            }
            if (moveRight && playerX < 570 - 15) {
                playerX += playerSpeed;
            }

            // Di chuyển chướng ngại vật
            for (int i = 0; i < obstacles.size(); i++) {
                int[] obstacle = obstacles.get(i);
                int[] direction = obstacleDirections.get(i);
                int speed = obstacleSpeeds.get(i);

                obstacle[0] += direction[0] * speed;
                obstacle[1] += direction[1] * speed;

                // Đảo ngược hướng nếu chạm tường
                if (obstacle[0] <= 0 || obstacle[0] >= 570) {
                    direction[0] = -direction[0];
                }
                if (obstacle[1] <= 0 || obstacle[1] >= 570) {
                    direction[1] = -direction[1];
                }

                // Kiểm tra va chạm với nhân vật
                if (!isImmortal && new Rectangle(playerX, playerY, 25, 25)
                        .intersects(new Rectangle(obstacle[0], obstacle[1], 30, 30))) {
                    gameOver = true; // Kết thúc trò chơi nếu va chạm
                    timer.stop(); // Dừng Timer
                }
            }

            // Kiểm tra va chạm với vật phẩm màu vàng
            if (itemVisible && new Rectangle(playerX, playerY, 25, 25)
                    .intersects(new Rectangle(itemX, itemY, 20, 20))) {
                isImmortal = true; // Kích hoạt trạng thái bất tử
                immortalStartTime = System.currentTimeMillis();
                itemVisible = false; // Ẩn vật phẩm
            }

            repaint(); // Cập nhật giao diện
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // Nếu trò chơi chưa kết thúc
        if (!gameOver) {
            // Điều khiển di chuyển của nhân vật
            if (e.getKeyCode() == KeyEvent.VK_W) {
                moveUp = true;
            }
            if (e.getKeyCode() == KeyEvent.VK_S) {
                moveDown = true;
            }
            if (e.getKeyCode() == KeyEvent.VK_A) {
                moveLeft = true;
            }
            if (e.getKeyCode() == KeyEvent.VK_D) {
                moveRight = true;
            }

            // Bắt đầu trò chơi nếu nhấn phím Space
            if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                resetGame();  // Bắt đầu trò chơi khi nhấn phím Space
            }
        } else {
            // Nếu trò chơi đã kết thúc, nhấn G để chơi lại
            if (e.getKeyCode() == KeyEvent.VK_G) {
                resetGame();  // Chơi lại khi nhấn phím G
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Ngừng di chuyển khi thả phím
        if (e.getKeyCode() == KeyEvent.VK_W) {
            moveUp = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_S) {
            moveDown = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_A) {
            moveLeft = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_D) {
            moveRight = false;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    public static void main(String[] args) {
        // Tạo đối tượng JFrame mới, đặt tên cửa sổ là "Obstacle Chase"
        JFrame frame = new JFrame("Obstacle Chase");

        // Tạo đối tượng game (trò chơi), là một thể hiện của lớp ObstacleChaseGame
        ObstacleChaseGame game = new ObstacleChaseGame();

        // Thêm đối tượng game vào JFrame, tức là hiển thị trò chơi lên cửa sổ
        frame.add(game);

        // Đặt kích thước của cửa sổ là 600x600 pixel
        frame.setSize(600, 600);

        // Thiết lập hành động khi cửa sổ được đóng (thoát ứng dụng khi đóng cửa sổ)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Đặt cửa sổ JFrame có thể hiển thị (mở cửa sổ)
        frame.setVisible(true);
    }
}
