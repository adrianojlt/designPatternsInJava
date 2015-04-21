package pt.adrz.designpatterns.factory.enemy;

import java.util.Random;

public class EnemyFactory {

	public Enemy generateEnemy() {

		Enemy enemy = null;
		Random random = new Random();

		int typeOfEnemy = random.nextInt(10);

		if (typeOfEnemy < 2)
			enemy = new Sniper();
		else if (typeOfEnemy >= 2 && typeOfEnemy < 6)
			enemy = new Infantry();
		else if (typeOfEnemy >= 6)
			enemy = new Tank();
		else
			return null;

		return enemy;
	}
}
