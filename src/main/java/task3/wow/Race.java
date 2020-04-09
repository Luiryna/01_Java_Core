package task3.wow;

import task3.wow.Fraction;

public enum Race {
    HUMAN(Fraction.ALLIANCE),
    NIGHT_ELF(Fraction.ALLIANCE),
    DWARF(Fraction.ALLIANCE),
    WORGEN(Fraction.ALLIANCE),
    DRAINEI(Fraction.ALLIANCE),
    ORC(Fraction.HORDE),
    UNDEAD(Fraction.HORDE),
    TAUREN(Fraction.HORDE),
    TROLL(Fraction.HORDE),
    BLOOD_ELF(Fraction.HORDE),
    GOBLIN(Fraction.HORDE);

    private Fraction fraction;

    Race(Fraction fraction) {
        this.fraction = fraction;
    }

    public Fraction getFraction() {
        return fraction;
    }
}
