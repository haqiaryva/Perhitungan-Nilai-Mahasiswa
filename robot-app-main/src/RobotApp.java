import java.util.Scanner;
import Model.Layout;
import Model.Position;
import Model.Robot;

public class RobotApp {
    private Layout layout;
    private Robot robot;
    private Scanner scanner;

    public RobotApp() {
        this.layout = new Layout(10, 10, '*');
        this.robot = new Robot('o', new Position(0, 0));
        this.scanner = new Scanner(System.in);

        System.out.println("-------- Permainan Dimulai --------");
        String instruction;
        do {
            draw();
            instruction = waitInstruction();
            if (!instruction.equals("x")) {
                processInstruction(instruction);
            }
        } while (!instruction.equals("x"));
    }

    private String waitInstruction() {
        System.out.println("-------- Instruksi --------");
        System.out.println("Instruksi: {d=kanan/a=kiri/w=atas/s=bawah}{jumlah langkah}");
        System.out.println("Contoh: w3 berarti 'keatas 3 langkah'");
        System.out.print("Masukan instruksi: ");
        return scanner.nextLine();
    }

    private void processInstruction(String instruction) {
        String direction = instruction.substring(0, 1);
        int step = Integer.parseInt(instruction.substring(1));

        switch (direction) {
            case "d":
                moveRobot(step, 0);
                break;
            case "a":
                moveRobot(-step, 0);
                break;
            case "w":
                moveRobot(0, -step);
                break;
            case "s":
                moveRobot(0, step);
                break;
            default:
                System.out.println("Instruksi tidak dikenali, permainan selesai");
        }

        checkRobotPosition();
    }

    private void moveRobot(int deltaX, int deltaY) {
        int newX = robot.getPosition().getX() + deltaX;
        int newY = robot.getPosition().getY() + deltaY;

        robot.getPosition().setX(newX);
        robot.getPosition().setY(newY);
    }

    private void checkRobotPosition() {
        if (robot.getPosition().getX() < 0 || robot.getPosition().getX() >= layout.getMaxX() ||
            robot.getPosition().getY() < 0 || robot.getPosition().getY() >= layout.getMaxY()) {
            System.out.println("-------- Permainan Selesai --------");
            System.exit(0);
        }
    }

    private void draw() {
        System.out.println("------ Posisi Terbaru ------");

        for (int y = 0; y < layout.getMaxY(); y++) {
            for (int x = 0; x < layout.getMaxX(); x++) {
                if (x == robot.getPosition().getX() && y == robot.getPosition().getY()) {
                    System.out.print(robot.getIcon());
                } else {
                    System.out.print(layout.getArea()[x][y]);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new RobotApp();
    }
}