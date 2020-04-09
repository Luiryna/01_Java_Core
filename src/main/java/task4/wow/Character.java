package task4.wow;

public class Character implements BattleCry {
    private String name;
    private Race race;
    private CharacterClass characterClass;

    public Character() {

    }

    public Character(String name, Race race, CharacterClass characterClass) {
        this.name = name;
        this.race = race;
        this.characterClass = characterClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public CharacterClass getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(CharacterClass characterClass) {
        this.characterClass = characterClass;
    }

    @Override
    public String scream() {
        String answer = null;
        switch (race){
            case DWARF:
            case HUMAN:
            case DRAINEI:
            case NIGHT_ELF:
            case WORGEN:
                answer = "FOR THE ALLIANCE!";
                break;
            case ORC:
            case TROLL:
            case GOBLIN:
            case TAUREN:
            case UNDEAD:
            case BLOOD_ELF:
                answer = "FOR THE HORDE!";
                break;
        }
        return answer;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", race=" + race +
                ", characterClass=" + characterClass +
                '}';
    }
}
