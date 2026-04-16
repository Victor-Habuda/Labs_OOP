package lab3;

import java.util.Arrays;
import java.util.Comparator;

public class Sorter {

    public Block[] sortByIdAsc(Block[] blocks) {
        if (blocks != null) {
            Arrays.sort(blocks, Comparator.comparingInt(Block::getId));
        }
        return blocks;
    }

    public Block[] sortByTypeDesc(Block[] blocks) {
        if (blocks != null) {
            Arrays.sort(blocks, Comparator.comparing(Block::getType).reversed());
        }
        return blocks;
    }

    public int findIndex(Block[] blocks, Block target) {
        if (blocks == null || target == null) {
            return -1;
        }

        for (int i = 0; i < blocks.length; i++) {
            if (blocks[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }
}