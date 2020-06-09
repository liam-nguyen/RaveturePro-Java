package assignment.inheritance.game;

public class Game {
    public static void main(String[] args) {
        GameObject player = new Player();
        GameObject enemy = new Enemy();

        player.update();
        enemy.update();
    }
}
