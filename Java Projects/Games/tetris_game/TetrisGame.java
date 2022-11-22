import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class TetrisGame {
    final String TITLE_OF_PROGRAM = "Tetris";
    final int BLOCK_SIZE = 25;
    final int FIELD_WIDTH = 10; // in blocks
    final int FIELD_HEIGHT = 18;
    final int START_LOCATION = 180;
    final int FIELD_DX = 14;
    final int FIELD_DY = 36;
    final int LEFT = 37;
    final int UP = 38;
    final int RIGHT = 39;
    final int DOWN = 40;
    final int SHOW_DELAY = 350;
    final int[] SCORES = {100, 300, 700, 1500};
    int gameScore = 0;
    int[][] mine = new int[FIELD_HEIGHT+1][FIELD_WIDTH];
    JFrame frame;
    Canvas canvasPanel = new Canvas();
    Figure figure = new Figure();
    boolean gameOver = false;
    final static int[][][] SHAPES = {
            {{0, 0, 0, 0}, {1, 1, 1, 1,}, {0, 0, 0, 0,}, {0, 0, 0, 0,}, {4, 0x00f0f0}}, // I
            {{0, 0, 0, 0}, {0, 1, 1, 0,}, {0, 1, 1, 0,}, {0, 0, 0, 0,}, {4, 0xf0f000}}, // O
            {{1, 0, 0, 0}, {1, 1, 1, 0,}, {0, 0, 0, 0,}, {0, 0, 0, 0,}, {3, 0x0000f0}}, // J
            {{0, 0, 1, 0}, {1, 1, 1, 0,}, {0, 0, 0, 0,}, {0, 0, 0, 0,}, {3, 0xf0a000}}, // L
            {{0, 1, 1, 0}, {1, 1, 0, 0,}, {0, 0, 0, 0,}, {0, 0, 0, 0,}, {3, 0x00f000}}, // S
            {{1, 1, 1, 0}, {0, 1, 0, 0,}, {0, 0, 0, 0,}, {0, 0, 0, 0,}, {3, 0xa000f0}}, // T
            {{1, 1, 0, 0}, {0, 1, 1, 1,}, {0, 0, 0, 0,}, {0, 0, 0, 0,}, {3, 0xf00000}}, // Z
    };
    final static int[][] GAME_OVER_MSG = {
            {0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0},
            {1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0},
            {0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0},
            {0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0},
            {0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0},
            {0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0},
            {0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0},
            {0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0},
            {0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0},
            {0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0},
            {0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0},
            {0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0},
    };
    Random random = new Random();
    public static void main(String[] args) {
        new TetrisGame().go();
    }

    void go(){
        frame = new JFrame(TITLE_OF_PROGRAM);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(FIELD_WIDTH * BLOCK_SIZE + FIELD_DX, FIELD_HEIGHT * BLOCK_SIZE + FIELD_DY);
        frame.setLocation(START_LOCATION, START_LOCATION);
        frame.setResizable(false);
        canvasPanel.setBackground(Color.black);

        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(!gameOver){
                    if(e.getKeyCode() == UP) figure.rotate();
                    if(e.getKeyCode() == DOWN) figure.down();
                    if(e.getKeyCode()== LEFT || e.getKeyCode() == RIGHT) figure.move(e.getKeyCode());
                }
                canvasPanel.repaint();
            }
        });
        frame.getContentPane().add(BorderLayout.CENTER, canvasPanel);
        frame.setVisible(true);

        Arrays.fill(mine[FIELD_HEIGHT], 1);

        //main game loop

        while (!gameOver) {
            try {
                Thread.sleep(SHOW_DELAY);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            canvasPanel.repaint();
            if (figure.isTouchGround()) {
                figure.leaveOnTheGround();
                checkFilling();
                figure = new Figure();
                gameOver = figure.isCrossGround();
            } else {
                figure.stepDown();
            }
        }
    }

    void checkFilling(){

    }

    public class Canvas extends JPanel {
        @Override
        public void paint(Graphics g){
            super.paint(g);
            for (int x = 0; x < FIELD_WIDTH; x++) {
                for (int y = 0; y < FIELD_HEIGHT; y++) {
                    if(mine[y][x]>0){
                        g.setColor(new Color(mine[y][x]));
                        g.fill3DRect(x*BLOCK_SIZE+1,y*BLOCK_SIZE+1,BLOCK_SIZE-1,BLOCK_SIZE-1,true);
                    }
                }
            }
            figure.paint(g);
        }
    }
    public class Block {
        final int ARC_RADIUS = 6;
        final int BLOCK_SIZE = 25;
        private int x, y;

        public Block(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void setX(int x) {
            this.x = x;
        }

        public void setY(int y) {
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
        void paint(Graphics g, int color){
            g.setColor(new Color(color));
            g.drawRoundRect(x*BLOCK_SIZE+1, y*BLOCK_SIZE+1, BLOCK_SIZE-2, BLOCK_SIZE-2, ARC_RADIUS, ARC_RADIUS);
        }
    }

    public class Figure {
        ArrayList<Block> figure = new ArrayList<>();
        private int[][] shape = new int [4][4];
        private int type, size, color;
        private int x=3, y=0;

        public Figure() {
            type = new Random().nextInt(SHAPES.length);
            this.size = SHAPES[type][4][0];
            this.color = SHAPES[type][4][1];
            if(size==4) this.y = -1;
            for (int i = 0; i < size; i++) {
                System.arraycopy(SHAPES[type][i], 0, this.shape[i], 0, SHAPES[type][i].length);
            }
            createFromShape();
        }
        void createFromShape(){
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (shape[j][i]==1) figure.add(new Block(i+this.x, j+this.y));
                }
            }
        }

        void rotate(){

        }
        void down(){
            while (!isTouchGround()) stepDown();
        }
        void move(int destination){
            if(!isTouchWall(destination)){
                int dx = destination-38;
                for(Block block: figure) block.setX(block.getX()+dx);
                x += dx;
            }

        }
        boolean isTouchGround(){
            for(Block b: figure) if(mine[b.getY()+1][b.getX()]>0) return true;
            return false;
        }
        void leaveOnTheGround(){
            for(Block b:figure) mine[b.getY()][b.getX()] = color;
        }
        boolean isCrossGround(){
            return false;
        }
        void stepDown(){
            for(Block b:figure) b.setY(b.getY()+1);
        }
        void paint(Graphics g){
            for (Block b:figure) b.paint(g, color);
        }
        boolean isTouchWall(int destenetion){
            for(Block block: figure){
                if(destenetion == LEFT && (block.getX() == 0 || mine[block.getY()][block.getX()-1] > 0)) return true;
                if(destenetion == RIGHT && (block.getX() == FIELD_WIDTH-1 || mine[block.getY()][block.getX()+1] > 0)) return true;
            }
            return false;
        }
    }

}