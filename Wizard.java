public class Wizard extends Character{
    Wizard(String name){
        super(name);
    }
    public void fireStorm(Character enemyCharacter){
        System.out.println(super.characterName + "attacks " + enemyCharacter.characterName + " with Firestorm (Damage - 50)");
        int damagePoints = 50;
        damageTarget(enemyCharacter, damagePoints, manaPoints);
    };
    public void heal(Character enemyCharacter){
        System.out.println(super.characterName + "use regen (Hp +25)(Mana 15)");
        int recover=25;
        int mana=15;
        Recovery(enemyCharacter, recover, mana);
    };
    public void IncreaseLevel(Character Winner){
        int levelIncrease = 25;
        Level(Winner, levelIncrease);
    };
}