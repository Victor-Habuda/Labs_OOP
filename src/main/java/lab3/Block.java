package lab3;

import java.util.Objects;

public class Block {
    protected int id;
    protected String type;
    protected String texture;
    protected boolean isSolid;
    protected boolean isInteractable;

    public Block(int id, String type, String texture, boolean isSolid, boolean isInteractable){
        this.id = id;
        this.type = type;
        this.texture = texture;
        this.isSolid = isSolid;
        this.isInteractable = isInteractable;
    }

    public int getId() {
        return id;
    }
    public String getType(){
        return type;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Block block = (Block) o;
        return id == block.id &&
                isSolid == block.isSolid &&
                isInteractable == block.isInteractable &&
                Objects.equals(type, block.type) &&
                Objects.equals(texture, block.texture);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, texture, isSolid, isInteractable);
    }
}
