package book_04_strings_arrays_and_collections.chapter_06_using_bulk_data_operations_with_collections.part_01_sequential_streams;

public class Spell {
    public String name;
    public SpellType type;
    public String description;
    public double price;

    public enum SpellType {SPELL, CHARM, CURSE}

    public Spell(String name, SpellType type, String description) {
        this.name = name;
        this.type = type;
        this.description = description;
    }

    public Spell(String name, SpellType type, 
        String description, double price) {
        this(name, type, description);
        this.price = price;
    }

    @Override
    public String toString() {
        return name;
    }
}
