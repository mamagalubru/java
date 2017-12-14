public class Cercle {
    static float pi = 3.1416f; 
    float rayon;
    public Cercle(float rayon) { this.rayon = rayon; }
    public float surface() { return rayon * rayon * pi;}
    public float perimetre() { return 2 * rayon * pi;}
}