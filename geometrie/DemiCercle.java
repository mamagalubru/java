public class DemiCercle extends Cercle {
    public DemiCercle(float rayon) { super(rayon); }
    public float surface() { return super.surface() / 2;}
    public float perimetre() { return ((super.perimetre() / 2) + (rayon * 2));}
}