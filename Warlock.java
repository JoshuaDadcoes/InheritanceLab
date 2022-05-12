import javafx.scene.image.Image;

public class Warlock extends Character{
    Warlock(String name){
        super(name);
    }
public void job(Character enemyCharacter){
    System.out.println(super.characterName + "attacks" + enemyCharacter.characterName + "with job");
    int damagePoints = 30;
    int ManaCost = 50;
    damageTarget(enemyCharacter, damagePoints, manaPoints);
};
public void heal(Character enemyCharacter){
    System.out.println(super.characterName + " use healing (hp +20)(Mana +13)");
    int recovery=20;
    int mana= 13;
    Recovery(enemyCharacter, recovery, mana); 
};
public void increaseLevel(Character Winner){
    int levelIncrease = 10;
    Level(Winner, levelIncrease);
}
}