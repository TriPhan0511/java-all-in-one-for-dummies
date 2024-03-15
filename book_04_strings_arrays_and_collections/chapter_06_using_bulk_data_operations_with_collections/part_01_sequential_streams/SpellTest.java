package book_04_strings_arrays_and_collections.chapter_06_using_bulk_data_operations_with_collections.part_01_sequential_streams;

import java.util.ArrayList;
import java.util.OptionalDouble;

public class SpellTest {
    
    public static void main(String[] args) {
        ArrayList<Spell> spells = new ArrayList<>();
        spells.add(new Spell("Aparecium", Spell.SpellType.SPELL,
    "Makes invisible ink appear."));
        spells.add(new Spell("Avis", Spell.SpellType.SPELL,
        "Launches birds from your wand."));
        spells.add(new Spell("Engorgio", Spell.SpellType.CHARM,
        "Enlarges something."));
        spells.add(new Spell("Fidelius", Spell.SpellType.CHARM,
        "Hides a secret within someone."));
        spells.add(new Spell("Finite Incatatum", Spell.SpellType.SPELL,
        "Stops all current spells."));
        spells.add(new Spell("Locomotor Mortis", Spell.SpellType.CURSE,
        "Locks an opponent's legs."));

        // spells.stream().forEach(s -> System.out.println(s));
        // Aparecium
        // Avis
        // Engorgio
        // Fidelius
        // Finite Incatatum
        // Locomotor Mortis

        // List just the spells, not the charms or curses
        // spells.stream()
        //     .filter(s -> s.type == Spell.SpellType.SPELL)
        //     .forEach(s -> System.out.println(s));
        // Aparecium
        // Avis
        // Finite Incatatum

        // spells.stream()
        //     .filter(s -> s.type == SpellType.SPELL)
        //     .filter(s -> s.name.toLowerCase().startsWith("a"))
        //     .forEach(s -> System.out.println(s));
        // Aparecium
        // Avis

        ArrayList<Spell> spells2 = new ArrayList<>();
        spells2.add(new Spell("Aparecium", Spell.SpellType.SPELL,
    "Makes invisible ink appear.", 1.0));
        spells2.add(new Spell("Avis", Spell.SpellType.SPELL,
        "Launches birds from your wand.", 1.5));
        spells2.add(new Spell("Engorgio", Spell.SpellType.CHARM,
        "Enlarges something.", 2.0));
        spells2.add(new Spell("Fidelius", Spell.SpellType.CHARM,
        "Hides a secret within someone.", 2.5));
        spells2.add(new Spell("Finite Incatatum", Spell.SpellType.SPELL,
        "Stops all current spells.", 3.0));
        spells2.add(new Spell("Locomotor Mortis", Spell.SpellType.CURSE,
        "Locks an opponent's legs.", 3.5));        

        // spells2.stream()
        //     .mapToDouble(s -> s.price)
        //     .forEach(s -> System.out.println(s));
        // 1.0
        // 1.5
        // 2.0
        // 2.5
        // 3.0
        // 3.5

        // Calculate the average
        System.out.println("Average = " + avg(spells2));
        // Average = 2.25
    }

    private static double avg(ArrayList<Spell> spells) {
        OptionalDouble out = 
            spells.stream()
                .mapToDouble(s -> s.price)
                .average();
            if (!out.isPresent()) {
                return 0.0;
            }
            return out.getAsDouble();
    }
}
