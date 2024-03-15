package book_04_strings_arrays_and_collections.chapter_06_using_bulk_data_operations_with_collections.part_02_parallel_streams;

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

        // Note that when you use a parallel stream, you can’t predict the order in which
        // each element of the stream is processed. That’s because when the stream is split
        // and run on two or more threads, the order in which the processor executes the
        // threads is not predictable.

        System.out.println("First Parallel stream:");
        spells.parallelStream().forEach(s -> System.out.println(s));

        System.out.println("-------------------------------");

        System.out.println("Second Parallel stream:");
        spells.parallelStream().forEach(s -> System.out.println(s));
        
        // Notice that although the same spells are printed for each of the streams, they are
        // printed in a different order.
    }

   
}
