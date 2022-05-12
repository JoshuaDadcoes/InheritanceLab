public class Character {
    public String characterName = "Gandalf";
    public int level = 0;
    public static int healthPoints = 100;
    public static int manaPoints = 200;

    /**
     * Create two Constructors
     * 1 - Non Parameterized Constructor
     * 2 - Parameterized Constructor Initializing healthPoints, level, CharacterName and mana
     */
    Character(String name){
        characterName = name;
    }
    Character(int newHp, int newLevel, int newMana){
        healthPoints = newHp;
        level= newLevel;
        manaPoints = newMana;
    } 

    /**
     * Create a Method that displays the Name of the Character
     * eg. "Character Initialized : Gandalf"
     */
    public void displayName(){
        System.out.println("Character Initialized: " + this.characterName);
    }
    /**
     * Create a method to Damage Target Character
     */
    public void damageTarget(Character enemyCharacter,int damagePoints, int manaPoints){
        /**
         * Deduct health points from enemy character
         */
        enemyCharacter.healthPoints -= damagePoints;
        System.out.println(" enemy character HP Left = " + enemyCharacter.healthPoints);
        System.out.println(characterName + " wins the battle");

        /**
         * Prompt Character is defeated if HP falls below 0
         * eg. Character Shaman defeated.
         */
        if(enemyCharacter.healthPoints <= 0){
            System.out.println(enemyCharacter.characterName + " is now defeated\n");
            System.out.println(characterName + " wins the battle");
        }
    }


public void Recovery(Character character, int heal, int IncreaseMana){
    /**
     * deduct health points from eney character
     */
    Character.healthPoints += heal;
    Character.manaPoints += heal;
    System.out.println("Enemy character Hp total = " + character.healthPoints);
    System.out.println("Enemy character Mana total = " + character.manaPoints);
    System.out.println("\n");
}
public void Level(Character CharLevel, int level){
    CharLevel.level = level;
    System.out.println(characterName +"has reach level" + CharLevel);

}
}