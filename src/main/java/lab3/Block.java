package lab3;

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

}
