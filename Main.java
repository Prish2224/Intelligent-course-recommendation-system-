/** Entry point: creates the catalog, the engine and the UI, then starts the program. */
public class Main {
    public static void main(String[] args) {
        CourseCatalog catalog = new CourseCatalog();
        RecommendationEngine engine = new RecommendationEngine();
        new ConsoleUI(catalog, engine).start();
    }
}
