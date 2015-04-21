package pt.adrz.designpatterns.factory.enemy;

public class TestDriveEnemyFactory {

	public static void main(String args[]) {

		EnemyFactory enemyFactory = new EnemyFactory();

		Enemy enemy = enemyFactory.generateEnemy();

		enemy.attack();
	}
}
