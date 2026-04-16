package lab3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class lab3Test {

    private Sorter sorter;
    private Block[] blocks;

    @BeforeEach
    void setUp() {
        sorter = new Sorter();
        blocks = new Block[] {
                new Block(10, "stair", "oak", true, false),
                new Block(5, "block", "stone", true, false),
                new Block(20, "slab", "iron", true, false)
        };
    }

    @Test
    void testSortByIdAscending() {
        sorter.sortByIdAsc(blocks);
        assertEquals(5, blocks[0].getId());
        assertEquals(10, blocks[1].getId());
        assertEquals(20, blocks[2].getId());
    }

    @Test
    void testSortByTypeDescending() {
        sorter.sortByTypeDesc(blocks);
        assertEquals("stair", blocks[0].getType());
        assertEquals("slab", blocks[1].getType());
        assertEquals("block", blocks[2].getType());
    }

    @Test
    void testFindIndexForIdenticalObject() {
        Block target = new Block(5, "block", "stone", true, false);
        int index = sorter.findIndex(blocks, target);
        assertEquals(1, index, "Має знайти об'єкт під індексом 1");
    }

    @Test
    void testFindIndexNotFound() {
        Block target = new Block(999, "none", "none", false, false);
        int index = sorter.findIndex(blocks, target);
        assertEquals(-1, index, "Має повернути -1, якщо об'єкт не знайдено");
    }
}